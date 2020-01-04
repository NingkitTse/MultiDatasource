package com.xnj.multidatasource.config.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.xnj.multidatasource.util.DataSourceContextHolder;

public class MultipleDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}