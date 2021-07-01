package com.block.zabbix.pojo;

public class ZabbixRightDTO {

    /**
     * 主机组的ID。
     */
    private String id;

    /**
     * 访问到主机组的级别：
     * 0 - 拒绝访问;
     * 2 - 只读访问;
     * 3 - 读写访问。
     */
    private String permission;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
