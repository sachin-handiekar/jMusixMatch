package org.jmusixmatch.entity.error;

import com.google.gson.annotations.SerializedName;

import org.jmusixmatch.entity.Header;

public class ErrorMessageContainer {
	@SerializedName("body")
	private String body;

	@SerializedName("header")
	private Header header;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}
}
