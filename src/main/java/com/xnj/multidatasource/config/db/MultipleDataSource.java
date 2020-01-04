package com.xnj.multidatasource.config.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.xnj.multidatasource.util.DataSourceContextHolder;

/**
 * 路由数据源实现：多数据源<br>
 * 通过ThreadLocal变量来获取当前线程所需要的数据源Key，并告知AbstractRoutingDataSource，从而切换数据源
 * @author w24882 xieningjie
 * @date 2020年1月4日
 */
public class MultipleDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}