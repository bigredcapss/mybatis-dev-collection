package com.we.mapper;

import com.github.pagehelper.Page;
import com.we.entity.Blog;
import org.apache.ibatis.annotations.Select;

public interface BlogMapper {
    @Select("select bid, name, author_id as authorId from blog")
    Page<Blog> getBlogList ();
}