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
package org.jmusixmatch.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
 
import org.jmusixmatch.Helper;
import org.jmusixmatch.MusixMatch;
import org.jmusixmatch.MusixMatchException;
import org.jmusixmatch.config.Constants;
import org.jmusixmatch.config.Methods;

public class MusixMatchRequest {
	 

	public static String sendRequest(String requestString)
			throws MusixMatchException {
		StringBuffer buffer = new StringBuffer();

		try {

			String apiUrl = Constants.API_URL + Constants.API_VERSION
					+ Constants.URL_DELIM + requestString;

			 

			URL url = new URL(apiUrl);

			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream()));
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
