package org.jmusixmatch.config;

/**
 * A class to hold the API methods.
 *
 * @author Sachin Handiekar
 * @version 1.0
 */
public final class Methods {

    /**
     * Get an album from our database: name, release_date, release_type, cover
     * art.
     */
    public static final String ALBUM_GET = "album.get";

    /**
     * Get the list of all the tracks of an album.
     */
    public static final String ALBUM_TRACKS_GET = "album.tracks.get";

    /**
     * Get the discography of an artist.
     */
    public static final String ARTIST_ALBUMS_GET = "artist.albums.get";

    /**
     * This api provides you the list of the top artists of a given country.
     */
    public static final String ARTIST_CHART_GET = "artist.chart.get";

    /**
     * Get the artist data from our database.
     */
    public static final String ARTIST_GET = "artist.get";

    /**
     * Search for artists in our database.
     */
    public static final String ARTIST_SEARCH = "artist.search";

    /**
     * Match your track against our database.
     */
    public static final String MATCHER_TRACK_GET = "matcher.track.get";

    /**
     * With this api you'll be able to get the base url for the tracking script
     * you need to insert in your page to legalize your existent lyrics library.
     */
    public static final String TRACKING_URL_GET = "tracking.url.get";

    /**
     * This api provides you the list of the top tracks of the supported
     * countries.
     */
    public static final String TRACK_CHART_GET = "track.chart.get";

    /**
     * Get a track info from our database: title, artist, instrumental flag and
     * cover art.
     */
    public static final String TRACK_GET = "track.get";

    /**
     * This API method provides you the opportunity to help us improving our
     * catalogue. (v1.1)
     */
    public static final String TRACK_LYRICS_FEEDBACK_POST =
        "track.lyrics.feedback.post";

    /**
     * Retrieve the lyrics of a track.
     */
    public static final String TRACK_LYRICS_GET = "track.lyrics.get";

    /**
     * Retrieve the lyric snippet of a track.
     */
    public static final String TRACK_SNIPPET_GET = "track.snippet.get";

    /**
     * Retrieve the subtitle of a track.
     */
    public static final String TRACK_SUBTITLE_GET = "track.subtitle.get";

    /**
     * Search for a track in our database.
     */
    public static final String TRACK_SEARCH = "track.search";

    /**
     * Retrieve the subtitle of a track.
     */
    public static final String TRACK_SUBTITLE = "track.subtitle.get";
}
