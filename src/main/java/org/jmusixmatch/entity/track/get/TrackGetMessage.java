package org.jmusixmatch.entity.track.get;

import com.google.gson.annotations.SerializedName;

public class TrackGetMessage {



	@SerializedName("message")
	private TrackGetContainer trackMessage;

	public void setTrackMessage(TrackGetContainer trackMessage) {
		this.trackMessage = trackMessage;
	}

	public TrackGetContainer getTrackMessage() {
		return trackMessage;
	}

}
