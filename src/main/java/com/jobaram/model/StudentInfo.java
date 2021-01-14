package com.jobaram.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"stdId"}, ignoreUnknown = true)
public class StudentInfo {
    private Integer stdId;
    private Integer academicYear;
    private Integer studentSrl;
    private Integer classroom;
    private Integer number;
    private String name;
    private String birth;
    private String address;
    private String phone;
    private String middleSchool;
    private ArrayList<Score> score;
    private Boolean industryAcademia;
    private ArrayList<WorkExperience> workExperience;
    private Boolean isEmployed;
    private Boolean isReturned;
    private Integer returnCnt;
    private String updateDate;


    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public Integer getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(Integer academicYear) {
        this.academicYear = academicYear;
    }

    public Integer getStudentSrl() {
        return studentSrl;
    }

    public void setStudentSrl(Integer studentSrl) {
        this.studentSrl = studentSrl;
    }

    public Integer getClassroom() {
        return classroom;
    }

    public void setClassroom(Integer classroom) {
        this.classroom = classroom;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMiddleSchool() {
        return middleSchool;
    }

    public void setMiddleSchool(String middleSchool) {
        this.middleSchool = middleSchool;
    }

    public ArrayList<Score> getScore() {
        return score;
    }

    public void setScore(ArrayList<Score> score) {
        this.score = score;
    }

    public Boolean getIndustryAcademia() {
        return industryAcademia;
    }

    public void setIndustryAcademia(Boolean industryAcademia) {
        this.industryAcademia = industryAcademia;
    }

    public ArrayList<WorkExperience> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(ArrayList<WorkExperience> workExperience) {
        this.workExperience = workExperience;
    }

    public Boolean getEmployed() {
        return isEmployed;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }

    public Boolean getReturned() {
        return isReturned;
    }

    public void setReturned(Boolean returned) {
        isReturned = returned;
    }

    public Integer getReturnCnt() {
        return returnCnt;
    }

    public void setReturnCnt(Integer returnCnt) {
        this.returnCnt = returnCnt;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
