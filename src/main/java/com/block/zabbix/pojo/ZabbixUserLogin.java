package com.block.zabbix.pojo;

public class ZabbixUserLogin {

	private String user;

	private String password;

	public ZabbixUserLogin(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

}
