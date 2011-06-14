/*******************************************************************************
 * Copyright (C) 2011  Sachin Handiekar
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.jmusixmatch;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import org.jmusixmatch.entity.Header;

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
