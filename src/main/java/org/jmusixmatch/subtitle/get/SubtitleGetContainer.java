package org.jmusixmatch.subtitle.get;

import com.google.gson.annotations.SerializedName;
import org.jmusixmatch.entity.Header;

public class SubtitleGetContainer {

    @SerializedName("body")
    private SubtitleGetBody body;

    @SerializedName("header")
    private Header header;

    public SubtitleGetBody getBody() {
        return body;
    }

    public void setBody(SubtitleGetBody body) {
        this.body = body;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }
}
