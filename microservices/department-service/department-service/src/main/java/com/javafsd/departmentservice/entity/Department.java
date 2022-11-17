 package com.javafsd.departmentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name ="department")
public class Department {

    public Department(long deparmtmentId, String department_name, String department_address, String department_code) {
        super();
        this.deparmtmentId = deparmtmentId;
        this.department_name = department_name;
        this.department_address = department_address;
        this.department_code = department_code;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deparment_id")
    private long deparmtmentId;

    @Column(name = "deparment_name")
    private String department_name;

    @Column(name = "deparment_address")
    private String department_address;

    @Column(name = "deparment_code")
    private String department_code;

    /**
     * @return the deparmtmentId
     */
    public long getDeparmtmentId() {
        return deparmtmentId;
    }

    /**
     * @param deparmtmentId the deparmtmentId to set
     */
    public void setDeparmtmentId(long deparmtmentId) {
        this.deparmtmentId = deparmtmentId;
    }

    /**
     * @return the department_name
     */
    public String getDepartment_name() {
        return department_name;
    }

    /**
     * @param department_name the department_name to set
     */
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    /**
     * @return the department_address
     */
    public String getDepartment_address() {
        return department_address;
    }

    /**
     * @param department_address the department_address to set
     */
    public void setDepartment_address(String department_address) {
        this.department_address = department_address;
    }

    /**
     * @return the department_code
     */
    public String getDepartment_code() {
        return department_code;
    }

    /**
     * @param department_code the department_code to set
     */
    public void setDepartment_code(String department_code) {
        this.department_code = department_code;
    }

    @Override
    public String toString() {
        return "Department [deparmtmentId=" + deparmtmentId + ", department_name=" + department_name
                + ", department_address=" + department_address + ", department_code=" + department_code + "]";
    }

}