package com.block.zabbix.request;

import com.block.zabbix.pojo.ZabbixMacro;
import com.block.zabbix.pojo.ZabbixTag;
import com.block.zabbix.pojo.ZabbixTemplateId;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixHostUpdateRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixHostUpdateRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixHostUpdateRequest setHostid(String hostid) {
		this.params.put("hostid", hostid);
		return this;
	}

	public ZabbixHostUpdateRequest setStatus(int status) {
		this.params.put("status", status);
		return this;
	}

	public ZabbixHostUpdateRequest setInventoryMode(int inventoryMode) {
		this.params.put("inventory_mode", inventoryMode);
		return this;
	}

	public ZabbixHostUpdateRequest setInventoryLocation(String location) {
		Map<String, String> inventory = new HashMap<>(1);
		inventory.put("location", location);

		this.params.put("inventory", inventory);
		return this;
	}

	public ZabbixHostUpdateRequest clearTemplates(List<ZabbixTemplateId> templates) {
		this.params.put("templates_clear", templates);
		return this;
	}

	public ZabbixHostUpdateRequest setTemplates(List<ZabbixTemplateId> templates) {
		this.params.put("templates", templates);
		return this;
	}

	public ZabbixHostUpdateRequest setMacros(List<ZabbixMacro> macros) {
		this.params.put("macros", macros);
		return this;
	}

	public ZabbixHostUpdateRequest setTags(ZabbixTag tags) {
		this.params.put("tags", tags);
		return this;
	}
}
