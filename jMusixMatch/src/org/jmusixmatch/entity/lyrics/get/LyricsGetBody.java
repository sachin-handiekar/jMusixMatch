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

import org.jmusixmatch.entity.lyrics.Lyrics;

import com.google.gson.annotations.SerializedName;

public class LyricsGetBody {

    @SerializedName("lyrics")
    private Lyrics lyrics;

    /**
     * @param lyrics the lyrics to set
     */
    public void setLyrics(Lyrics lyrics) {
        this.lyrics = lyrics;
    }

    /**
     * @return the lyrics
     */
    public Lyrics getLyrics() {
        return lyrics;
    }

   

    
}
