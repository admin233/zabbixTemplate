package com.block.zabbix.api;

public class ZabbixInterface {

	/**
	 * 1 - agent; 2 - SNMP; 3 - IPMI; 4 - JMX.
	 */
	private int type;

	/**
	 * 该接口是否在主机上用作默认接口。主机上只能有一种类型的接口作为默认设置。
	 * 0 - not default; 1 - default.
	 */
	private int main;

	/**
	 * 0 - DNS;1 - IP
	 */
	private int useip;

	/**
	 * 接口使用的IP地址。
	 * 如果通过DNS域名连接，可以设置为空。
	 */
	private String ip;

	/**
	 * 接口使用的DNS名称。
	 * 如果通过IP连接，可以设置为空。
	 */
	private String dns;

	/**
	 * 接口使用的端口号，可以包含用户宏。
	 */
	private String port;

	/**
	 * Additional object for interface. Required if interface 'type' is SNMP.
	 */
	private ZabbixInterfaceDetails details;

	public ZabbixInterface() {
		this.type = 1;
		this.main = 0;
		this.useip = 1;
		this.ip = "";
		this.dns = "";
		this.port="";
	}

	public int getType() {
		return type;
	}

	public ZabbixInterface setType(int type) {
		this.type = type;
		return this;
	}

	public int getMain() {
		return main;
	}

	public ZabbixInterface setMain(int main) {
		this.main = main;
		return this;
	}

	public int getUseip() {
		return useip;
	}

	public ZabbixInterface setUseip(int useip) {
		this.useip = useip;
		return this;
	}

	public String getIp() {
		return ip;
	}

	public ZabbixInterface setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public String getDns() {
		return dns;
	}

	public ZabbixInterface setDns(String dns) {
		this.dns = dns;
		return this;
	}

	public String getPort() {
		return port;
	}

	public ZabbixInterface setPort(String port) {
		this.port = port;
		return this;
	}

	public ZabbixInterfaceDetails getDetails() {
		return details;
	}

	public ZabbixInterface setDetails(ZabbixInterfaceDetails details) {
		this.details = details;
		return this;
	}

}
