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
 * 商户信息表
 *
 * @author ccccchang
 * @date 2020-12-07 15:49:54
 */
@Data
@TableName("manage_merchant_info")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "商户信息表")
public class ManageMerchantInfo extends Model<ManageMerchantInfo> {
private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    @ApiModelProperty(value="主键")
    private Integer id;
    /**
     * 是否签订责任书(1:是，0:不是)
     */
    @ApiModelProperty(value="是否签订责任书(1:是，0:不是)")
    private String responsibilityFlag;
    /**
     * 企业名称
     */
    @ApiModelProperty(value="企业名称")
    private String enterpriseName;
    /**
     * 统一社会信用代码
     */
    @ApiModelProperty(value="统一社会信用代码")
    private String socialCreditNumber;
    /**
     * 经营范围
     */
    @ApiModelProperty(value="经营范围")
    private String businessScope;
    /**
     * 地址
     */
    @ApiModelProperty(value="地址")
    private String address;
    /**
     * 所属街道:街道选择 澳头/西区/霞涌
     */
    @ApiModelProperty(value="所属街道:街道选择 澳头/西区/霞涌")
    private String belongStreet;
    /**
     * 所属社区
     */
    @ApiModelProperty(value="所属社区")
    private String belongCommunity;
    /**
     * 所属网格(需求待确定
     */
    @ApiModelProperty(value="所属网格(需求待确定")
    private String belongGrid;
    /**
     * 责任人
     */
    @ApiModelProperty(value="责任人")
    private String owner;
    /**
     * 责任人身份证号
     */
    @ApiModelProperty(value="责任人身份证号")
    private String ownerIdentityNumber;
    /**
     * 责任人联系电话
     */
    @ApiModelProperty(value="责任人联系电话")
    private String ownerPhone;
    /**
     * 法定代表人电话
     */
    @ApiModelProperty(value="法定代表人电话")
    private String legalRepresentativePhone;
    /**
     * 备注
     */
    @ApiModelProperty(value="备注")
    private String remark;
    /**
     * 二维码地址
     */
    @ApiModelProperty(value="二维码地址")
    private String qrUrl;
    /**
     * 二维码编号
     */
    @ApiModelProperty(value="二维码编号")
    private String qrNumber;
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
