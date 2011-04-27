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
package org.jmusixmatch.config;

/**
 * A class to hold the status codes.
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
public class StatusCode {

    /**
     * Status Code - 200
     * 
     * The request was successful
     */
    public static final StatusCode REQ_SUCCESS = new StatusCode(200,
            "The request was successful.");

    /**
     * Status Code - 400
     * 
     * The request had bad syntax or was inherently impossible to be satisfied
     */
    public static final StatusCode BAD_SYNTAX = new StatusCode(400,
            "The request had bad syntax or was inherently impossible to be satisfied");

    /**
     * Status Code - 401
     * 
     * The request had bad syntax or was inherently impossible to be satisfied
     */
    public static final StatusCode AUTH_FAILED = new StatusCode(401,
            "The request had bad syntax or was inherently impossible to be satisfied");

    /**
     * Status Code - 402
     * 
     * a limit was reached, either you exceeded per hour requests limits or your
     * balance is insufficient.
     */
    public static final StatusCode LIMIT_REACHED = new StatusCode(
            402,
            "a limit was reached, either you exceeded per hour requests limits or your balance is insufficient.");

    /**
     * Status Code - 403
     * 
     * You are not authorized to perform this operation / the api version you’re
     * trying to use has been shut down.
     */
    public static final StatusCode NOT_AUTHORIZED = new StatusCode(
            403,
            "You are not authorized to perform this operation / the api version you’re trying to use has been shut down.");

    /**
     * Status Code - 404
     * 
     * requested resource was not found
     */
    public static final StatusCode RESOURCE_NOT_FOUND = new StatusCode(404,
            "requested resource was not found");

    /**
     * Status Code - 405
     * 
     * requested method was not found
     */
    public static final StatusCode METHOD_NOT_FOUND = new StatusCode(404,
            "requested method was not found");
    
    /**
     * An error which has not been defined in the API
     */
    public static final StatusCode ERROR = new StatusCode(999,
            "An error has occured while performing the query. Please contact the administrator.");

    private int statusCode;

    private String statusMessage;

    private StatusCode(int statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    /**
     * @return the statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * @return the statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

}
