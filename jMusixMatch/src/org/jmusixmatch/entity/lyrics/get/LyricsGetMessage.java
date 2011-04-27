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
package org.jmusixmatch.entity.lyrics.get;

import com.google.gson.annotations.SerializedName;

public class LyricsGetMessage {

    @SerializedName("message")
    private LyricsGetContainer container;

    /**
     * @param container the container to set
     */
    public void setContainer(LyricsGetContainer container) {
        this.container = container;
    }

    /**
     * @return the container
     */
    public LyricsGetContainer getContainer() {
        return container;
    }

}
