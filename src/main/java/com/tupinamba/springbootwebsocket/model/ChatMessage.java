package com.tupinamba.springbootwebsocket.model;

public class ChatMessage {
    private String content;       // Message content for chat
    private String sender;        // Sender's username
    private String receiver;      // Optional: Target user for direct messages
    private MessageType type;     // Message type (CHAT, LEAVE, JOIN, etc.)
    private CallType callType;    // Optional: For video/voice call notifications

    public enum MessageType {
        CHAT, LEAVE, JOIN, CALL_NOTIFICATION
    }

    public enum CallType {
        VIDEO, VOICE
    }

    // Getters and Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public CallType getCallType() {
        return callType;
    }

    public void setCallType(CallType callType) {
        this.callType = callType;
    }
}
