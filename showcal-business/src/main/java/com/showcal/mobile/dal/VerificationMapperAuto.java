/**
 * @(#)VerificationMapperAuto.java
 *
 * Copyright (c) 2014-2014  苏州犀牛网络科技有限公司 版权所有
 * XINIU. All rights reserved.
 *
 * This software is the confidential and proprietary
 * information of  XINIU.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with XINIU.
 */
package com.showcal.mobile.dal;


import com.showcal.mobile.po.VerificationPO;
import com.xiniunet.framework.security.Passport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 沈振家 on 2014-07-30 16:10:31.
 *
 * @author 沈振家
 */
public interface VerificationMapperAuto {
    /**
     * 插入记录.
     *
     * @param verification 实体对象
     * @return 实体对象的ID
     */
    long insert(@Param("verification") VerificationPO verification);

    /**
     * 批量插入记录.
     *
     * @param list 人员的集合
     * @return 受影响的记录条数
     */
    long insertBatch(@Param("list") List<VerificationPO> list, @Param("passport") Passport passport);

    /**
     * 按主键ID删除记录
     *
     * @param id 主键
     * @return 受影响的记录条数
     */
    long delete(@Param("id") Long id, @Param("passport") Passport passport);

    /**
     * 按主键ID批量删除记录
     *
     * @param list ID集合
     */
    long deleteBatch(@Param("list") List<Long> list, @Param("passport") Passport passport);


    /**
     * 更新实体对象
     *
     * @param verification 实体对象
     * @return 受影响的记录条数
     */
    long update(@Param("verification") VerificationPO verification, @Param("passport") Passport passport);

    /**
     * 批量更新实体对象.
     *
     * @param list 实体对象集合
     * @return 受影响的记录条数
     */
    long updateBatch(@Param("list") List<VerificationPO> list, @Param("passport") Passport passport);

    /**
     * 按主键ID获取实体对象
     *
     * @param id 主键
     * @return 实体对象
     */
    VerificationPO getById(@Param("id") Long id, @Param("passport") Passport passport);

    /**
     * 按主键ID集合获取实体对象集合
     *
     * @param ids 主键ID集合
     * @return 实体对象集合
     */
    List<VerificationPO> getListByIds(@Param("list") List<Long> ids, @Param("passport") Passport passport);

    /**
     * 按ID判断是否存在
     *
     * @param id 主键
     * @return 是否存在
     */
    long existById(@Param("id") Long id, @Param("passport") Passport passport);


}
