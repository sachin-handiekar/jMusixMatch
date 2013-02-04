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
