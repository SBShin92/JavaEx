package com.javaex.jdbc.hrdao;

import java.util.List;

public interface HRDAO {
    public List<HRVO> getListFromSearchName(String inputLine);

    public List<HRVO> getListFromMinMaxSalary(Long minSalary, Long maxSalary);
}
