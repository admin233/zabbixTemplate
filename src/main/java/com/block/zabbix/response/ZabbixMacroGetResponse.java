package com.block.zabbix.response;

import java.util.List;

public class ZabbixMacroGetResponse {


    public String globalmacroid;
    /**
     * hostmacroid
     */
    public String hostmacroid;
    /**
     * hostid
     */
    public String hostid;
    /**
     * macro
     */
    public String macro;
    /**
     * value
     */
    public String value;
    /**
     * description
     */
    public String description;
    /**
     * type
     */
    public String type;


    public String getGlobalmacroid() {
        return globalmacroid;
    }

    public void setGlobalmacroid(String globalmacroid) {
        this.globalmacroid = globalmacroid;
    }

    public String getHostmacroid() {
        return hostmacroid;
    }

    public void setHostmacroid(String hostmacroid) {
        this.hostmacroid = hostmacroid;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }

    public String getMacro() {
        return macro;
    }

    public void setMacro(String macro) {
        this.macro = macro;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
