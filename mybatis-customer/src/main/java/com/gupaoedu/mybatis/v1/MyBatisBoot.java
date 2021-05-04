package com.gupaoedu.mybatis.v1;

import com.gupaoedu.mybatis.v1.mapper.BlogMapper;

/**
 * @Author: qingshan
 */
public class MyBatisBoot {
    public static void main(String[] args) {
        GPSqlSession sqlSession = new GPSqlSession(new GPConfiguration(), new GPExecutor());
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        blogMapper.selectBlogById(1);
    }
}
