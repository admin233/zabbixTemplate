package com.block.zabbix.api;

public class ZabbixProxyInterface {

    /**
     * 	(readonly) 接口的ID
     */
    private String interfaceid;
    /**
     * 连接的DNS名称
     * 如果通过IP地址进行连接，可以为空
     */
    private String dns;
    /**
     * 	连接到IP地址
     * 如果通过DNS名称连接可以为空
     */
    private String ip;
    /**
     * 	连接端口号.
     */
    private String port;
    /**
     * 是否应该通过IP地址进行连接。
     * 可能的值：
     * 0 - 用DNS名称链接
     * 1 - 用IP地址连接
     */
    private String useip;
    /**
     * 	(只读) 接口所属的代理的ID。
     */
    private String hostid;

    public String getInterfaceid() {
        return interfaceid;
    }

    public void setInterfaceid(String interfaceid) {
        this.interfaceid = interfaceid;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUseip() {
        return useip;
    }

    public void setUseip(String useip) {
        this.useip = useip;
    }

    public String getHostid() {
        return hostid;
    }

    public void setHostid(String hostid) {
        this.hostid = hostid;
    }
}
