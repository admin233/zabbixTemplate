package com.block.zabbix.response;

import com.block.zabbix.pojo.ZabbixGroupTagDTO;
import com.block.zabbix.pojo.ZabbixRightDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ZabbixUserGroupGetResponse {

    @JsonProperty("usrgrpid")
    public String usrgrpid;
    @JsonProperty("name")
    public String name;
    @JsonProperty("gui_access")
    public String guiAccess;
    @JsonProperty("users_status")
    public String usersStatus;
    @JsonProperty("debug_mode")
    public String debugMode;
    @JsonProperty("rights")
    public List<ZabbixRightDTO> rights;
    @JsonProperty("tagFilters")
    public List<ZabbixGroupTagDTO> tagFilters;
    @JsonProperty("users")
    public List<ZabbixUserGetResponse> users;
}
