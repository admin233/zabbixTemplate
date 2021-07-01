package com.block.zabbix.response;

import com.block.zabbix.pojo.ZabbixUserMedia;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ZabbixUserGetResponse {

    @JsonProperty("userid")
    public String userid;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("name")
    public String name;
    @JsonProperty("surname")
    public String surname;
    @JsonProperty("url")
    public String url;
    @JsonProperty("autologin")
    public String autologin;
    @JsonProperty("autologout")
    public String autologout;
    @JsonProperty("lang")
    public String lang;
    @JsonProperty("refresh")
    public String refresh;
    @JsonProperty("type")
    public String type;
    @JsonProperty("theme")
    public String theme;
    @JsonProperty("attempt_failed")
    public String attemptFailed;
    @JsonProperty("attempt_ip")
    public String attemptIp;
    @JsonProperty("attempt_clock")
    public String attemptClock;
    @JsonProperty("rows_per_page")
    public String rowsPerPage;
    @JsonProperty("medias")
    public List<ZabbixUserMedia<Object>> medias;
    @JsonProperty("usrgrps")
    public List<ZabbixUserGroupGetResponse> usrgrps;
    @JsonProperty("mediatypes")
    public List<ZabbixMediaTypeGetResponse> mediatypes;

}
