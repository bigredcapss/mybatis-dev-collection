package com.we.domain;

import java.io.Serializable;

public class Comment implements Serializable {
    private static final long serialVersionUID = 2331606517035782666L;
    // 评论ID
    Integer commentId;
    // 所属文章ID
    Integer bid;
    // 内容
    String content;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", bid=" + bid +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
