package net.showcal.api.request.mobile;


import net.showcal.api.ApiRuleException;
import net.showcal.api.XiniuRequest;
import net.showcal.api.internal.util.XiniuHashMap;
import net.showcal.api.response.mobile.UserInfoRecordResponse;
import net.showcal.api.response.mobile.VerificationCodeCreateResponse;

import java.util.Map;

/**
 * Created on 2015-05-14.
 *
 * @author 吕浩
 * @since 1.0.0
 */
public class VerificationCodeCreateRequest implements XiniuRequest<VerificationCodeCreateResponse> {

    private XiniuHashMap udfParams = new XiniuHashMap();

    private Long userId;

    private Long tenantId;

    private String object;

    private Integer liveTime;


    public Integer getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }





    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String getApiMethodName() {
        return "mobile.create.code";
    }

    @Override
    public Map<String, String> getTextParams() {
        XiniuHashMap txtParams = new XiniuHashMap();
        txtParams.put("userId", this.userId);
        txtParams.put("tenantId", this.tenantId);
        txtParams.put("object", this.object);
        txtParams.put("liveTime", this.liveTime);

        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return null;
    }

    @Override
    public void setTimestamp(Long timestamp) {

    }

    @Override
    public Class<VerificationCodeCreateResponse> getResponseClass() {
        return VerificationCodeCreateResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public Map<String, String> getHeaderMap() {
        return null;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
   this.udfParams.put(key,value);
    }
}
