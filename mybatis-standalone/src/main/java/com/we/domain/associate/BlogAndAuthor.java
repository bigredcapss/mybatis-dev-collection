package com.we.domain.associate;

import com.we.domain.Author;
import java.io.Serializable;


public class BlogAndAuthor implements Serializable {
    // 文章ID
    Integer bid;
    // 文章标题
    String name;
    // 作者
    Author author;

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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BlogAndAuthor{" +
                "bid=" + bid +
                ", name='" + name + '\'' +
                ", author=" + author +
                '}';
    }
}
