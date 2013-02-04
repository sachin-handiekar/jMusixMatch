package org.jmusixmatch.entity.error;

import com.google.gson.annotations.SerializedName;

public class ErrorMessage {
    
    @SerializedName("message")
    private ErrorMessageContainer messageContainer;

    /**
     * @param messageContainer the messageContainer to set
     */
    public void setMessageContainer(ErrorMessageContainer messageContainer) {
        this.messageContainer = messageContainer;
    }

    /**
     * @return the messageContainer
     */
    public ErrorMessageContainer getMessageContainer() {
        return messageContainer;
    }
}
