package com.javaex.api.generic;

public class StringBox {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "StringBox{" +
                "content='" + content + '\'' +
                '}';
    }
}
