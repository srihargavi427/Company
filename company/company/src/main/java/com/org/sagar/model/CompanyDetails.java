package com.org.sagar.model;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CompanyDetails {
    @Id
    private int companyRank;

    public int getCompanyRank() {
        return companyRank;
    }

    public void setCompanyRank(int companyRank) {
        this.companyRank = companyRank;

    }
private String companyEmployeName;

    public String getCompanyEmployeName() {
        return companyEmployeName;
    }

    public void setCompanyEmployeName(String companyEmployeName) {
        this.companyEmployeName = companyEmployeName;
    }

    public String getCompanyEmployeGender() {
        return companyEmployeGender;
    }

    public void setCompanyEmployeGender(String companyEmployeGender) {
        this.companyEmployeGender = companyEmployeGender;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEmployersDesignation() {
        return companyEmployersDesignation;
    }

    public void setCompanyEmployersDesignation(String companyEmployersDesignation) {
        this.companyEmployersDesignation = companyEmployersDesignation;
    }

    public Integer getCompanyEmployerSalary() {
        return companyEmployerSalary;
    }

    public void setCompanyEmployerSalary(Integer companyEmployerSalary) {
        this.companyEmployerSalary = companyEmployerSalary;
    }

    public int getCompanyEmployeLeave() {
        return companyEmployeLeave;
    }

    public void setCompanyEmployeLeave(Integer companyEmployeLeave) {
        this.companyEmployeLeave = companyEmployeLeave;
    }

    private int companyEmployeLeave;
    private String companyEmployeGender;
    private String companyLocation;
    private String companyName;
    private String companyEmployersDesignation;
    private Integer companyEmployerSalary;
}
