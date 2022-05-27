package com.block.zabbix.response;

import java.util.List;

public class ZabbixMacroGenericResponse {

	private List<String> hostmacroids;
	private List<String> globalmacroids;

	public List<String> getHostmacroids() {
		return hostmacroids;
	}

	public void setHostmacroids(List<String> hostmacroids) {
		this.hostmacroids = hostmacroids;
	}

	public List<String> getGlobalmacroids() {
		return globalmacroids;
	}

	public void setGlobalmacroids(List<String> globalmacroids) {
		this.globalmacroids = globalmacroids;
	}
}
