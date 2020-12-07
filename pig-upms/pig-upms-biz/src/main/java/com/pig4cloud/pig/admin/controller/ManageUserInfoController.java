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
import com.pig4cloud.pig.admin.entity.ManageUserInfo;
import com.pig4cloud.pig.admin.service.ManageUserInfoService;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * 用户信息表
 *
 * @author ccccchang
 * @date 2020-12-07 15:49:54
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/manageuserinfo" )
@Api(value = "manageuserinfo", tags = "用户信息表管理")
public class ManageUserInfoController {

    private final  ManageUserInfoService manageUserInfoService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param manageUserInfo 用户信息表
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    @PreAuthorize("@pms.hasPermission('admin_manageuserinfo_get')" )
    public R getManageUserInfoPage(Page page, ManageUserInfo manageUserInfo) {
        return R.ok(manageUserInfoService.page(page, Wrappers.query(manageUserInfo)));
    }


    /**
     * 通过id查询用户信息表
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{id}" )
    @PreAuthorize("@pms.hasPermission('admin_manageuserinfo_get')" )
    public R getById(@PathVariable("id" ) Integer id) {
        return R.ok(manageUserInfoService.getById(id));
    }

    /**
     * 新增用户信息表
     * @param manageUserInfo 用户信息表
     * @return R
     */
    @ApiOperation(value = "新增用户信息表", notes = "新增用户信息表")
    @SysLog("新增用户信息表" )
    @PostMapping
    @PreAuthorize("@pms.hasPermission('admin_manageuserinfo_add')" )
    public R save(@RequestBody ManageUserInfo manageUserInfo) {
        return R.ok(manageUserInfoService.save(manageUserInfo));
    }

    /**
     * 修改用户信息表
     * @param manageUserInfo 用户信息表
     * @return R
     */
    @ApiOperation(value = "修改用户信息表", notes = "修改用户信息表")
    @SysLog("修改用户信息表" )
    @PutMapping
    @PreAuthorize("@pms.hasPermission('admin_manageuserinfo_edit')" )
    public R updateById(@RequestBody ManageUserInfo manageUserInfo) {
        return R.ok(manageUserInfoService.updateById(manageUserInfo));
    }

    /**
     * 通过id删除用户信息表
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id删除用户信息表", notes = "通过id删除用户信息表")
    @SysLog("通过id删除用户信息表" )
    @DeleteMapping("/{id}" )
    @PreAuthorize("@pms.hasPermission('admin_manageuserinfo_del')" )
    public R removeById(@PathVariable Integer id) {
        return R.ok(manageUserInfoService.removeById(id));
    }

}
