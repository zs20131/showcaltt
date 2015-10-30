/**
 * @(#)ComplatintFindRequest.java
 *
 * Copyright (c) 2014-2014  苏州犀牛网络科技有限公司 版权所有
 * xiniunet. All rights reserved.
 *
 * This software is the confidential and proprietary
 * information of  xiniunet.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with xiniunet.
 */
package com.showcal.service.request;

import com.xiniunet.framework.base.BaseFindRequest;

import java.util.Date;

/**
 * Created by 顾志雄 on 2015-09-15 13:46:54.
 * @author 顾志雄
 */
public class ComplatintFindRequest extends BaseFindRequest {
    /**
     * 投诉来源,
     */
    private  String   sourceType;
      /**
     * 投诉来源ID,
     */
    private  Long   sourceId;
       /**
     * 投诉内容,
     */
    private  String   content;
/**
 * 创建人
 */
    private Long userId;
    /**
     * 处理人,
     */
    private  Long   processUserId;
    /**
     * 处理时间,
     */
    private Date processTime;

    private Boolean isList=false;

    public Boolean getIsList() {
        return isList;
    }

    public void setIsList(Boolean isList) {
        this.isList = isList;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSourceType() {
    return this.sourceType;
    }

    public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
    }
    
    
    
    public Long getSourceId() {
    return this.sourceId;
    }

    public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
    }
    
    
    
    public String getContent() {
    return this.content;
    }

    public void setContent(String content) {
    this.content = content;
    }
    
    
    
    
    
    public Long getProcessUserId() {
    return this.processUserId;
    }

    public void setProcessUserId(Long processUserId) {
    this.processUserId = processUserId;
    }
    
    
    
    
    
    public Date getProcessTime() {
    return this.processTime;
    }

    public void setProcessTime(Date processTime) {
    this.processTime = processTime;
    }
    
    
}
