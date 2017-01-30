package org.jmusixmatch.entity.track;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SecondaryGenres {
    @SerializedName("music_genre_list")
    private List<MusicGenreList> musicGenreList = null;

    public List<MusicGenreList> getMusicGenreList() {
        return musicGenreList;
    }

    public void setMusicGenreList(List<MusicGenreList> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

}
