package org.jmusixmatch.subtitle;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote the subtitle entity.
 *
 * @author Ugur Kocak
 * @version 1.0
 */
public class Subtitle {

    @SerializedName("subtitle_id")
    private int subtitleId;

    @SerializedName("restricted")
    private int restricted;

    @SerializedName("subtitle_body")
    private String subtitleBody;

    @SerializedName("subtitle_language")
    private String subtitleLanguage;

    @SerializedName("pixel_tracking_url")
    private String pixelTrackingURL;

    @SerializedName("script_tracking_url")
    private String scriptTrackingURL;

    @SerializedName("html_tracking_url")
    private String htmlTrackingURL;

    public int getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(int subtitleId) {
        this.subtitleId = subtitleId;
    }

    public int getRestricted() {
        return restricted;
    }

    public void setRestricted(int restricted) {
        this.restricted = restricted;
    }

    public String getSubtitleBody() {
        return subtitleBody;
    }

    public void setSubtitleBody(String subtitleBody) {
        this.subtitleBody = subtitleBody;
    }

    public String getSubtitleLanguage() {
        return subtitleLanguage;
    }

    public void setSubtitleLanguage(String subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }

    public String getPixelTrackingURL() {
        return pixelTrackingURL;
    }

    public void setPixelTrackingURL(String pixelTrackingURL) {
        this.pixelTrackingURL = pixelTrackingURL;
    }

    public String getScriptTrackingURL() {
        return scriptTrackingURL;
    }

    public void setScriptTrackingURL(String scriptTrackingURL) {
        this.scriptTrackingURL = scriptTrackingURL;
    }

    public String getHtmlTrackingURL() {
        return htmlTrackingURL;
    }

    public void setHtmlTrackingURL(String htmlTrackingURL) {
        this.htmlTrackingURL = htmlTrackingURL;
    }
}
