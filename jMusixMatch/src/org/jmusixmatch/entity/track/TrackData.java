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
     * A lyrics-length identifier.
     */
    @SerializedName("lyrics_length")
    private int lyricsLength;

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
     * A identifier for the track Name.
     */
    @SerializedName("track_name")
    private String trackName;

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
     * A subtitle_id identifier.
     */
    @SerializedName("subtitle_id")
    private int subtitleId;

    /**
     * A album_id identifier.
     */
    @SerializedName("album_id")
    private int albumId;

    /**
     * A album_coverart_100x100 identifier.
     */
    @SerializedName("album_coverart_100x100")
    private String coverArt;

    /**
     * @return the trackId
     */
    public int getTrackId() {
        return trackId;
    }

    /**
     * @param trackId
     *            the trackId to set
     */
    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    /**
     * @return the trackMbid
     */
    public String getTrackMbid() {
        return trackMbid;
    }

    /**
     * @param trackMbid
     *            the trackMbid to set
     */
    public void setTrackMbid(String trackMbid) {
        this.trackMbid = trackMbid;
    }

    /**
     * @return the lyricsLength
     */
    public int getLyricsLength() {
        return lyricsLength;
    }

    /**
     * @param lyricsLength
     *            the lyricsLength to set
     */
    public void setLyricsLength(int lyricsLength) {
        this.lyricsLength = lyricsLength;
    }

    /**
     * @return the instrumental
     */
    public int getInstrumental() {
        return instrumental;
    }

    /**
     * @param instrumental
     *            the instrumental to set
     */
    public void setInstrumental(int instrumental) {
        this.instrumental = instrumental;
    }

    /**
     * @return the lyricsId
     */
    public int getLyricsId() {
        return lyricsId;
    }

    /**
     * @param lyricsId
     *            the lyricsId to set
     */
    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    /**
     * @return the trackName
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * @param trackName
     *            the trackName to set
     */
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    /**
     * @return the artistId
     */
    public String getArtistId() {
        return artistId;
    }

    /**
     * @param artistId
     *            the artistId to set
     */
    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    /**
     * @return the artistMbid
     */
    public String getArtistMbid() {
        return artistMbid;
    }

    /**
     * @param artistMbid
     *            the artistMbid to set
     */
    public void setArtistMbid(String artistMbid) {
        this.artistMbid = artistMbid;
    }

    /**
     * @return the artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @param artistName
     *            the artistName to set
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * @return the subtitleId
     */
    public int getSubtitleId() {
        return subtitleId;
    }

    /**
     * @param subtitleId
     *            the subtitleId to set
     */
    public void setSubtitleId(int subtitleId) {
        this.subtitleId = subtitleId;
    }

    /**
     * @return the albumId
     */
    public int getAlbumId() {
        return albumId;
    }

    /**
     * @param albumId
     *            the albumId to set
     */
    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    /**
     * @return the coverArt
     */
    public String getCoverArt() {
        return coverArt;
    }

    /**
     * @param coverArt
     *            the coverArt to set
     */
    public void setCoverArt(String coverArt) {
        this.coverArt = coverArt;
    }

    /**
     * @return the albumName
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * @param albumName
     *            the albumName to set
     */
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    /**
     * A album_name identifier.
     */
    @SerializedName("album_name")
    private String albumName;

}
