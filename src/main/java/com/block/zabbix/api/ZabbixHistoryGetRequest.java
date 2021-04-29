package com.block.zabbix.api;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ZabbixHistoryGetRequest {

	public ZabbixHistoryGetRequest() {
		this.setOutput("extend").setHistory(0).setSortField("clock").setSortorder("ASC").setLimit(1000);
	}

	private Map<String, Object> params = new HashMap<>();

	public Map<String, Object> getParams() {
		return params;
	}

	public ZabbixHistoryGetRequest addField(String fieldName, Object fieldValue) {
		this.params.put(fieldName, fieldValue);
		return this;
	}

	public ZabbixHistoryGetRequest setOutput(String output) {
		this.params.put("output", output);
		return this;
	}

	public ZabbixHistoryGetRequest setOutput(String... output) {
		this.params.put("output", Arrays.asList(output));
		return this;
	}


	public ZabbixHistoryGetRequest setHistory(int history) {
		this.params.put("history", history);
		return this;
	}

	public ZabbixHistoryGetRequest setItemids(String... itemids) {
		return this.setItemids(Arrays.asList(itemids));
	}


	public ZabbixHistoryGetRequest setItemids(@NotNull List<String> itemids) {
		this.params.put("itemids", itemids);
		return this;
	}

	public ZabbixHistoryGetRequest setItemids(ZabbixGetItemsByHostResponse zabbixGetItemsByHostResponse) {
		this.params.put("itemids", zabbixGetItemsByHostResponse.getItemid());
		setHistory(Integer.parseInt(zabbixGetItemsByHostResponse.getValueType()));
		return this;
	}



	public ZabbixHistoryGetRequest setSortField(String sortfield) {
		this.params.put("sortfield", sortfield);
		return this;
	}

	public ZabbixHistoryGetRequest setSortorder(String sortorder) {
		this.params.put("sortorder", sortorder);
		return this;
	}

	public ZabbixHistoryGetRequest setTimeFrom(Long timeFrom) {
		this.params.put("time_from", timeFrom);
		return this;
	}

	public ZabbixHistoryGetRequest setTimeTill(Long timeTill) {
		this.params.put("time_till", timeTill);
		return this;
	}

	public ZabbixHistoryGetRequest setLimit(int limit) {
		this.params.put("limit", limit);
		return this;
	}

}
