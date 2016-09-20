/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author sax
 */
public class ModelCaesar {
    private String message = "Text Message";

    /**
     * Get the value of message
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the value of message
     *
     * @param message new value of message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
    public void encrypt(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<message.length();i++)
            sb.append((char)((int)message.charAt(i)+1));
        message = sb.toString();
    }
    
    public void decrypt(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<message.length();i++)
            sb.append((char)((int)message.charAt(i)-1));
        message = sb.toString();
    }
}
