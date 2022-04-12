package com.block.zabbix.response;

import java.util.List;

public class ZabbixApplicationGetResponse {
	private String applicationid;
	/**
	 * ID of the host or tamplate that the application belongs to.
	 *
	 * Cannot be updated.
	 */
	private String hostid;
	private String name;
	/**
	 * (readonly) Origin of the application.
	 *
	 * Possible values:
	 * 0 - a plain application;
	 * 4 - a discovered application.
	 */
	private int flags;
	/**
	 * (readonly) IDs of the parent template applications.
	 */
	private List<String> templateids;

	public String getApplicationid() {
		return applicationid;
	}

	public void setApplicationid(String applicationid) {
		this.applicationid = applicationid;
	}

	public String getHostid() {
		return hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTemplateids() {
		return templateids;
	}

	public void setTemplateids(List<String> templateids) {
		this.templateids = templateids;
	}

	public int getFlags() {
		return flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}
}
