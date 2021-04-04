package org.jmusixmatch.entity.error;

import java.util.List;

import org.jmusixmatch.entity.Header;

import com.google.gson.annotations.SerializedName;

public class ErrorMessageContainer {
	@SerializedName("body")
	private List<String> body;

	@SerializedName("header")
	private Header header;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public void setBody(List<String> body) {
		this.body = body;
	}

	public List<String> getBody() {
		return body;
	}
}
