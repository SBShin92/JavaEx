package com.javaex.api.generic;

public class IntegerBox {
    private Integer content;

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "IntegerBox{" +
                "content=" + content +
                '}';
    }
}
