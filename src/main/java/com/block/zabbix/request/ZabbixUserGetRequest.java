package com.block.zabbix.request;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZabbixUserGetRequest extends ZabbixGenericRequest{

    public ZabbixUserGetRequest() {
        super();
        this.params.put("output", "extend");
        this.params.put("selectMedias","extend");
        this.params.put("selectUsrgrps","extend");
        this.params.put("selectMediatypes","extend");
    }

    /**
     * 只返回用户给定用户组ID。
     * @param usrgrpids
     * @return
     */
    public ZabbixUserGetRequest setUsrgrpids(List<String> usrgrpids){
        if(usrgrpids!=null && usrgrpids.size()>0) {
            this.params.put("usrgrpids", usrgrpids);
        }
        return this;
    }

    public ZabbixUserGetRequest setUsrgrpids(String ... setUsrgrpids){
        return this.setUsrgrpids(setUsrgrpids.length>0? Arrays.asList(setUsrgrpids):null);
    }

    /**
     * 只返回用户给定ID。
     * @param userids
     * @return
     */
    public ZabbixUserGetRequest setUserids(List<String> userids){
        if(userids!=null && userids.size()>0) {
            this.params.put("userids", userids);
        }
        return this;
    }

    public ZabbixUserGetRequest setUserids(String ... userids){
        return this.setUserids(userids.length>0? Arrays.asList(userids):null);
    }


    public ZabbixUserGetRequest setFilterNames(String... names) {
        return this.setFilterNames(names.length>0?Arrays.asList(names):null);
    }

    public ZabbixUserGetRequest setFilterNames(List<String> names) {
        if(names!=null && names.size()>0) {
            Object filter_Object = this.params.get("filter");
            Map<String, Object> filter = new HashMap<>();
            if (filter_Object != null) {
                filter = (Map<String, Object>) filter_Object;
            }
            filter.put("name", names);
            this.params.put("filter", filter);
        }
        return this;
    }

    public ZabbixUserGetRequest setFilterAlias(String... alias) {
        return this.setFilterAlias(alias.length>0?Arrays.asList(alias):null);
    }

    public ZabbixUserGetRequest setFilterAlias(List<String> alias) {
        if(alias!=null && alias.size()>0) {
            Object filter_Object = this.params.get("filter");
            Map<String, Object> filter = new HashMap<>();
            if (filter_Object != null) {
                filter = (Map<String, Object>) filter_Object;
            }
            filter.put("alias", alias);
            this.params.put("filter", filter);
        }
        return this;
    }

    /**
     * 每页显示的对象行数。
     * 默认: 50.
     * @param rows_per_page
     * @return
     */
    public ZabbixUserGetRequest setRows_per_page(int rows_per_page){
        this.params.put("rows_per_page",rows_per_page);
        return this;
    }


    /**
     * 用户类型。
     * 可能的值:
     * 1 - (default) Zabbix user;
     * 2 - Zabbix admin;
     * 3 - Zabbix super admin.
     * @param type
     * @return
     */
    public ZabbixUserGetRequest setType(int type){
        this.params.put("type",type);
        return this;
    }
}
