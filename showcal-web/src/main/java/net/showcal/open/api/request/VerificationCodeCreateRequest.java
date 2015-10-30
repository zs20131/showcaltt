package net.showcal.open.api.request;

import com.showcal.platform.domain.VerificationTypeEnum;
import com.xiniunet.apiframework.AbstractApiRequest;

/**
 * Created on 2015-05-14.
 *
 * @author 吕浩
 * @since 1.0.0
 */
public class VerificationCodeCreateRequest extends AbstractApiRequest {


    private Long userId;

    private Long tenantId;

    private String object;

    private Integer liveTime;


    private VerificationTypeEnum verificationType;


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

    public VerificationTypeEnum getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(VerificationTypeEnum verificationType) {
        this.verificationType = verificationType;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
