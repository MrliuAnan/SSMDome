package org.lanqiao.bean;

import java.util.List;

/**
 * Created by 刘安 on 2017/9/4.
 */
public class Classes {
    //班级id
    private int classId;
    //班级名称
    private String className;
    //教师信息
    private Teacher teacher;
    //学生集合
    private List<Student> students;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
