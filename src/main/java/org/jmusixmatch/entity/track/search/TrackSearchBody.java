package org.jmusixmatch.entity.track.search;

import org.jmusixmatch.entity.track.Track;

import java.util.List;

/**
 * A class to denote the body part of the JSON.
 *
 * @author Sachin Handiekar
 * @version 1.0
 */
public class TrackSearchBody {
    private List<Track> track_list;

    public void setTrack_list(List<Track> track_list) {
        this.track_list = track_list;
    }

    public List<Track> getTrack_list() {
        return track_list;
    }
}
