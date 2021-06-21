package com.block.zabbix;

import com.block.zabbix.api.ZabbixRequest;
import com.block.zabbix.api.ZabbixResponse;
import com.block.zabbix.pojo.ZabbixUserLogin;
import com.block.zabbix.request.*;
import com.block.zabbix.response.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.*;

import static org.springframework.http.HttpMethod.POST;

/**
 * ZABBIX API 5.0
 */
public class ZabbixTemplate {

    private final String url;
    private final String jsonrpc;
    private final String user;
    private final String password;

    private final RestTemplate restTemplate;
    private String auth = null;

    public ZabbixTemplate(String url, String user, String password) {
//        RestTemplate t_restTemplate = new RestTemplate();
//        t_restTemplate.getMessageConverters().add(new MyMappingJackson2HttpMessageConverter());
//        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
//        messageConverters.add(converter);
//        t_restTemplate.setMessageConverters(messageConverters);
        this(url, "2.0", user, password, new RestTemplate());
    }

    public ZabbixTemplate(String url, String jsonpc, String user, String password, RestTemplate restTemplate) {
        this.url = url;
        this.jsonrpc = jsonpc;
        this.user = user;
        this.password = password;
        this.restTemplate = restTemplate;
    }

    public List<ZabbixApplicationGetResponse> applicationGet(ZabbixGenericRequest zabbixGenericRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("application.get").setId(21).setAuth(getAuth())
                .setParams(zabbixGenericRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixApplicationGetResponse>>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixApplicationGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixApplicationGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    /**
     * @param limit 获取指定条数
     * @param timeFrom 某个时间之后的数据
     * @param timeTill 某个时间之前的数据
     * @param zabbixGetItemsByHostResponse item对象
     * @return ZabbixHistoryGetResponse
     */
    public List<ZabbixHistoryGetResponse> historyGet(int limit, long timeFrom, long timeTill, ZabbixItemGetResponse zabbixGetItemsByHostResponse) {
        ZabbixHistoryGetRequest zabbixHistoryGetRequest = new ZabbixHistoryGetRequest();
        zabbixHistoryGetRequest.setItemids(zabbixGetItemsByHostResponse)
                .setLimit(limit==0?1000:limit)
                .setTimeFrom(timeFrom)
                .setTimeTill(timeTill==0?System.currentTimeMillis()/1000:timeTill);
        return this.historyGet(zabbixHistoryGetRequest);
    }

    /**
     * @param history
     * @param itemids
     * @return
     */
    public List<ZabbixHistoryGetResponse> historyGet(int history,String... itemids) {
        return this.historyGet(history,Arrays.asList(itemids));
    }

    /**
     * @param itemids
     * @return
     */
    public List<ZabbixHistoryGetResponse> historyGet(String... itemids) {
        return this.historyGet(Arrays.asList(itemids));
    }

    /**
     * @param limit
     * @param timeFrom
     * @param timeTill
     * @param itemids
     * @return
     */
    public List<ZabbixHistoryGetResponse> historyGet(int limit, long timeFrom, long timeTill, String... itemids) {
        return this.historyGet(limit,timeFrom,timeTill,Arrays.asList(itemids));
    }

    /**
     * @param history
     * @param limit
     * @param timeFrom
     * @param timeTill
     * @param itemids
     * @return
     */
    public List<ZabbixHistoryGetResponse> historyGet(int history,int limit, long timeFrom, long timeTill, String... itemids) {
        return this.historyGet(history,limit,timeFrom,timeTill,Arrays.asList(itemids));
    }

    /**
     * @param zabbixGetItemsByHostResponse
     * @return
     */
    public List<ZabbixHistoryGetResponse> historyGet(ZabbixItemGetResponse zabbixGetItemsByHostResponse) {
        return this.historyGet(0,0,0,zabbixGetItemsByHostResponse);
    }

    /**
     * @param itemids
     * @return
     */
    public List<ZabbixHistoryGetResponse> historyGet(List<String> itemids) {
        ZabbixHistoryGetRequest zabbixHistoryGetRequest = new ZabbixHistoryGetRequest();
        zabbixHistoryGetRequest.setItemids(itemids);
        return this.historyGet(zabbixHistoryGetRequest);
    }

    /**
     * @param history
     * @param itemids
     * @return
     */
    public List<ZabbixHistoryGetResponse> historyGet(int history,List<String> itemids) {
        ZabbixHistoryGetRequest zabbixHistoryGetRequest = new ZabbixHistoryGetRequest(history);
        zabbixHistoryGetRequest.setItemids(itemids);
        return this.historyGet(zabbixHistoryGetRequest);
    }

    /**
     * @param history
     * @param limit
     * @param timeFrom
     * @param timeTill
     * @param itemids
     * @return
     */
    public List<ZabbixHistoryGetResponse> historyGet(int history,int limit, long timeFrom, long timeTill, List<String> itemids) {
        ZabbixHistoryGetRequest zabbixHistoryGetRequest = new ZabbixHistoryGetRequest(history);
        zabbixHistoryGetRequest.setItemids(itemids)
                .setTimeFrom(timeFrom)
                .setTimeTill(timeTill==0?System.currentTimeMillis()/1000:timeTill)
                .setLimit(limit);
        return this.historyGet(zabbixHistoryGetRequest);
    }

    /**参数可选，多参数
     * @param limit
     * @param timeFrom
     * @param timeTill
     * @param itemids
     * @return
     */
    public List<ZabbixHistoryGetResponse> historyGet(int limit, long timeFrom, long timeTill, List<String> itemids) {
        ZabbixHistoryGetRequest zabbixHistoryGetRequest = new ZabbixHistoryGetRequest();
        zabbixHistoryGetRequest.setItemids(itemids)
                .setLimit(limit)
                .setTimeFrom(timeFrom)
                .setTimeTill(timeTill);
        return this.historyGet(zabbixHistoryGetRequest);
    }

    /**
     * @param zabbixHistoryGetRequest 请求
     * @return  ZabbixHistoryGetResponse
     */
    public List<ZabbixHistoryGetResponse> historyGet(ZabbixHistoryGetRequest zabbixHistoryGetRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("history.get").setId(18).setAuth(getAuth())
                .setParams(zabbixHistoryGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixHistoryGetResponse>>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixHistoryGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixHistoryGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public List<ZabbixTrendGetResponse> trendGet(String... itemids) {
        return this.trendGet(Arrays.asList(itemids));
    }

    public List<ZabbixTrendGetResponse> trendGet(List<String> itemids) {
        ZabbixTrendGetRequest zabbixTrendGetRequest = new ZabbixTrendGetRequest();
        zabbixTrendGetRequest.setItemids(itemids);
        return this.trendGet(zabbixTrendGetRequest);
    }

    public List<ZabbixTrendGetResponse> trendGet(ZabbixTrendGetRequest zabbixTrendGetRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("trend.get").setId(17).setAuth(getAuth())
                .setParams(zabbixTrendGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixTrendGetResponse>>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixTrendGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixTrendGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public List<ZabbixHostGroupGetResponse> hostGroupGet(String... names) {
        ZabbixHostGroupGetRequest zabbixHostGroupGetRequest = new ZabbixHostGroupGetRequest();
        zabbixHostGroupGetRequest.setFilterNames(names).setOutput("extend");
        return this.hostGroupGet(zabbixHostGroupGetRequest);
    }

    public List<ZabbixHostGroupGetResponse> hostGroupGet(ZabbixHostGroupGetRequest zabbixHostGroupGetRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("hostgroup.get").setId(16).setAuth(getAuth())
                .setParams(zabbixHostGroupGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixHostGroupGetResponse>>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixHostGroupGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixHostGroupGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixHostGroupGenericResponse hostGroupDelete(String... groupids) {
        return this.hostGroupDelete(Arrays.asList(groupids));
    }

    public ZabbixHostGroupGenericResponse hostGroupDelete(List<String> groupids) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("hostgroup.delete").setId(15).setAuth(getAuth()).setParams(groupids);

        HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixHostGroupGenericResponse>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGroupGenericResponse>>() {
                });

        ZabbixResponse<ZabbixHostGroupGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixHostGroupGenericResponse hostGroupUpdate(String groupid, String name) {
        return this.hostGroupUpdate(new ZabbixHostGroupUpdateRequest(groupid, name));
    }

    public ZabbixHostGroupGenericResponse hostGroupUpdate(ZabbixHostGroupUpdateRequest zabbixHostGroupUpdateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<ZabbixHostGroupUpdateRequest> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("hostgroup.update").setId(14).setAuth(getAuth())
                .setParams(zabbixHostGroupUpdateRequest);

        HttpEntity<ZabbixRequest<ZabbixHostGroupUpdateRequest>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixHostGroupGenericResponse>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGroupGenericResponse>>() {
                });

        ZabbixResponse<ZabbixHostGroupGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixHostGroupGenericResponse hostGroupCreate(String name) {
        return this.hostGroupCreate(new ZabbixHostGroupCreateRequest(name));
    }

    public ZabbixHostGroupGenericResponse hostGroupCreate(ZabbixHostGroupCreateRequest zabbixHostGroupCreateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<ZabbixHostGroupCreateRequest> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("hostgroup.create").setId(13).setAuth(getAuth())
                .setParams(zabbixHostGroupCreateRequest);

        HttpEntity<ZabbixRequest<ZabbixHostGroupCreateRequest>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixHostGroupGenericResponse>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGroupGenericResponse>>() {
                });

        ZabbixResponse<ZabbixHostGroupGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public List<ZabbixHostInterfaceGetResponse> hostInterfaceGet(String hostid) {
        return this.hostInterfaceGet("extend", hostid);
    }

    public List<ZabbixHostInterfaceGetResponse> hostInterfaceGet(String output, String hostids) {
        ZabbixHostInterfaceGetRequest zabbixHostInterfaceGetRequest = new ZabbixHostInterfaceGetRequest();
        zabbixHostInterfaceGetRequest.setOutput(output).setHostids(hostids);
        return this.hostInterfaceGet(zabbixHostInterfaceGetRequest);
    }

    public List<ZabbixHostInterfaceGetResponse> hostInterfaceGet(
            ZabbixHostInterfaceGetRequest zabbixHostInterfaceGetRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("hostinterface.get").setId(12).setAuth(getAuth())
                .setParams(zabbixHostInterfaceGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixHostInterfaceGetResponse>>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixHostInterfaceGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixHostInterfaceGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixHostInterfaceGenericResponse hostInterfaceDelete(String... interfaceids) {
        return this.hostInterfaceDelete(Arrays.asList(interfaceids));
    }

    public ZabbixHostInterfaceGenericResponse hostInterfaceDelete(List<String> interfaceids) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("hostinterface.delete").setId(10).setAuth(getAuth()).setParams(interfaceids);

        HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixHostInterfaceGenericResponse>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostInterfaceGenericResponse>>() {
                });

        ZabbixResponse<ZabbixHostInterfaceGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixHostInterfaceGenericResponse hostInterfaceCreate(
            ZabbixHostInterfaceCreateRequest zabbixHostInterfaceCreateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<ZabbixHostInterfaceCreateRequest> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("hostinterface.create").setId(9).setAuth(getAuth())
                .setParams(zabbixHostInterfaceCreateRequest);

        HttpEntity<ZabbixRequest<ZabbixHostInterfaceCreateRequest>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixHostInterfaceGenericResponse>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostInterfaceGenericResponse>>() {
                });

        ZabbixResponse<ZabbixHostInterfaceGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixHostInterfaceGenericResponse hostInterfaceUpdate(String interfaceid, String port) {
        return this.hostInterfaceUpdate(new ZabbixHostInterfaceUpdateRequest(interfaceid, port));
    }

    public ZabbixHostInterfaceGenericResponse hostInterfaceUpdate(
            ZabbixHostInterfaceUpdateRequest zabbixHostInterfaceUpdateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<ZabbixHostInterfaceUpdateRequest> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("hostinterface.update").setId(11).setAuth(getAuth())
                .setParams(zabbixHostInterfaceUpdateRequest);

        HttpEntity<ZabbixRequest<ZabbixHostInterfaceUpdateRequest>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixHostInterfaceGenericResponse>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<ZabbixHostInterfaceGenericResponse>>() {
                });

        ZabbixResponse<ZabbixHostInterfaceGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixItemGenericResponse itemDelete(String... itemids) {
        return this.itemDelete(Arrays.asList(itemids));
    }

    public ZabbixItemGenericResponse itemDelete(List<String> itemids) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("item.delete").setId(4).setAuth(getAuth()).setParams(itemids);

        HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixItemGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixItemGenericResponse>>() {
                });

        ZabbixResponse<ZabbixItemGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixItemGenericResponse itemCreate(ZabbixItemCreateRequest zabbixItemCreateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("item.create").setId(3).setAuth(getAuth())
                .setParams(zabbixItemCreateRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixItemGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixItemGenericResponse>>() {
                });

        ZabbixResponse<ZabbixItemGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixItemGenericResponse itemUpdate(ZabbixItemUpdateRequest zabbixItemUpdateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("item.update").setId(5).setAuth(getAuth())
                .setParams(zabbixItemUpdateRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixItemGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixItemGenericResponse>>() {
                });

        ZabbixResponse<ZabbixItemGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public List<ZabbixItemGetResponse> itemGet(ZabbixItemGetRequest zabbixItemGetRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("item.get").setId(6).setAuth(getAuth())
                .setParams(zabbixItemGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixItemGetResponse>>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<List<ZabbixItemGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixItemGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public List<ZabbixHostGetResponse> hostGetAll() {
        ZabbixHostGetRequest zabbixHostGetRequest = new ZabbixHostGetRequest();
        return this.hostGet(zabbixHostGetRequest);
    }

    public List<ZabbixHostGetResponse> hostGet(String... hosts) {
        ZabbixHostGetRequest zabbixHostGetRequest = new ZabbixHostGetRequest();
        return this.hostGet(zabbixHostGetRequest.setFilterHosts(hosts));
    }

    public List<ZabbixHostGetResponse> hostGet(ZabbixHostGetRequest zabbixHostGetRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("host.get").setId(2).setAuth(getAuth())
                .setParams(zabbixHostGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixHostGetResponse>>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<List<ZabbixHostGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixHostGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public List<ZabbixItemGetResponse> getItemsByHost(List<String> hostList) {
        ZabbixItemGetRequest zabbixItemGetRequest = new ZabbixItemGetRequest();
        return getItemsByHost(zabbixItemGetRequest.setHostids(hostList));
    }

    public List<ZabbixItemGetResponse> getItemsByHost(String... hostId) {
        ZabbixItemGetRequest zabbixItemGetRequest = new ZabbixItemGetRequest();
        return getItemsByHost(zabbixItemGetRequest.setHostids(hostId));
    }

    public List<ZabbixItemGetResponse> getItemsByHost(ZabbixItemGetRequest zabbixGetItemsByHostRequest) {

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("item.get").setId(2).setAuth(getAuth())
                .setParams(zabbixGetItemsByHostRequest.getParams());
        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixItemGetResponse>>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<List<ZabbixItemGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixItemGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixHostGenericResponse hostCreate(ZabbixHostCreateRequest zabbixHostCreateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("host.create").setId(7).setAuth(getAuth())
                .setParams(zabbixHostCreateRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixHostGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGenericResponse>>() {
                });

        ZabbixResponse<ZabbixHostGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixHostGenericResponse hostUpdate(ZabbixHostUpdateRequest zabbixHostUpdateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("host.update").setId(8).setAuth(getAuth())
                .setParams(zabbixHostUpdateRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixHostGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGenericResponse>>() {
                });

        ZabbixResponse<ZabbixHostGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixHostGenericResponse hostDelete(String... hostids) {
        return this.hostDelete(Arrays.asList(hostids));
    }

    public ZabbixHostGenericResponse hostDelete(List<String> hostids) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("host.delete").setId(4).setAuth(getAuth()).setParams(hostids);

        HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixHostGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixHostGenericResponse>>() {
                });

        ZabbixResponse<ZabbixHostGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }


    /**
     * get template by host id list
     * @param hostids
     * @return
     */
    public List<ZabbixTemplateGetResponse> getTemplateByHostids(String...hostids){
        ZabbixTemplateGetRequest zabbixTemplateGetRequest = new ZabbixTemplateGetRequest();
        return templateGet(zabbixTemplateGetRequest.setHostids(hostids));
    }

    /**
     * get template by name list
     * @param names
     * @return
     */
    public List<ZabbixTemplateGetResponse> getTemplateByName(String ... names){
        ZabbixTemplateGetRequest zabbixTemplateGetRequest = new ZabbixTemplateGetRequest();
        return templateGet(zabbixTemplateGetRequest.setHost(names));
    }

    public List<ZabbixTemplateGetResponse> templateGet(ZabbixTemplateGetRequest zabbixTemplateGetRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("template.get").setId(22).setAuth(getAuth())
                .setParams(zabbixTemplateGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixTemplateGetResponse>>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<List<ZabbixTemplateGetResponse>>>() {
                });
        ZabbixResponse<List<ZabbixTemplateGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    /**
     * 获取所有代理
     * @return
     */
    public List<ZabbixProxyGetResponse> proxyGetAll(){
        ZabbixProxyGetRequest zabbixProxyGetRequest = new ZabbixProxyGetRequest();
        return this.proxyGet(zabbixProxyGetRequest);
    }

    /**
     * 根据名字获取代理
     * @param name
     * @return
     */
    public List<ZabbixProxyGetResponse> proxyGetByName(String ... name){
        ZabbixProxyGetRequest zabbixProxyGetRequest = new ZabbixProxyGetRequest();
        zabbixProxyGetRequest.setFilterHosts(name);
        return this.proxyGet(zabbixProxyGetRequest);
    }

    public List<ZabbixProxyGetResponse> proxyGet(ZabbixProxyGetRequest zabbixProxyGetRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("proxy.get").setId(23).setAuth(getAuth())
                .setParams(zabbixProxyGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);

        ResponseEntity<ZabbixResponse<List<ZabbixProxyGetResponse>>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<List<ZabbixProxyGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixProxyGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    /**
     * 根据名称获取媒介类型
     * @param name
     * @return
     */
    public List<ZabbixMediaTypeGetResponse> mediaTypeGet(String ... name){
        ZabbixMediaTypeRequest zabbixMediaTypeRequest = new ZabbixMediaTypeRequest();
        zabbixMediaTypeRequest.setFilterNames(name);
        return this.mediaTypeGet(zabbixMediaTypeRequest);
    }

    public List<ZabbixMediaTypeGetResponse> mediaTypeGet(ZabbixMediaTypeRequest zabbixMediaTypeRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("mediatype.get").setId(24).setAuth(getAuth())
                .setParams(zabbixMediaTypeRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixMediaTypeGetResponse>>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixMediaTypeGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixMediaTypeGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public List<ZabbixUserGroupGetResponse> userGroupGet(String ... names){
        ZabbixUserGroupGetRequest zabbixUserGroupGetRequest = new ZabbixUserGroupGetRequest();
        zabbixUserGroupGetRequest.setFilterNames(names);
        return this.userGroupGet(zabbixUserGroupGetRequest);
    }

    public List<ZabbixUserGroupGetResponse> userGroupGetById(String ... ids){
        ZabbixUserGroupGetRequest zabbixUserGroupGetRequest = new ZabbixUserGroupGetRequest();
        zabbixUserGroupGetRequest.setUsrgrpids(ids);
        return this.userGroupGet(zabbixUserGroupGetRequest);
    }

    public List<ZabbixUserGroupGetResponse> userGroupGet(ZabbixUserGroupGetRequest zabbixUserGroupGetRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("usergroup.get").setId(25).setAuth(getAuth())
                .setParams(zabbixUserGroupGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixUserGroupGetResponse>>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixUserGroupGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixUserGroupGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();

    }

    public ZabbixUserGroupGenericResponse userGroupCreate(ZabbixUserGroupCreateRequest zabbixUserGroupCreateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("usergroup.create").setId(26).setAuth(getAuth())
                .setParams(zabbixUserGroupCreateRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixUserGroupGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixUserGroupGenericResponse>>() {
                });

        ZabbixResponse<ZabbixUserGroupGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixUserGroupGenericResponse userGroupDel(ZabbixUserGroupDelRequest zabbixUserGroupDelRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("usergroup.delete").setId(27).setAuth(getAuth())
                .setParams(zabbixUserGroupDelRequest.getParams());

        HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixUserGroupGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixUserGroupGenericResponse>>() {
                });

        ZabbixResponse<ZabbixUserGroupGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixUserGroupGenericResponse userGroupUpdate(ZabbixUserGroupUpdateRequest zabbixUserGroupUpdateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("usergroup.update").setId(28).setAuth(getAuth())
                .setParams(zabbixUserGroupUpdateRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixUserGroupGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixUserGroupGenericResponse>>() {
                });

        ZabbixResponse<ZabbixUserGroupGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public List<ZabbixUserGetResponse> userGet(ZabbixUserGetRequest zabbixUserGetRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("user.get").setId(29).setAuth(getAuth())
                .setParams(zabbixUserGetRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<List<ZabbixUserGetResponse>>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<List<ZabbixUserGetResponse>>>() {
                });

        ZabbixResponse<List<ZabbixUserGetResponse>> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixUserGenericResponse userCreate(ZabbixUserCreateRequest zabbixUserCreateRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ZabbixRequest<Map<String, Object>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("user.create").setId(30).setAuth(getAuth())
                .setParams(zabbixUserCreateRequest.getParams());

        HttpEntity<ZabbixRequest<Map<String, Object>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixUserGenericResponse>> response = restTemplate.exchange(url, POST,
                request, new ParameterizedTypeReference<ZabbixResponse<ZabbixUserGenericResponse>>() {
                });
        ZabbixResponse<ZabbixUserGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public ZabbixUserGenericResponse userDel(ZabbixUserDelRequest zabbixUserDelRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<List<String>> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("user.delete").setId(31).setAuth(getAuth())
                .setParams(zabbixUserDelRequest.getParams());

        HttpEntity<ZabbixRequest<List<String>>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<ZabbixUserGenericResponse>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<ZabbixUserGenericResponse>>() {
                });

        ZabbixResponse<ZabbixUserGenericResponse> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    public List<ZabbixUserGetResponse> userGet(String ... names){
        ZabbixUserGetRequest zabbixUserGetRequest = new ZabbixUserGetRequest();
        zabbixUserGetRequest.setFilterNames(names);
        return this.userGet(zabbixUserGetRequest);
    }

    public List<ZabbixUserGetResponse> userGetByAlias(String ... alias){
        ZabbixUserGetRequest zabbixUserGetRequest = new ZabbixUserGetRequest();
        zabbixUserGetRequest.setFilterAlias(alias);
        return this.userGet(zabbixUserGetRequest);
    }

    public String getAuth() {
        if (this.auth == null) {
            this.auth = this.userLogin(this.user, this.password);
        }
        return this.auth;
    }

    public ZabbixTemplate setAuth(String auth) {
        this.auth = auth;
        return this;
    }

    public String userLogin(String user, String password) {
        return this.userLogin(new ZabbixUserLogin(user, password));
    }

    public String userLogin(ZabbixUserLogin zabbixUserLogin) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ZabbixRequest<ZabbixUserLogin> dto = new ZabbixRequest<>();
        dto.setJsonrpc(jsonrpc).setMethod("user.login").setId(1).setParams(zabbixUserLogin);

        HttpEntity<ZabbixRequest<ZabbixUserLogin>> request = new HttpEntity<>(dto, headers);
        ResponseEntity<ZabbixResponse<String>> response = restTemplate.exchange(url, POST, request,
                new ParameterizedTypeReference<ZabbixResponse<String>>() {
                });
        ZabbixResponse<String> result = response.getBody();
        printError(result);
        return result.getResult();
    }

    private <T> void printError(ZabbixResponse<T> result) {
        if (result.getError() != null) {
            throw new IllegalArgumentException(result.getError().getData());
        }
    }
}
