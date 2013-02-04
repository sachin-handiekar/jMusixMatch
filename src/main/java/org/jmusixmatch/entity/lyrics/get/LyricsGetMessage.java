package org.jmusixmatch.entity.lyrics.get;

import com.google.gson.annotations.SerializedName;

public class LyricsGetMessage {
    @SerializedName("message")
    private LyricsGetContainer container;

    public void setContainer(LyricsGetContainer container) {
        this.container = container;
    }

    public LyricsGetContainer getContainer() {
        return container;
    }
}
