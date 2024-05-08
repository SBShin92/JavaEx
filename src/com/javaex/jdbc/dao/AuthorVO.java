package com.javaex.jdbc.dao;

public class AuthorVO {
    private Long authorId;
    private String authorName;
    private String authorDesc;

    public AuthorVO() {
    }

    public AuthorVO(Long authorId, String authorName, String authorDesc) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorDesc = authorDesc;
    }

    public AuthorVO(String authorName, String authorDesc) {
        this.authorName = authorName;
        this.authorDesc = authorDesc;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorDesc() {
        return authorDesc;
    }

    @Override
    public String toString() {
        return "AuthorVO [authorId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
    }

}
