package com.javaex.jdbc.hrdao;

import java.util.Date;

public class HRVO {
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private Date hire_date;
    private Long salary;
    public HRVO() {
    }
    public HRVO(String first_name, String last_name, String email, String phone_number,
            Date hire_date, Long salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.hire_date = hire_date;
        this.salary = salary;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public Date getHire_date() {
        return hire_date;
    }
    public Long getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "HRVO [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", phone_number="
                + phone_number + ", hire_date=" + hire_date + ", salary=" + salary + "]";
    }
    
}
