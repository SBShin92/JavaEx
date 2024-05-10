package com.javaex.jdbc.miniproject;

import java.util.List;

public interface PhoneBookDAO {
    public boolean checkPhoneBookTable();

    public boolean dropPhoneBookTable();
    
    public List<PhoneBookVO> getList();
    public boolean insert(String name, String hp, String tel);
    public boolean delete(Long id);
    public List<PhoneBookVO> search(String searchInputString);
}
