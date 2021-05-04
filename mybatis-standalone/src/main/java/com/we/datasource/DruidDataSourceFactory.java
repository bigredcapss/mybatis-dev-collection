package com.we.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 自定义Druid数据源，全部使用默认配置
 * @author BigRedCaps
 * @date 2021/5/4 10:23
 */
public class DruidDataSourceFactory implements DataSourceFactory {
    private Properties props;

    @Override
    public void setProperties(Properties props) {
        this.props = props;
    }

    @Override
    public DataSource getDataSource() {
        DruidDataSource dds = new DruidDataSource();
        dds.setUrl(this.props.getProperty("url"));
        dds.setPassword(this.props.getProperty("password"));
        dds.setUsername(this.props.getProperty("username"));
        dds.setDriverClassName(this.props.getProperty("driver"));
        try {
            dds.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dds;
    }
}