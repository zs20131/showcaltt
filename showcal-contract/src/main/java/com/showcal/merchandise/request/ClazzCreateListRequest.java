/**
 * @(#)ClazzCreateRequest.java
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
package com.showcal.merchandise.request;

import com.xiniunet.framework.base.BaseRequest;

import java.util.List;

/**
 * Created by 顾志雄 on 2015-09-24 09:54:05.
 * @author 顾志雄
 */
public class ClazzCreateListRequest extends BaseRequest {
    
    private List<ClazzCreateRequest> clazzCreateRequests;

    public List<ClazzCreateRequest> getClazzCreateRequests() {
        return clazzCreateRequests;
    }

    public void setClazzCreateRequests(List<ClazzCreateRequest> clazzCreateRequests) {
        this.clazzCreateRequests = clazzCreateRequests;
    }
}
