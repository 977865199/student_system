package com.student_system.pojo;

import java.util.Date;

public class Student {
    private String studentId;

    private String studentName;

    private String sex;

    private String sfzId;

    private String tel;

    private String marjorName;

    private String studentClass;

    private Date enterDate;

    private Date leaveDate;

    private Date birthday;

    private String address;

    private String graschool;

    private String nation;

    private String nativePlace;

    private String politicstatus;

    private String studentPassword;

    private String remark;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSfzId() {
        return sfzId;
    }

    public void setSfzId(String sfzId) {
        this.sfzId = sfzId == null ? null : sfzId.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMarjorName() {
        return marjorName;
    }

    public void setMarjorName(String marjorName) {
        this.marjorName = marjorName == null ? null : marjorName.trim();
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass == null ? null : studentClass.trim();
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGraschool() {
        return graschool;
    }

    public void setGraschool(String graschool) {
        this.graschool = graschool == null ? null : graschool.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getPoliticstatus() {
        return politicstatus;
    }

    public void setPoliticstatus(String politicstatus) {
        this.politicstatus = politicstatus == null ? null : politicstatus.trim();
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword == null ? null : studentPassword.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}