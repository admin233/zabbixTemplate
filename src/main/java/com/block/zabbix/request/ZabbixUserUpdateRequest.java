package com.block.zabbix.request;

import com.block.zabbix.pojo.ZabbixUserMedia;

import java.util.*;

public class ZabbixUserUpdateRequest extends ZabbixGenericRequest{

    public ZabbixUserUpdateRequest(String userid) {
        super("userid",userid);
    }

    public ZabbixUserUpdateRequest(int userid) {
        super("userid",String.valueOf(userid));
    }

    /**
     * (required)
     * @param userid
     * @return
     */
    public ZabbixUserUpdateRequest setUserid(String userid){
        this.params.put("userid",userid);
        return this;
    }

    public ZabbixUserUpdateRequest setUserid(int userid){
        this.params.put("userid",String.valueOf(userid));
        return this;
    }

    public ZabbixUserUpdateRequest setAlias(String alias){
        this.params.put("alias",alias);
        return this;
    }

    public ZabbixUserUpdateRequest setName(String name){
        this.params.put("name",name);
        return this;
    }

    public ZabbixUserUpdateRequest setPasswd(String passwd){
        this.params.put("passwd",passwd);
        return this;
    }

    public ZabbixUserUpdateRequest setUsrgrps(List<String> usrgrps){
        List<Map<String,String>> userGroupsIds = new ArrayList<>();
        usrgrps.forEach(o->{
            Map<String,String> tmp_map = new HashMap<>();
            tmp_map.put("usrgrpid",o);
            userGroupsIds.add(tmp_map);
        });
        this.params.put("usrgrps", userGroupsIds);
        return this;
    }

    public ZabbixUserUpdateRequest setUsrgrps(String ... usrgrps){
        setUsrgrps(Arrays.asList(usrgrps));
        return this;
    }

    public ZabbixUserUpdateRequest setUser_medias(List<ZabbixUserMedia> user_medias){
        this.params.put("user_medias",user_medias);
        return this;
    }

    public ZabbixUserUpdateRequest setUser_medias(ZabbixUserMedia ... user_medias){
        setUser_medias(Arrays.asList(user_medias));
        return this;
    }

    public ZabbixUserUpdateRequest setType(int type){
        this.params.put("type",type);
        return this;
    }

}
