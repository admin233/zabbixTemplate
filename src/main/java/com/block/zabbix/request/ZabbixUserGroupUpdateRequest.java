package com.block.zabbix.request;

import com.block.zabbix.pojo.ZabbixRight;
import com.block.zabbix.pojo.ZabbixTagBasedPermission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class ZabbixUserGroupUpdateRequest extends ZabbixGenericRequest{

    public ZabbixUserGroupUpdateRequest(String usrgrpid) {
        super();
        this.params.put("usrgrpid",usrgrpid);
    }

    public ZabbixUserGroupUpdateRequest setUsrgrpid(String usrgrpid){
        this.params.put("usrgrpid",usrgrpid);
        return this;
    }

    public ZabbixUserGroupUpdateRequest setName(String name){
        this.params.put("name",name);
        return this;
    }

    public ZabbixUserGroupUpdateRequest setDebug_mode(int debug_mode){
        this.params.put("debug_mode",debug_mode);
        return this;
    }

    public ZabbixUserGroupUpdateRequest setGui_access(int gui_access){
        this.params.put("gui_access",gui_access);
        return this;
    }

    public ZabbixUserGroupUpdateRequest setUsers_status(int users_status){
        this.params.put("users_status",users_status);
        return this;
    }

    /**
     * ID of the host group to add permission to 0 - access denied
     * @param hostgroupId
     * @return
     */
    public ZabbixUserGroupUpdateRequest addDeniedHostGroup(String hostgroupId){
        return setRightFunction(this::addRight,hostgroupId,0);
    }

    /**
     * ID of the host group to add permission to 2 - read-only access
     * @param hostgroupId
     * @return
     */
    public ZabbixUserGroupUpdateRequest addReadOnlyHostGroup(String hostgroupId){
        return setRightFunction(this::addRight,hostgroupId,2 );
    }

    /**
     * ID of the host group to add permission to 3 - read-write access
     * @param hostgroupId
     * @return
     */
    public ZabbixUserGroupUpdateRequest addReadWriteHostGroup(String hostgroupId){
        return setRightFunction(this::addRight,hostgroupId,3 );
    }

    /**
     * 分配给组的权限
     * @param rights
     * @return
     */
    private ZabbixUserGroupUpdateRequest setRights(List<ZabbixRight> rights){
        this.params.put("rights",rights);
        return this;
    }

    /**
     * 分配给组的权限
     * @param hostGroupId
     * @param permission
     * @return
     */
    private ZabbixUserGroupUpdateRequest addRight(String hostGroupId,int permission){
        BiFunction<String, Integer, ZabbixRight> biFunction = ZabbixRight::new;
        ZabbixRight zabbixRight = biFunction.apply(hostGroupId,permission);
        Object rights_Object = this.params.get("rights");
        List<ZabbixRight> rights_list = new ArrayList<ZabbixRight>();
        if(rights_Object != null){
            rights_list = (List<ZabbixRight>) rights_Object;
        }
        rights_list.add(zabbixRight);
        return this.setRights(rights_list);
    }

    private static ZabbixUserGroupUpdateRequest setRightFunction(BiFunction<String,Integer,ZabbixUserGroupUpdateRequest> func, String id, int permission){
        return func.apply(id,permission);
    }

    public ZabbixUserGroupUpdateRequest setTag_filters(List<ZabbixTagBasedPermission> tag_filters){
        this.params.put("tag_filters",tag_filters);
        return this;
    }

    /**
     * 基于标签的权限分配给组
     * @param tag_filters
     * @return
     */
    public ZabbixUserGroupUpdateRequest addTag_filter(ZabbixTagBasedPermission tag_filters){
        Object filter_Object = this.params.get("tag_filters");
        List<ZabbixTagBasedPermission> tag_filters_list = new ArrayList<ZabbixTagBasedPermission>();
        if(filter_Object != null){
            tag_filters_list = (List<ZabbixTagBasedPermission>) filter_Object;
        }
        tag_filters_list.add(tag_filters);
        return this.setTag_filters(tag_filters_list);
    }

    /**
     * 要添加到用户组的用户的ID。
     * @param userids
     * @return
     */
    public ZabbixUserGroupUpdateRequest setUserids(List<String> userids){
        this.params.put("userids",userids);
        return this;
    }

    /**
     * 要添加到用户组的用户的ID。
     * @param userids
     * @return
     */
    public ZabbixUserGroupUpdateRequest addUserids(String ... userids){
        Object userids_Object = this.params.get("userids");
        List<String> userids_list = new ArrayList<>();
        if(userids_Object != null){
            userids_list = (List<String>) userids_Object;
        }
        Arrays.asList(userids).forEach(userids_list::add);
        return this.setUserids(userids_list);
    }
}
