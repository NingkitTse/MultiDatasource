package com.xnj.multidatasource.db2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xnj.multidatasource.config.db.DataSource;
import com.xnj.multidatasource.config.db.DataSourceEnum;
import com.xnj.multidatasource.db2.entity.TestOra;
import com.xnj.multidatasource.db2.service.ITestOraService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author NingkitTse
 * @since 2020-01-04
 */
@RestController
@RequestMapping("/db2/test-ora")
@DataSource(DataSourceEnum.DB2)
public class TestOraController {
    
    @Autowired
    private ITestOraService service;

    @GetMapping(value = "/infos")
    @DataSource(DataSourceEnum.DB2)
    public IPage<TestOra> infos(Page<TestOra> page) {
        page.setPages(0);
        return service.page(page, null);
    }
}
