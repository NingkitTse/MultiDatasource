package com.xnj.multidatasource.db2.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xnj.multidatasource.config.db.DataSource;
import com.xnj.multidatasource.config.db.DataSourceEnum;
import com.xnj.multidatasource.db2.entity.TestOra;
import com.xnj.multidatasource.db2.mapper.TestOraMapper;
import com.xnj.multidatasource.db2.service.ITestOraService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author NingkitTse
 * @since 2020-01-04
 */
@Service
@DataSource(DataSourceEnum.DB2)
public class TestOraServiceImpl extends ServiceImpl<TestOraMapper, TestOra> implements ITestOraService {

    @DataSource(DataSourceEnum.DB2)
    Page<TestOra> page(Page<TestOra> page, Wrapper<TestOra> queryWrapper) {
        return super.page(page, queryWrapper);
    }
}
