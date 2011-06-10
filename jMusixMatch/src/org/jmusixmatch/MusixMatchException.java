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

/**
 * A custom exception for the MusixMatch.
 * 
 * @author Sachin Handiekar
 * @version 1.0
 */
@SuppressWarnings("serial")
public class MusixMatchException extends Exception {

    /**
     * Constructs a new exception with the specified message.
     * 
     * @param message
     *            the reason for the exception
     */
    public MusixMatchException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified message and wrapped
     * exception.
     * 
     * @param message
     *            the reason for the exception
     * @param cause
     *            the internal exception that caused this exception
     */
    public MusixMatchException(String message, Throwable cause) {
        super(message, cause);
    }

}
