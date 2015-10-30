/**
 * @(#)CommentPostCreateResponse.java
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
package com.showcal.platform.response;

import com.xiniunet.framework.base.BaseResponse;

import java.util.List;

/**
 * Created by 顾志雄 on 2015-09-22 11:16:50.
 * @author 顾志雄
 */
public class CommentPostCreateListResponse extends BaseResponse {
    private static final long serialVersionUID = 1L;
    /**
     * 新创建的评论表ID
     */
    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}