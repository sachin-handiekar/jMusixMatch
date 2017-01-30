package org.jmusixmatch.entity.track;

import com.google.gson.annotations.SerializedName;

public class MusicGenre {
    @SerializedName("music_genre_id")

    private Integer musicGenreId;
    @SerializedName("music_genre_parent_id")

    private Integer musicGenreParentId;
    @SerializedName("music_genre_name")

    private String musicGenreName;
    @SerializedName("music_genre_name_extended")

    private String musicGenreNameExtended;
    @SerializedName("music_genre_vanity")

    private String musicGenreVanity;

    public Integer getMusicGenreId() {
        return musicGenreId;
    }

    public void setMusicGenreId(Integer musicGenreId) {
        this.musicGenreId = musicGenreId;
    }

    public Integer getMusicGenreParentId() {
        return musicGenreParentId;
    }

    public void setMusicGenreParentId(Integer musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
    }

    public String getMusicGenreName() {
        return musicGenreName;
    }

    public void setMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
    }

    public String getMusicGenreNameExtended() {
        return musicGenreNameExtended;
    }

    public void setMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
    }

    public String getMusicGenreVanity() {
        return musicGenreVanity;
    }

    public void setMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
    }
}
