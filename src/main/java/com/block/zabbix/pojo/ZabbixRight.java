package com.block.zabbix.pojo;

public class ZabbixRight {

    /**
     * 要添加权限的主机组的ID。
     */
    private String id;

    /**
     * 访问到主机组的级别：
     * 0 - 拒绝访问;
     * 2 - 只读访问;
     * 3 - 读写访问。
     */
    private int permission;

    public ZabbixRight(String id) {
        this.id = id;
        this.permission = 0;
    }

    public ZabbixRight(String id, int permission) {
        this.id = id;
        this.permission = permission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
}
