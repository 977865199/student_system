package com.student_system.pojo;

public class Teacher {
    private String teacherId;

    private String teacherName;

    private String sex;

    private String tel;

    private String title;

    private String politicstatus;

    private String graschool;

    private String remark;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPoliticstatus() {
        return politicstatus;
    }

    public void setPoliticstatus(String politicstatus) {
        this.politicstatus = politicstatus == null ? null : politicstatus.trim();
    }

    public String getGraschool() {
        return graschool;
    }

    public void setGraschool(String graschool) {
        this.graschool = graschool == null ? null : graschool.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}