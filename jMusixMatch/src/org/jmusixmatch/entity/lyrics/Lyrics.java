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
package org.jmusixmatch.entity.lyrics;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote the lyrics entity.
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
public class Lyrics {

    @SerializedName("lyrics_id")
    private int lyricsId;

    @SerializedName("lyrics_body")
    private String lyricsBody;

    @SerializedName("lyrics_language")
    private String lyricsLanguage;

    @SerializedName("script_tracking_url")
    private String scriptTrackingURL;

    @SerializedName("pixel_tracking_url")
    private String pixelTrackingURL;

    @SerializedName("lyrics_copyright")
    private String lyricsCopyright;

    /**
     * @return the lyricsBody
     */
    public String getLyricsBody() {
        return lyricsBody;
    }

    /**
     * @param lyricsBody
     *            the lyricsBody to set
     */
    public void setLyricsBody(String lyricsBody) {
        this.lyricsBody = lyricsBody;
    }

    /**
     * @return the lyricsLang
     */
    public String getLyricsLang() {
        return lyricsLanguage;
    }

    /**
     * @param lyricsLang
     *            the lyricsLang to set
     */
    public void setLyricsLang(String lyricsLang) {
        this.lyricsLanguage = lyricsLang;
    }

    /**
     * @return the scriptTrackingURL
     */
    public String getScriptTrackingURL() {
        return scriptTrackingURL;
    }

    /**
     * @param scriptTrackingURL
     *            the scriptTrackingURL to set
     */
    public void setScriptTrackingURL(String scriptTrackingURL) {
        this.scriptTrackingURL = scriptTrackingURL;
    }

    /**
     * @return the pixelTrackingURL
     */
    public String getPixelTrackingURL() {
        return pixelTrackingURL;
    }

    /**
     * @param pixelTrackingURL
     *            the pixelTrackingURL to set
     */
    public void setPixelTrackingURL(String pixelTrackingURL) {
        this.pixelTrackingURL = pixelTrackingURL;
    }

    /**
     * @return the lyricsCopyright
     */
    public String getLyricsCopyright() {
        return lyricsCopyright;
    }

    /**
     * @param lyricsCopyright
     *            the lyricsCopyright to set
     */
    public void setLyricsCopyright(String lyricsCopyright) {
        this.lyricsCopyright = lyricsCopyright;
    }

    /**
     * @param lyricsId
     *            the lyricsId to set
     */
    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    /**
     * @return the lyricsId
     */
    public int getLyricsId() {
        return lyricsId;
    }

}
