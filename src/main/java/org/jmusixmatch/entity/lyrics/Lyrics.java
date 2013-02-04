package org.jmusixmatch.entity.lyrics;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote the lyrics entity.
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
public class Lyrics {
	@SerializedName("lyrics_body")
	private String lyricsBody;
	
	@SerializedName("lyrics_copyright")
	private String lyricsCopyright;
	
	@SerializedName("lyrics_id")
	private int lyricsId;
	
	@SerializedName("lyrics_language")
	private String lyricsLanguage;
	
	@SerializedName("pixel_tracking_url")
	private String pixelTrackingURL;
	
	@SerializedName("script_tracking_url")
	private String scriptTrackingURL;

	public String getLyricsBody() {
		return lyricsBody;
	}

	public void setLyricsBody(String lyricsBody) {
		this.lyricsBody = lyricsBody;
	}

	public String getLyricsLang() {
		return lyricsLanguage;
	}

	public void setLyricsLang(String lyricsLang) {
		this.lyricsLanguage = lyricsLang;
	}

	public String getScriptTrackingURL() {
		return scriptTrackingURL;
	}

	public void setScriptTrackingURL(String scriptTrackingURL) {
		this.scriptTrackingURL = scriptTrackingURL;
	}

	public String getPixelTrackingURL() {
		return pixelTrackingURL;
	}

	public void setPixelTrackingURL(String pixelTrackingURL) {
		this.pixelTrackingURL = pixelTrackingURL;
	}

	public String getLyricsCopyright() {
		return lyricsCopyright;
	}

	public void setLyricsCopyright(String lyricsCopyright) {
		this.lyricsCopyright = lyricsCopyright;
	}

	public void setLyricsId(int lyricsId) {
		this.lyricsId = lyricsId;
	}

	public int getLyricsId() {
		return lyricsId;
	}
}
