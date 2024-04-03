package com.javaex.api.generic;

public class ObjectBox {
    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "content=" + content +
                '}';
    }
}
