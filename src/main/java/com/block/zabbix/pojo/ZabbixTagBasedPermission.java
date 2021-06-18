package com.block.zabbix.pojo;

public class ZabbixTagBasedPermission {

    /**
     * ID of the host group to add permission to.
     */
    private String groupid;

    /**
     * Tag name.
     */
    private String tag;

    /**
     * Tag value.
     */
    private String value;

    public ZabbixTagBasedPermission(String groupid, String tag, String value) {
        this.groupid = groupid;
        this.tag = tag;
        this.value = value;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
