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
package org.jmusixmatch.entity;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote the Header part of the JSON body.
 * 
 * The Header contains the following elements : 
 * 1. status_code 
 * 2. execute_time
 * 3. available
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
public class Header {

    @SerializedName("status_code")
    private int status_code;

    @SerializedName("execute_time")
    private float execute_time;

    @SerializedName("available")
    private int available;

    /**
     * @return the status_code
     */
    public int getStatus_code() {
        return status_code;
    }

    /**
     * @param status_code
     *            the status_code to set
     */
    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    /**
     * @return the execute_time
     */
    public float getExecute_time() {
        return execute_time;
    }

    /**
     * @param execute_time
     *            the execute_time to set
     */
    public void setExecute_time(float execute_time) {
        this.execute_time = execute_time;
    }

    /**
     * @return the available
     */
    public int getAvailable() {
        return available;
    }

    /**
     * @param available
     *            the available to set
     */
    public void setAvailable(int available) {
        this.available = available;
    }

    public String toString() {
        return status_code + " : " + execute_time;

    }
}
