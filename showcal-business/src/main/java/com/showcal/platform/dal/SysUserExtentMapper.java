/**
 * @(#)SysUserExtentMapper.java  
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
package com.showcal.platform.dal;

import com.showcal.platform.po.SysUserExtentPO;
import com.showcal.platform.request.SysUserExtentSearchRequest;
import com.xiniunet.framework.annotation.MyBatisRepository;
import com.xiniunet.framework.security.Passport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 顾志雄 on 2015-09-15 13:46:53.
 *
 * @author 顾志雄
 */
@MyBatisRepository("PlatfromSysUserExtentMapper")
public interface SysUserExtentMapper extends SysUserExtentMapperAuto {

    /**
     * 更新实体对象
     *
     * @param request 请求对象
     * @return 受影响的记录条数
     */
    long update(@Param("request") SysUserExtentPO request, @Param("passport") Passport passport);


    /**
     * 模糊搜索对象列表
     *
     * @param request  请求对象
     * @param passport 用户护照
     * @return 实体对象列表集合
     */
    List<SysUserExtentPO> search(@Param("request") SysUserExtentSearchRequest request, @Param("passport") Passport passport);

    /**
     * 模糊搜索对象列表总数
     *
     * @param request  请求对象
     * @param passport 用户护照
     * @return 实体对象列表集合总数
     */
    long searchCount(@Param("request") SysUserExtentSearchRequest request, @Param("passport") Passport passport);

    /**
     * 更新服务总人数
     * @param serviceId
     * @param passport
     */
    void updateServiceCount(@Param("serviceId")Long serviceId, @Param("passport")Passport passport);
}