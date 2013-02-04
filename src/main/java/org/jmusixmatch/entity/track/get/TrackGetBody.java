package org.jmusixmatch.entity.track.get;

import com.google.gson.annotations.SerializedName;

import org.jmusixmatch.entity.track.TrackData;

/**
 * A class to denote the body part of the JSON.
 *
 * @author Sachin Handiekar
 * @version 1.0
 */
public class TrackGetBody {
    @SerializedName("track")
    private TrackData track;

    public void setTrack(TrackData track) {
        this.track = track;
    }

    public TrackData getTrack() {
        return track;
    }
}
