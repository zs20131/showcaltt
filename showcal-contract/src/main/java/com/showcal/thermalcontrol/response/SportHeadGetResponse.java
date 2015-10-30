/**
 * @(#)SportHeadGetResponse.java
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
package com.showcal.thermalcontrol.response;

import com.showcal.thermalcontrol.domain.SportHead;
import com.xiniunet.framework.base.BaseResponse;

/**
 * Created by 顾志雄 on 2015-09-15 13:46:58.
 * @author 顾志雄
 */
public class SportHeadGetResponse extends BaseResponse {

    /**
     * 运动方案信息
     */
    private SportHead sportHead;

    public SportHead getSportHead() {
        return this.sportHead;
    }

    public void setSportHead(SportHead sportHead) {
        this.sportHead = sportHead;
    }
}