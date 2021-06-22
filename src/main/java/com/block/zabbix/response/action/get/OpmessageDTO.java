package com.block.zabbix.response.action.get;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 动作操作消息
 * 操作消息对象包含有关将由操作发送的消息的数据。
 */
public class OpmessageDTO {
    /**
     * 是否使用默认动作消息文本和主题。
     *
     * 可能的值:
     * 0 - (default) 使用操作中的消息文本和主题
     * 1 - 使用动作中的消息文本和主题
     */
    @JsonProperty("default_msg")
    public String defaultMsg;
    /**
     * 操作消息主题。
     */
    @JsonProperty("subject")
    public String subject;
    /**
     * 操作消息文本。
     */
    @JsonProperty("message")
    public String message;
    /**
     * 将用于发送消息的媒体类型ID。
     */
    @JsonProperty("mediatypeid")
    public String mediatypeid;
}
