package org.jmusixmatch;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Helper Utility Class
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
public final class Helper {

	/**
	 * Private constructor to prevent instantiation.
	 */
	private Helper() {

		// do nothing
	}

	/**
	 * This method is used to get a parameter string from the Map.
	 * 
	 * @param params
	 *            key-value parameters
	 * @return A String containing the url parameter.
	 * @throws MusixMatchException
	 */
	public static String getURLString(String methodName,
			Map<String, Object> params) throws MusixMatchException {
		String paramString = new String();

		paramString += methodName + "?";

		for (Map.Entry<String, Object> entry : params.entrySet()) {
			try {
				paramString += entry.getKey()
						+ "="
						+ URLEncoder.encode(entry.getValue().toString(),
								"UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new MusixMatchException("Problem encoding "
						+ entry.getValue(), e);
			}

			paramString += "&";
		}

		paramString = paramString.substring(0, paramString.length() - 1);

		return paramString;
	}
}
