package org.jmusixmatch.entity.track;

import com.google.gson.annotations.SerializedName;

public class TrackData {

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

    /**
     * A album_coverart_100x100 identifier.
     */
    @SerializedName("album_coverart_100x100")
    private String coverArt;

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
     * A identifier for the track Name.
     */
    @SerializedName("track_name")
    private String trackName;

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

    public String getCoverArt() {
        return coverArt;
    }

    public void setCoverArt(String coverArt) {
        this.coverArt = coverArt;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
