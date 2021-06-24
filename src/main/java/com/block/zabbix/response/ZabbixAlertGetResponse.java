package com.block.zabbix.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZabbixAlertGetResponse {

    @JsonProperty("alertid")
    public String alertid;
    @JsonProperty("actionid")
    public String actionid;
    @JsonProperty("eventid")
    public String eventid;
    @JsonProperty("userid")
    public String userid;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("mediatypeid")
    public String mediatypeid;
    @JsonProperty("sendto")
    public String sendto;
    @JsonProperty("subject")
    public String subject;
    @JsonProperty("message")
    public String message;
    @JsonProperty("status")
    public String status;
    @JsonProperty("retries")
    public String retries;
    @JsonProperty("error")
    public String error;
    @JsonProperty("esc_step")
    public String escStep;
    @JsonProperty("alerttype")
    public String alerttype;
    @JsonProperty("p_eventid")
    public String pEventid;
    @JsonProperty("acknowledgeid")
    public String acknowledgeid;

}
