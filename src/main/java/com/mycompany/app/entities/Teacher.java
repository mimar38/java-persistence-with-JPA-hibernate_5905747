package com.mycompany.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "teacher")
public class Teacher extends Member {

  @Column(name = "teacher_code")
  private String teacherCode;

  public String getTeacherCode() {
    return teacherCode;
  }

  public void setTeacherCode(String teacherCode) {
    this.teacherCode = teacherCode;
  }
}
