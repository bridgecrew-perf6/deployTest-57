/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.pig.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户信息表
 *
 * @author ccccchang
 * @date 2020-12-07 15:49:54
 */
@Data
@TableName("manage_user_info")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用户信息表")
public class ManageUserInfo extends Model<ManageUserInfo> {
private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    @ApiModelProperty(value="主键")
    private Integer id;
    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名")
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(value="密码")
    private String password;
    /**
     * 角色(admin:超级管理员
     */
    @ApiModelProperty(value="角色(admin:超级管理员")
    private String role;
    /**
     * 电话号码
     */
    @ApiModelProperty(value="电话号码")
    private String phone;
    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间")
    private LocalDateTime updateTime;
    /**
     * 逻辑删除标志(1:删除，0：未删除
     */
    @ApiModelProperty(value="逻辑删除标志(1:删除，0：未删除")
    private String deleteFlag;
    }
