package com.block.zabbix.request;

import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixMacroGetRequest extends ZabbixGenericRequest{

    public ZabbixMacroGetRequest setOutput(String output) {
        this.params.put("output", output);
        return this;
    }

    public ZabbixMacroGetRequest setHostids(String... hostids) {
        this.params.put("hostids", Arrays.asList(hostids));
        return this;
    }

    public ZabbixMacroGetRequest setHostids(List<String> hostids) {
        this.params.put("hostids", hostids);
        return this;
    }

    /**
     * Return global macros instead of host macros.
     * @param globalmacro
     * @return
     */
    public ZabbixMacroGetRequest setGlobalmacro(boolean globalmacro) {
        addField("globalmacro", globalmacro);
        return this;
    }

    public ZabbixMacroGetRequest setHostmacroids(List<String> hostmacroids) {
        addField("hostmacroids", hostmacroids);
        return this;
    }

    public ZabbixMacroGetRequest setHostmacroids(String ... hostmacroids) {
        return setHostmacroids(Arrays.asList(hostmacroids));
    }

    @SuppressWarnings("unchecked")
    private ZabbixMacroGetRequest setSearch(String searchName, Object searchKey) {
        Object search = this.params.get("search");
        if (ObjectUtils.isEmpty(search)) {
            Map<String, Object> filterMap = new HashMap<>(2);
            filterMap.put(searchName, searchKey);
            this.params.put("search", filterMap);
            return this;
        }
        ((Map<String, Object>) search).put(searchName, searchKey);
        this.params.put("search", search);
        return this;
    }


    @SuppressWarnings("unchecked")
    private ZabbixMacroGetRequest setFilter(String filterName, Object filterValue) {
        Object filter = this.params.get("filter");
        if (ObjectUtils.isEmpty(filter)) {
            Map<String, Object> filterMap = new HashMap<>(2);
            filterMap.put(filterName, filterValue);
            this.params.put("filter", filterMap);
            return this;
        }
        ((Map<String, Object>) filter).put(filterName, filterValue);
        this.params.put("filter", filter);
        return this ;
    }

    public ZabbixMacroGetRequest setFilterMacro(Object macro) {
        return setFilter("macro", macro);
    }

    public ZabbixMacroGetRequest setFilterType(Object type) {
        return setFilter("type", type);
    }

    public ZabbixMacroGetRequest setSortfield(String sortfield) {
        this.params.put("sortfield", sortfield);
        return this;
    }

}
