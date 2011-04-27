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

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
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
     * <p>
     * Checks object for null and throw IllegalArgumentException if it is. In
     * case of error, attempts to log it.
     * </p>
     * 
     * @param name
     *            of the object, to be used in messages.
     * @param data
     *            Object to check
     * @param log
     *            logger to persist error data
     * @throws IllegalArgumentException
     *             when data parameter is null
     */
    public static void checkNull(Logger log, String name, Object data) {
        if (data == null) {
            throw logError(log, new IllegalArgumentException(name
                    + " should not be null."));
        }
    }

    /**
     * <p>
     * Checks string for being null or empty. In case of error, attempts to log
     * it.
     * </p>
     * 
     * @param log
     *            logger to persist error data
     * @param name
     *            of the string, to be used in messages.
     * @param data
     *            String to check
     * @throws IllegalArgumentException
     *             when data parameter is null or empty
     */
    public static void checkString(Logger log, String name, String data) {
        checkNull(log, name, data);
        if (data.trim().length() == 0) {
            throw logError(log, new IllegalArgumentException(name
                    + " should not be empty."));
        }
    }

    /**
     * <p>
     * This method used to log enter in method.
     * </p>
     * 
     * @param log
     *            logger to persist data
     * @param method
     *            name of the entered method
     * @param param
     *            the method parameter.
     */
    public static void logEnter(Logger log, String method, Object param) {
        if (log != null) {
            param = param == null ? "" : "with parameter {" + param + "}";
            log.log(Level.DEBUG, "Enter method {" + method + "} " + param);
        }
    }

    /**
     * <p>
     * This method used to log leave of method. It will persist method name.
     * </p>
     * 
     * @param log
     *            logger to persist data
     * @param method
     *            name of the leaved method
     * @param returnObject
     *            the returned object
     */
    public static void logExit(Logger log, String method, Object returnObject) {
        if (log != null) {
            String message = returnObject == null ? "" : " with return value {"
                    + returnObject + "}";
            log.log(Level.DEBUG, "Leave method {" + method + "}" + message);
        }
    }

    /**
     * <p>
     * This method used to log arbitrary error. It will persist error's data and
     * throw exception back.
     * </p>
     * 
     * @param log
     *            logger to persist data
     * @param error
     *            exception describing error
     * @param <T>
     *            type of Exception
     * @return the error
     */
    public static <T extends Throwable> T logError(Logger log, T error) {
        if (log != null) {
            // build the stack trace message.
            StringBuilder builder = new StringBuilder();
            builder.append("\n").append(error).append("\n");
            StackTraceElement[] traces = error.getStackTrace();
            for (StackTraceElement trace : traces) {
                builder.append("\t").append(trace.toString()).append("\n");
            }
            log.log(Level.ERROR,
                    "Error found: " + error.getMessage() + builder.toString());
        }
        return error;
    }

    /**
     * <p>
     * This method used to log some information.
     * </p>
     * 
     * @param log
     *            logger to persist data
     * @param info
     *            the information.
     */
    public static void logInfo(Logger log, String info) {
        if (log != null) {
            log.debug(info);
        }
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

    /**
     * This method is used to log the json header data.
     * 
     * @param log
     *            logger to persist data.
     * @param header
     *            json header to log.
     */
    public static void logHeader(Logger log, Header header) {
        logInfo(log, "Available      : " + header.getAvailable());
        logInfo(log, "Status Code    : " + header.getStatus_code());
        logInfo(log, "Execute Time   : " + header.getExecute_time());

    }

}
