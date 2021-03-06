package com.atguigu.mybatis.bean;

import lombok.Data;

/**
 * @author CYH
 * @date 2017/12/30 0030
 */
@Data
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;
    private Department department;

    public Employee() {}


    public Employee(Integer id, String lastName, String email, String gender) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public Employee(Integer id, String lastName, String email, String gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", gender='"
                + gender + '\'' + '}';
    }
}
