package com.we.domain.associate;

import com.we.domain.Comment;
import java.io.Serializable;
import java.util.List;


public class BlogAndComment implements Serializable {
    private static final long serialVersionUID = -4922258533433373498L;
    // 文章ID
    Integer bid;
    // 文章标题
    String name;
    // 文章作者ID
    Integer authorId;
    // 文章评论
    List<Comment> comment;

    @Override
    public String toString() {
        return "BlogAndComment{" +
                "bid=" + bid +
                ", name='" + name + '\'' +
                ", authorId=" + authorId +
                ", comment=" + comment +
                '}';
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
