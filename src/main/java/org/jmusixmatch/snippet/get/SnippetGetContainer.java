package org.jmusixmatch.snippet.get;

import com.google.gson.annotations.SerializedName;
import org.jmusixmatch.entity.Header;

public class SnippetGetContainer {

    @SerializedName("body")
    private SnippetGetBody body;

    @SerializedName("header")
    private Header header;

    public SnippetGetBody getBody() {
        return body;
    }

    public void setBody(SnippetGetBody body) {
        this.body = body;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }
}
