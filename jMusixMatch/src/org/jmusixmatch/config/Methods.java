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
package org.jmusixmatch.config;

/**
 * A class to hold the API methods.
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
public final class Methods {

    /**
     * Search for a track in our database.
     */
    public static final String TRACK_SEARCH = "track.search";

    /**
     * Get a track info from our database: title, artist, instrumental flag and
     * cover art.
     */
    public static final String TRACK_GET = "track.get";

    /**
     * This api provides you the list of the top tracks of the supported
     * countries.
     */
    public static final String TRACK_CHART_GET = "track.chart.get";

    /**
     * Retrieve the subtitle of a track.
     */
    public static final String TRACK_SUBTITLE = "track.subtitle/get";

    /**
     * Retrieve the lyrics of a track.
     */
    public static final String TRACK_LYRICS_GET = "track.lyrics.get";

    /**
     * This API method provides you the opportunity to help us improving our
     * catalogue. (v1.1)
     */
    public static final String TRACK_LYRICS_FEEDBACK_POST = "track.lyrics.feedback.post";

    /**
     * Match your track against our database.
     */
    public static final String MATCHER_TRACK_GET = "matcher.track.get";

    /**
     * Get the artist data from our database.
     */
    public static final String ARTIST_GET = "artist.get";

    /**
     * Search for artists in our database.
     */
    public static final String ARTIST_SEARCH = "artist.search";

    /**
     * Get an album from our database: name, release_date, release_type, cover
     * art.
     */
    public static final String ALBUM_GET = "album.get";

    /**
     * With this api you’ll be able to get the base url for the tracking script
     * you need to insert in your page to legalize your existent lyrics library.
     */
    public static final String TRACKING_URL_GET = "tracking.url.get";

    /**
     * This api provides you the list of the top artists of a given country.
     */
    public static final String ARTIST_CHART_GET = "artist.chart.get";

}
