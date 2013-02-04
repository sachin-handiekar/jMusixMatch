package org.jmusixmatch.http;

import org.jmusixmatch.MusixMatchException;
import org.jmusixmatch.config.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.MalformedURLException;
import java.net.URL;

public class MusixMatchRequest {

	public static String sendRequest(String requestString)
			throws MusixMatchException {
		StringBuffer buffer = new StringBuffer();

		try {

			String apiUrl = Constants.API_URL + Constants.API_VERSION
					+ Constants.URL_DELIM + requestString;

			URL url = new URL(apiUrl);

			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream(), "UTF-8"));
			String str;

			while ((str = in.readLine()) != null) {
				buffer.append(str);
			}

			in.close();
		} catch (MalformedURLException e) {
			throw new MusixMatchException(e.getMessage());
		} catch (IOException e) {
			throw new MusixMatchException(e.getMessage());
		}

		return buffer.toString();
	}
}
