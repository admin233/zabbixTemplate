package com.block.zabbix.pojo.action;

/**
 * The operation message object contains data about the message that will be sent by the operation.
 */
public class ActionOperationMessage {
    /**
     * Whether to use the default action message text and subject.
     *
     * Possible values:
     * 0 - use the data from the operation;
     * 1 - (default) use the data from the media type.
     */
    int default_msg;
    /**
     * ID of the media type that will be used to send the message.
     */
    String mediatypeid;
    /**
     * Operation message text.
     */
    String message;
    /**
     * Operation message subject.
     */
    String subject;

    public ActionOperationMessage(int default_msg, String mediatypeid, String message, String subject) {
        this.default_msg = default_msg;
        this.mediatypeid = mediatypeid;
        this.message = message;
        this.subject = subject;
    }

    public int getDefault_msg() {
        return default_msg;
    }

    public void setDefault_msg(int default_msg) {
        this.default_msg = default_msg;
    }

    public String getMediatypeid() {
        return mediatypeid;
    }

    public void setMediatypeid(String mediatypeid) {
        this.mediatypeid = mediatypeid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
