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
package org.jmusixmatch.entity.track.get;

import org.jmusixmatch.entity.Header;


import com.google.gson.annotations.SerializedName;

public class TrackGetContainer {
    
    @SerializedName("header")
    private Header header;

    @SerializedName("body")
    private TrackGetBody body;

    /**
     * @return the header
     */
    public Header getHeader() {
        return header;
    }

    /**
     * @param header
     *            the header to set
     */
    public void setHeader(Header header) {
        this.header = header;
    }

    /**
     * @return the body
     */
    public TrackGetBody getBody() {
        return body;
    }

    /**
     * @param body
     *            the body to set
     */
    public void setBody(TrackGetBody body) {
        this.body = body;
    }
}
