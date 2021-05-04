package com.gupaoedu.mybatis.v2.executor;

/**
 * @Author: qingshan
 */
public interface Executor {
    <T> T query (String statement, Object[] parameter, Class pojo);
}
