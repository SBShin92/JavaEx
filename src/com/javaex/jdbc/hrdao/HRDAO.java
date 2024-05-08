package com.javaex.jdbc.hrdao;

import java.util.List;

public interface HRDAO {
    public List<HRVO> getListFromSearch(String inputLine);
}
