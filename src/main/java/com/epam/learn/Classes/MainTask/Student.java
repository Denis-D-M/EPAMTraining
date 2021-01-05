package com.epam.learn.Classes.MainTask;

public class Student {
    int id;
    String secondName;
    String firstName;
    String patronymic;
    String birthday;
    String phoneNumber;
    String course;
    String studentClass;
    String group;

    public Student(int id, String secondName, String firstName, String patronymic, String birthday, String phoneNumber, String course, String studentClass, String group) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.studentClass = studentClass;
        this.group = group;
    }
    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", course='" + course + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
