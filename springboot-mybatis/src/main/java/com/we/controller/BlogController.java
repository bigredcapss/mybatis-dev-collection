package com.we.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.we.mapper.BlogMapper;
import com.we.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @Autowired
    BlogMapper blogMapper;

    // http://localhost:9088/getBlogList?pageNum=1&pageSize=2
    @RequestMapping("/getBlogList")
    public Page<Blog> getUserList(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        Page<Blog> userList= blogMapper.getBlogList();
        return userList;
    }

}
