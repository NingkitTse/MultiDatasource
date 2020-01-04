package com.xnj.multidatasource.db1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xnj.multidatasource.db1.entity.Test;
import com.xnj.multidatasource.db1.service.ITestService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author NingkitTse
 * @since 2020-01-04
 */
@RestController
@RequestMapping("/db1/test")
public class TestController {
    @Autowired
    private ITestService service;

    @GetMapping(value = "/infos")
    public IPage<Test> selectWithMap(Page<Test> page) {
        return service.page(page, null);
    }
}
