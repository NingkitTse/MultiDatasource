package com.xnj.multidatasource.db2.service;

import com.xnj.multidatasource.config.db.DataSource;
import com.xnj.multidatasource.config.db.DataSourceEnum;
import com.xnj.multidatasource.db2.entity.TestOra;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author NingkitTse
 * @since 2020-01-04
 */
@DataSource(DataSourceEnum.DB2)
public interface ITestOraService extends IService<TestOra> {

}
