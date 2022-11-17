package com.javafsd.userservice.vo;

public class DepartmentView 
{
    private Long departmentId;
    private String departmentName;    
    private String departmentAddress;    
    private String departmentCode;

    public DepartmentView() 
    {
        super();
    }

    public DepartmentView(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
        super();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "DepartmentView [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAddress="
                + departmentAddress + ", departmentCode=" + departmentCode + "]";
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }


}