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

package com.pig4cloud.pig.admin.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pig4cloud.pig.common.core.util.R;
import com.pig4cloud.pig.common.log.annotation.SysLog;
import com.pig4cloud.pig.admin.entity.ManageMerchantInfo;
import com.pig4cloud.pig.admin.service.ManageMerchantInfoService;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * 商户信息表
 *
 * @author ccccchang
 * @date 2020-12-07 15:49:54
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/managemerchantinfo" )
@Api(value = "managemerchantinfo", tags = "商户信息表管理")
public class ManageMerchantInfoController {

    private final  ManageMerchantInfoService manageMerchantInfoService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param manageMerchantInfo 商户信息表
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    @PreAuthorize("@pms.hasPermission('admin_managemerchantinfo_get')" )
    public R getManageMerchantInfoPage(Page page, ManageMerchantInfo manageMerchantInfo) {
        return R.ok(manageMerchantInfoService.page(page, Wrappers.query(manageMerchantInfo)));
    }


    /**
     * 通过id查询商户信息表
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{id}" )
    @PreAuthorize("@pms.hasPermission('admin_managemerchantinfo_get')" )
    public R getById(@PathVariable("id" ) Integer id) {
        return R.ok(manageMerchantInfoService.getById(id));
    }

    /**
     * 新增商户信息表
     * @param manageMerchantInfo 商户信息表
     * @return R
     */
    @ApiOperation(value = "新增商户信息表", notes = "新增商户信息表")
    @SysLog("新增商户信息表" )
    @PostMapping
    @PreAuthorize("@pms.hasPermission('admin_managemerchantinfo_add')" )
    public R save(@RequestBody ManageMerchantInfo manageMerchantInfo) {
        return R.ok(manageMerchantInfoService.save(manageMerchantInfo));
    }

    /**
     * 修改商户信息表
     * @param manageMerchantInfo 商户信息表
     * @return R
     */
    @ApiOperation(value = "修改商户信息表", notes = "修改商户信息表")
    @SysLog("修改商户信息表" )
    @PutMapping
    @PreAuthorize("@pms.hasPermission('admin_managemerchantinfo_edit')" )
    public R updateById(@RequestBody ManageMerchantInfo manageMerchantInfo) {
        return R.ok(manageMerchantInfoService.updateById(manageMerchantInfo));
    }

    /**
     * 通过id删除商户信息表
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id删除商户信息表", notes = "通过id删除商户信息表")
    @SysLog("通过id删除商户信息表" )
    @DeleteMapping("/{id}" )
    @PreAuthorize("@pms.hasPermission('admin_managemerchantinfo_del')" )
    public R removeById(@PathVariable Integer id) {
        return R.ok(manageMerchantInfoService.removeById(id));
    }

}
