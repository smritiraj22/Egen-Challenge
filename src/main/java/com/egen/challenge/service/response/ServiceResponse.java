package com.egen.challenge.service.response;

/**
 * @author Smriti
 * This class returns the response of the service
 *
 */
public class ServiceResponse {
    private String message;
    private int status;


    public ServiceResponse() {
    }

    /**
     *
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return status
     */
    public int getStatus() {
        return this.status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

}
