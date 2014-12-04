package org.jmusixmatch.entity.track;

import com.google.gson.annotations.SerializedName;

public class TrackData {

    /**
     * A track identifier in musiXmatch catalog.
     */
    @SerializedName("track_id")
    private int trackId;

    /**
     * A MusicBrainz track identifier.
     */
    @SerializedName("track_mbid")
    private String trackMbid;

    /**
     * A Spotify track identifier
     */
    @SerializedName("track_spotify_id")
    private String track_spotify_id;

    /**
     * A Soundcloud track identifier
     */
    @SerializedName("track_soundcloud_id")
    private int track_soundcloud_id;

   /**
     * A track rating on musixMatch
     */
    @SerializedName("track_rating")
    private int track_rating;

    /**
     * The length of the track 
     */
    @SerializedName("track_length")
    private int track_length;

    
    @SerializedName("commontrack_id")
    private int commontrack_id;

    /**
     * Whether the track contains explicit lyrics
     */
    @SerializedName("explicit")
    private int explicit;

    /**
     * Whether the track has lyrics
     */
    @SerializedName("has_lyrics")
    private int has_lyrics;

    /**
     * Whether the track has subtitles
     */
    @SerializedName("has_subtitles")
    private int has_subtitles;

     /**
     * Amount of favourites
     */
    @SerializedName("num_favourite")
    private int num_favourite;

    
    /**
     * A album_coverart_100x100 identifier.
     */
    @SerializedName("album_coverart_100x100")
    private String album_coverart_100x100;

    /**
     * A album_coverart_350x350 identifier.
     */
    @SerializedName("album_coverart_350x350")
    private String album_coverart_350x350;
    
    /**
     * A album_coverart_500x500 identifier.
     */
    @SerializedName("album_coverart_500x500")
    private String album_coverart_500x500;

    /**
     * A album_coverart_800x800 identifier.
     */
    @SerializedName("album_coverart_800x800")
    private String album_coverart_800x800;

    @SerializedName("track_edit_url")
    private String track_edit_url;

    @SerializedName("updated_time")
    private String updated_time;

    /**
     * A album_id identifier.
     */
    @SerializedName("album_id")
    private int albumId;

    /**
     * A album_name identifier.
     */
    @SerializedName("album_name")
    private String albumName;

    /**
     * An artist identifier in musiXmatch catalog.
     */
    @SerializedName("artist_id")
    private String artistId;

    /**
     * A MusicBrainz artist identifier.
     */
    @SerializedName("artist_mbid")
    private String artistMbid;

    /**
     * A identifier for the artist name.
     */
    @SerializedName("artist_name")
    private String artistName;


    @SerializedName("track_share_url")
    private String track_share_url;

    /**
     * A instrumental identifier.
     */
    @SerializedName("instrumental")
    private int instrumental;

    /**
     * A lyrics identifier.
     */
    @SerializedName("lyrics_id")
    private int lyricsId;

    /**
     * A lyrics-length identifier.
     */
    @SerializedName("lyrics_length")
    private int lyricsLength;

    /**
     * A subtitle_id identifier.
     */
    @SerializedName("subtitle_id")
    private int subtitleId;

    /**
     * A identifier for the track Name.
     */
    @SerializedName("track_name")
    private String trackName;

     public String getTrack_spotify_id() {
        return track_spotify_id;
    }

    public void setTrack_spotify_id(String track_spotify_id) {
        this.track_spotify_id = track_spotify_id;
    }

    public int getTrack_soundcloud_id() {
        return track_soundcloud_id;
    }

    public void setTrack_soundcloud_id(int track_soundcloud_id) {
        this.track_soundcloud_id = track_soundcloud_id;
    }

    public int getTrack_rating() {
        return track_rating;
    }

    public void setTrack_rating(int track_rating) {
        this.track_rating = track_rating;
    }

    public int getTrack_length() {
        return track_length;
    }

    public void setTrack_length(int track_length) {
        this.track_length = track_length;
    }

    public int getCommontrack_id() {
        return commontrack_id;
    }

    public void setCommontrack_id(int commontrack_id) {
        this.commontrack_id = commontrack_id;
    }

    public int getExplicit() {
        return explicit;
    }

    public void setExplicit(int explicit) {
        this.explicit = explicit;
    }

    public int getHas_lyrics() {
        return has_lyrics;
    }

    public void setHas_lyrics(int has_lyrics) {
        this.has_lyrics = has_lyrics;
    }

    public int getHas_subtitles() {
        return has_subtitles;
    }

    public void setHas_subtitles(int has_subtitles) {
        this.has_subtitles = has_subtitles;
    }

    public int getNum_favourite() {
        return num_favourite;
    }

    public void setNum_favourite(int num_favourite) {
        this.num_favourite = num_favourite;
    }

    public String getAlbum_coverart_100x100() {
        return album_coverart_100x100;
    }

    public void setAlbum_coverart_100x100(String album_coverart_100x100) {
        this.album_coverart_100x100 = album_coverart_100x100;
    }

    public String getAlbum_coverart_350x350() {
        return album_coverart_350x350;
    }

    public void setAlbum_coverart_350x350(String album_coverart_350x350) {
        this.album_coverart_350x350 = album_coverart_350x350;
    }

    public String getAlbum_coverart_500x500() {
        return album_coverart_500x500;
    }

    public void setAlbum_coverart_500x500(String album_coverart_500x500) {
        this.album_coverart_500x500 = album_coverart_500x500;
    }

    public String getAlbum_coverart_800x800() {
        return album_coverart_800x800;
    }

    public void setAlbum_coverart_800x800(String album_coverart_800x800) {
        this.album_coverart_800x800 = album_coverart_800x800;
    }

    public String getTrack_edit_url() {
        return track_edit_url;
    }

    public void setTrack_edit_url(String track_edit_url) {
        this.track_edit_url = track_edit_url;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public String getTrack_share_url() {
        return track_share_url;
    }

    public void setTrack_share_url(String track_share_url) {
        this.track_share_url = track_share_url;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackMbid() {
        return trackMbid;
    }

    public void setTrackMbid(String trackMbid) {
        this.trackMbid = trackMbid;
    }

    public int getLyricsLength() {
        return lyricsLength;
    }

    public void setLyricsLength(int lyricsLength) {
        this.lyricsLength = lyricsLength;
    }

    public int getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(int instrumental) {
        this.instrumental = instrumental;
    }

    public int getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistMbid() {
        return artistMbid;
    }

    public void setArtistMbid(String artistMbid) {
        this.artistMbid = artistMbid;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(int subtitleId) {
        this.subtitleId = subtitleId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }


    public String getTrackShareURL() {
        return track_share_url;
    }

    public void setTrackShareURL(String newURL) {
        this.track_share_url = newURL;
    }

   

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
