package com.block.zabbix.request;

import com.block.zabbix.pojo.ZabbixRight;
import com.block.zabbix.pojo.ZabbixTagBasedPermission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * 返回包含“usrgrpids”属性下创建的用户组的ID的对象。 返回的ID的顺序与传递的用户组的顺序相匹配。
 */
public class ZabbixUserGroupCreateRequest extends ZabbixGenericRequest{

    public ZabbixUserGroupCreateRequest(){
        super();
    }

    public ZabbixUserGroupCreateRequest setName(String name){
        this.params.put("name",name);
        return this;
    }

    /**
     * 是否启用或禁用调试模式。
     *
     * 可能的值:
     * 0 - (default) 禁用;
     * 1 - 启用。
     *
     * @param debug_mode
     * @return
     */
    public ZabbixUserGroupCreateRequest setDebug_mode(int debug_mode){
        this.params.put("debug_mode",debug_mode);
        return this;
    }

    /**
     * 组中用户的前端身份验证方法。
     *
     * 可能的值:
     * 0 - (default) 使用系统默认身份验证方法;
     * 1 - 使用内部认证;
     * 2 - 禁止访问前端。
     *
     * @param gui_access
     * @return
     */
    public ZabbixUserGroupCreateRequest setGui_access(int gui_access){
        this.params.put("gui_access",gui_access);
        return this;
    }

    /**
     * 	用户组是启用还是禁用。
     *
     * 可能的值:
     * 0 - (default) 启用;
     * 1 - 禁用。
     *
     * @param users_status
     * @return
     */
    public ZabbixUserGroupCreateRequest setUsers_status(int users_status){
        this.params.put("users_status",users_status);
        return this;
    }

    /**
     * ID of the host group to add permission to 0 - access denied
     * @param hostgroupId
     * @return
     */
    public ZabbixUserGroupCreateRequest addDeniedHostGroup(String hostgroupId){
        return setRightFunction(this::addRight,hostgroupId,0);
    }

    /**
     * ID of the host group to add permission to 2 - read-only access
     * @param hostgroupId
     * @return
     */
    public ZabbixUserGroupCreateRequest addReadOnlyHostGroup(String hostgroupId){
        return setRightFunction(this::addRight,hostgroupId,2 );
    }

    /**
     * ID of the host group to add permission to 3 - read-write access
     * @param hostgroupId
     * @return
     */
    public ZabbixUserGroupCreateRequest addReadWriteHostGroup(String hostgroupId){
        return setRightFunction(this::addRight,hostgroupId,3 );
    }

    /**
     * 分配给组的权限
     * @param rights
     * @return
     */
    private ZabbixUserGroupCreateRequest setRights(List<ZabbixRight> rights){
        this.params.put("rights",rights);
        return this;
    }

    /**
     * 分配给组的权限
     * @param hostGroupId
     * @param permission
     * @return
     */
    private ZabbixUserGroupCreateRequest addRight(String hostGroupId,int permission){
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

    private static ZabbixUserGroupCreateRequest setRightFunction(BiFunction<String,Integer,ZabbixUserGroupCreateRequest> func, String id, int permission){
        return func.apply(id,permission);
    }

    public ZabbixUserGroupCreateRequest setTag_filters(List<ZabbixTagBasedPermission> tag_filters){
        this.params.put("tag_filters",tag_filters);
        return this;
    }

    /**
     * 基于标签的权限分配给组
     * @param tag_filters
     * @return
     */
    public ZabbixUserGroupCreateRequest addTag_filter(ZabbixTagBasedPermission tag_filters){
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
    public ZabbixUserGroupCreateRequest setUserids(List<String> userids){
        this.params.put("userids",userids);
        return this;
    }

    /**
     * 要添加到用户组的用户的ID。
     * @param userids
     * @return
     */
    public ZabbixUserGroupCreateRequest addUserids(String ... userids){
        Object userids_Object = this.params.get("userids");
        List<String> userids_list = new ArrayList<>();
        if(userids_Object != null){
            userids_list = (List<String>) userids_Object;
        }
        Arrays.asList(userids).forEach(userids_list::add);
        return this.setUserids(userids_list);
    }

}
