/*******************************************************************************
 * Copyright (C) 2011  Sachin Handiekar
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.jmusixmatch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jmusixmatch.config.Constants;
import org.jmusixmatch.config.Methods;
import org.jmusixmatch.config.StatusCode;
import org.jmusixmatch.entity.error.ErrorMessage;
import org.jmusixmatch.entity.lyrics.Lyrics;
import org.jmusixmatch.entity.lyrics.get.LyricsGetMessage;
import org.jmusixmatch.entity.track.Track;
import org.jmusixmatch.entity.track.TrackData;
import org.jmusixmatch.entity.track.get.TrackGetMessage;
import org.jmusixmatch.entity.track.search.TrackSeachMessage;

import org.jmusixmatch.http.MusixMatchRequest;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

public class MusixMatch {

    /**
     * A field to denote the logger.
     */
    private static final Logger LOGGER = Logger.getLogger(MusixMatch.class);

    /**
     * A field to denote the class name for logging purposes.
     */
    private static final String CLASS_NAME = MusixMatch.class.getName();

    /**
     * A musiXmatch API Key.
     */
    private final String apiKey;

    /**
     * MusixMatch Constructor with API-Key.
     * 
     * @param apiKey
     *            A musiXmatch API Key.
     */
    public MusixMatch(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * Get Lyrics for the specific trackID.
     * 
     * @param trackID
     * @return
     * @throws MusixMatchException
     */
    public Lyrics getLyrics(int trackID) throws MusixMatchException {
        Lyrics lyrics = null;

        String methodName = CLASS_NAME + ".getLyrics()";
        
        Helper.logEnter(LOGGER, methodName, null);
        
        LyricsGetMessage message = null;
        Map<String, Object> params = new HashMap<String, Object>();

        params.put(Constants.API_KEY, apiKey);
        params.put(Constants.TRACK_ID, new String("" + trackID));

        String response = null;

        response = MusixMatchRequest.sendRequest(Helper.getURLString(
                Methods.TRACK_LYRICS_GET, params));

        Gson gson = new Gson();
        try {
            message = gson.fromJson(response, LyricsGetMessage.class);
        } catch (JsonParseException jpe) {
            handleErrorResponse(response);
        }
        
        
        
        Helper.checkNull(LOGGER, "trackResponse", message);
        Helper.logHeader(LOGGER, message.getContainer().getHeader());

        lyrics = message.getContainer().getBody().getLyrics();
        Helper.logExit(LOGGER, methodName, lyrics);

        return lyrics;
    }

    /**
     * Search tracks using the given criteria.
     * 
     * @param q
     *            search into every available field
     *            (track_name,artist_name,lyrics)
     * @param q_artist
     *            search for text string among artist names
     * @param q_track
     *            search for text string among track names
     * @param page
     *            request specific result page
     * @param pageSize
     *            specify number of items per result page
     * @param f_has_lyrics
     *            specify number of items per result page
     * @return a list of tracks.
     * @throws MusixMatchException
     *             if any error occur
     */
    public List<Track> searchTracks(String q, String q_artist, String q_track,
            int page, int pageSize, boolean f_has_lyrics)
            throws MusixMatchException {
        List<Track> trackList = null;

        String methodName = CLASS_NAME + ".searchTracks()";
        Helper.logEnter(LOGGER, methodName, null);
        TrackSeachMessage message = null;
        Map<String, Object> params = new HashMap<String, Object>();

        params.put(Constants.API_KEY, apiKey);
        params.put(Constants.QUERY, q);
        params.put(Constants.QUERY_ARTIST, q_artist);
        params.put(Constants.QUERY_TRACK, q_track);
        params.put(Constants.PAGE, page);
        params.put(Constants.PAGE_SIZE, pageSize);

        if (f_has_lyrics)
            params.put(Constants.F_HAS_LYRICS, "1");
        else
            params.put(Constants.F_HAS_LYRICS, "0");

        String response = null;

        response = MusixMatchRequest.sendRequest(Helper.getURLString(
                Methods.TRACK_SEARCH, params));

        Gson gson = new Gson();

        try {
            message = gson.fromJson(response, TrackSeachMessage.class);
        } catch (JsonParseException jpe) {
            handleErrorResponse(response);
        }

        int statusCode = message.getTrackMessage().getHeader().getStatus_code();
        if (statusCode > 200) {
            throw new MusixMatchException("Status Code is not 200");
        }

        Helper.checkNull(LOGGER, "trackResponse", message);
        Helper.logHeader(LOGGER, message.getTrackMessage().getHeader());

        trackList = message.getTrackMessage().getBody().getTrack_list();

        Helper.logExit(LOGGER, methodName, trackList);

        return trackList;
    }

    /**
     * Get the track details using the specified trackId.
     * 
     * @param trackID
     *            track identifier in musiXmatch catalog
     * @return the track
     * @throws MusixMatchException
     */
    public Track getTrack(int trackID) throws MusixMatchException {
        Track track = new Track();

        String methodName = CLASS_NAME + ".getTrack()";
        Helper.logEnter(LOGGER, methodName, null);

        Map<String, Object> params = new HashMap<String, Object>();

        params.put(Constants.API_KEY, apiKey);
        params.put(Constants.TRACK_ID, new String("" + trackID));

        track = getTrackResponse(Methods.TRACK_GET, params);

        return track;
    }

    /**
     * Get the most matching track which was retrieved using the search.
     * 
     * @param q_track
     *            search for text string among track names
     * @param q_artist
     *            search for text string among artist names
     * @return the track
     * @throws MusixMatchException
     */
    public Track getMatchingTrack(String q_track, String q_artist)
            throws MusixMatchException {
        Track track = new Track();

        String methodName = CLASS_NAME + ".getMatchingTrack()";
        Helper.logEnter(LOGGER, methodName, null);

        Map<String, Object> params = new HashMap<String, Object>();

        params.put(Constants.API_KEY, apiKey);
        params.put(Constants.QUERY_TRACK, q_track);
        params.put(Constants.QUERY_ARTIST, q_artist);

        track = getTrackResponse(Methods.MATCHER_TRACK_GET, params);

        return track;
    }

    /**
     * Returns the track response which was returned through the query.
     * 
     * @param methodName
     *            the name of the API method.
     * @param params
     *            a map which contains the key-value pair
     * @return the track details.
     * @throws MusixMatchException
     *             if any error occurs.
     */
    private Track getTrackResponse(String methodName, Map<String, Object> params)
            throws MusixMatchException {
        Track track = new Track();
        String response = null;
        TrackGetMessage message = null;

        response = MusixMatchRequest.sendRequest(Helper.getURLString(
                methodName, params));

        Gson gson = new Gson();

        try {
            message = gson.fromJson(response, TrackGetMessage.class);
        } catch (JsonParseException jpe) {
            Helper.logError(LOGGER, jpe);
            handleErrorResponse(response);
        }

        Helper.checkNull(LOGGER, "trackResponse", message);
        Helper.logHeader(LOGGER, message.getTrackMessage().getHeader());

        TrackData data = message.getTrackMessage().getBody().getTrack();

        Helper.checkNull(LOGGER, "trackData", data);
        
        track.setTrack(data);
        Helper.logExit(LOGGER, methodName, track);

        return track;
    }

    /**
     * Handle the error response.
     * 
     * @param jsonResponse
     *            the jsonContent.
     * @throws MusixMatchException
     *             if any error occurs
     */
    private void handleErrorResponse(String jsonResponse)
            throws MusixMatchException {
        StatusCode statusCode;

        Gson gson = new Gson();
        ErrorMessage errMessage = gson.fromJson(jsonResponse,
                ErrorMessage.class);

        int responseCode = errMessage.getMessageContainer().getHeader()
                .getStatus_code();

        switch (responseCode) {
        case 400:
            statusCode = StatusCode.BAD_SYNTAX;
            break;
        case 401:
            statusCode = StatusCode.AUTH_FAILED;
            break;
        case 402:
            statusCode = StatusCode.LIMIT_REACHED;
            break;
        case 403:
            statusCode = StatusCode.NOT_AUTHORIZED;
            break;
        case 404:
            statusCode = StatusCode.RESOURCE_NOT_FOUND;
            break;
        case 405:
            statusCode = StatusCode.METHOD_NOT_FOUND;
            break;
        default:
            statusCode = StatusCode.ERROR;
            break;
        }

        throw new MusixMatchException(statusCode.getStatusMessage());

    }
}
