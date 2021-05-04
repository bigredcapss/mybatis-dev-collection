package com.we.domain.associate;

import java.io.Serializable;
import java.util.List;


public class AuthorAndBlog implements Serializable {
    private static final long serialVersionUID = 6050142236340069059L;
    // 作者ID
    Integer author_id;
    // 作者名称
    String author_name;
    // 文章和评论列表
    List<BlogAndComment> blog;

    @Override
    public String toString() {
        return "AuthorAndBlog{" +
                "author_id=" + author_id +
                ", author_name='" + author_name + '\'' +
                ", blog=" + blog +
                '}';
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public List<BlogAndComment> getBlog() {
        return blog;
    }

    public void setBlog(List<BlogAndComment> blog) {
        this.blog = blog;
    }
}
