package com.block.zabbix.response;

import java.util.List;

public class ZabbixUserGroupGenericResponse {

	private List<String> usrgrpids;

	public List<String> getUsrgrpids() {
		return usrgrpids;
	}

	public void setUsrgrpids(List<String> usrgrpids) {
		this.usrgrpids = usrgrpids;
	}
}
