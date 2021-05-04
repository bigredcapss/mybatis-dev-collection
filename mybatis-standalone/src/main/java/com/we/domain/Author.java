package com.we.domain;

import java.io.Serializable;


public class Author implements Serializable {
    // 作者ID
    Integer authorId;
    // 作者名称
    String authorName;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
