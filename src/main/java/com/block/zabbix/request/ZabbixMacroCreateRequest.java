package com.block.zabbix.request;


import java.util.HashMap;
import java.util.Map;

public class ZabbixMacroCreateRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixMacroCreateRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public Object getFileld(String fieldName){
		return this.params.get(fieldName);
	}

	public String getFileldString(String fieldName){
		return String.valueOf(this.params.get(fieldName));
	}

	public ZabbixMacroCreateRequest setHostid(String hostid) {
		return addField("hostid", hostid);
	}

	public ZabbixMacroCreateRequest setMacro(String macro) {
		return addField("macro",macro);
	}

	public ZabbixMacroCreateRequest setValue(String value) {
		return addField("value", value);
	}

	public ZabbixMacroCreateRequest setDescription(String description) {
		return addField("description", description);
	}

}
