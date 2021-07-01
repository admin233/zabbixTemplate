package com.block.zabbix.request;

import com.block.zabbix.pojo.ZabbixUserMedia;
import org.springframework.util.ObjectUtils;

import java.util.*;


public class ZabbixUserCreateRequest extends ZabbixGenericRequest{

    public ZabbixUserCreateRequest(){
        super();
    }

    /**
     * (required)
     * @param alias
     */
    public ZabbixUserCreateRequest(String alias){
        super("alias",alias);
    }

    public ZabbixUserCreateRequest setAlias(String alias){
        this.params.put("alias",alias);
        return this;
    }

    public ZabbixUserCreateRequest setName(String name){
        this.params.put("name",name);
        return this;
    }

    /**
     * (required)
     * @param passwd
     * @return
     */
    public ZabbixUserCreateRequest setPasswd(String passwd){
        this.params.put("passwd",passwd);
        return this;
    }

    /**
     * 用户添加到的组。
     * 用户组必须有存在的 usrgrpid 属性定义。
     * @param usrgrps
     * @return
     */
    public ZabbixUserCreateRequest setUsrgrps(List<String> usrgrps){
        List<Map<String,String>> userGroupsIds = new ArrayList<>();
        usrgrps.forEach(o->{
            Map<String,String> tmp_map = new HashMap<>();
            tmp_map.put("usrgrpid",o);
            userGroupsIds.add(tmp_map);
        });
        if(userGroupsIds.size()>0) {
            this.params.put("usrgrps", userGroupsIds);
        }
        return this;
    }

    public ZabbixUserCreateRequest setUsrgrps(String ... usrgrps){
        setUsrgrps(Arrays.asList(usrgrps));
        return this;
    }

    /**
     * 为用户创建媒介类型
     */
    public ZabbixUserCreateRequest setUser_medias(List<ZabbixUserMedia> user_medias){
        this.params.put("user_medias",user_medias);
        return this;
    }

    public ZabbixUserCreateRequest setUser_medias(ZabbixUserMedia ... user_medias){
        setUser_medias(Arrays.asList(user_medias));
        return this;
    }

    /**
     * 为用户增加媒介类型
     */
    public ZabbixUserCreateRequest addUserMedias(List<ZabbixUserMedia> userMedia){
        if(!ObjectUtils.isArray(userMedia)) {
            return this;
        }
        Object user_medias_obj = this.params.get("user_medias");
        List<ZabbixUserMedia> user_media_list = new ArrayList<>();
        if(!ObjectUtils.isEmpty(user_medias_obj)){
            user_media_list = (List<ZabbixUserMedia>) user_medias_obj;
        }
        user_media_list.addAll(userMedia);
        return setUser_medias(user_media_list);
    }

    public ZabbixUserCreateRequest addUserMedias(ZabbixUserMedia ... userMedia){
        return addUserMedias(Arrays.asList(userMedia));
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
    public ZabbixUserCreateRequest setType(int type){
        this.params.put("type",type);
        return this;
    }

}
