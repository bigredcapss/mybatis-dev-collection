package com.we.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Statement;
import java.util.Properties;

/**
 * 拦截StatementHandler的query方法
 * @author BigRedCaps
 * @date 2021/5/4 10:32
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "query", args = { Statement.class, ResultHandler.class}) })
public class SQLInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        long startTime = System.currentTimeMillis();
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        String sql = boundSql.getSql();
        System.out.println("获取到SQL语句："+sql);

        try {
            return invocation.proceed();
        }finally {
            long endTime = System.currentTimeMillis();
            System.out.println("SQL执行耗时：" + (endTime-startTime) +"ms");
        }

    }

    @Override
    public Object plugin(Object target) {
        // 用MyBatis自带的Plugin类，对目标类进行包装
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        String gupao = properties.getProperty("gupao");
        // System.out.println("获取到的参数："+ gupao);
    }
}
