package com.block.zabbix.response;

import java.util.List;

public class ZabbixUserGenericResponse {

	private List<String> userids;

	public List<String> getUserids() {
		return userids;
	}

	public void setUserids(List<String> userids) {
		this.userids = userids;
	}
}
