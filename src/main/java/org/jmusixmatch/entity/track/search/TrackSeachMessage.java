package org.jmusixmatch.entity.track.search;

import com.google.gson.annotations.SerializedName;

public class TrackSeachMessage {
	
    @SerializedName("message")
    private TrackSearchContainer trackMessage;

    public void setTrackMessage(TrackSearchContainer trackMessage) {
        this.trackMessage = trackMessage;
    }

    public TrackSearchContainer getTrackMessage() {
        return trackMessage;
    }
}
