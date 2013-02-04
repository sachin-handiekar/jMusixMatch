package org.jmusixmatch.entity.track;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote the track entity.
 *
 * @author Sachin Handiekar
 * @version 1.0
 */
public class Track {
    @SerializedName("track")
    private TrackData track;

    public void setTrack(TrackData track) {
        this.track = track;
    }

    public TrackData getTrack() {
        return track;
    }
}
