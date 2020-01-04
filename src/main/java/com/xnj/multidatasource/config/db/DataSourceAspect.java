package com.xnj.multidatasource.config.db;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.xnj.multidatasource.util.DataSourceContextHolder;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Aspect
@Order(-1)
public class DataSourceAspect {

    private static final Logger LOG = LoggerFactory.getLogger(DataSourceAspect.class);

    @Pointcut("@within(com.xnj.multidatasource.config.db.DataSource) || @annotation(com.xnj.multidatasource.config.db.DataSource)")
    public void pointCut() {

    }
    
    @Before("pointCut() && @annotation(dataSource)")
    public void doBefore(DataSource dataSource) {
        LOG.info("选择数据源---" + dataSource.value().getValue());
        DataSourceContextHolder.setDataSource(dataSource.value().getValue());
    }

    @After("pointCut()")
    public void doAfter() {
        LOG.info("释放数据源---");
        DataSourceContextHolder.clear();
    }
}