package com.block.zabbix.request;

import java.util.HashMap;
import java.util.Map;

public class ZabbixMacroUpdateRequest {

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixMacroUpdateRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public Object getFileld(String fieldName){
		return this.params.get(fieldName);
	}

	public String getFileldString(String fieldName){
		return String.valueOf(this.params.get(fieldName));
	}

	public ZabbixMacroUpdateRequest setHostmacroid(String hostmacroid) {
		return addField("hostmacroid", hostmacroid);
	}

	public ZabbixMacroUpdateRequest setGlobalmacroid(String globalmacroid) {
		return addField("globalmacroid", globalmacroid);
	}

	public ZabbixMacroUpdateRequest setValue(String value) {
		return addField("value", value);
	}

	public ZabbixMacroUpdateRequest setMacro(String macro) {
		return addField("macro", macro);
	}

	public ZabbixMacroUpdateRequest setDescription(String description) {
		return addField("description", description);
	}

}
