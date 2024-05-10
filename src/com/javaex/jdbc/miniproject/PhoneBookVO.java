package com.javaex.jdbc.miniproject;

public class PhoneBookVO {
    private Long id;
    private String name;
    private String hp;
    private String tel;

    public PhoneBookVO(Long id, String name, String hp, String tel) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.tel = tel;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHp() {
        return hp;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "PhoneBookVO [id=" + id + ", name=" + name + ", hp=" + hp + ", tel=" + tel + "]";
    }
}
