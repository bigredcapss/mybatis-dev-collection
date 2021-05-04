package com.we.mapper;

import com.we.domain.Blog;
/**
 * 扩展类继承了MBG生成的接口和Statement
 * @author BigRedCaps
 * @date 2021/5/4 10:32
 */
public interface BlogMapperExt extends BlogMapper {
    /**
     * 根据名称查询文章
     * @param name
     * @return
     */
    public Blog selectBlogByName (String name);
}
