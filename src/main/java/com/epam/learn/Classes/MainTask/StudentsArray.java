package com.epam.learn.Classes.MainTask;

import java.util.TreeSet;

public class StudentsArray {
    private Student[] students;
    private int nElems = 0;

    public void create(int n) {
        students = new Student[n];
    }

    public void set(Student student) {
        students[nElems] = student;
        nElems++;
    }

    public Student getById(int id) {
        for (int i = 0; i < nElems; i++) {
            if (students[i].id == id) return students[i];
        }
        return null;
    }

    public void showByClass(String s) {
        for (Student student : students) {
            if (student.studentClass.equalsIgnoreCase(s)) System.out.println(student.toString());
        }
    }
    // Довольно долго возился с этим методом (даже слишком долго). В итоге пришёл к такому вот решению. Думаю есть способы лучше и проще :/
    public void showByClassesNCourses() {
        TreeSet<String> classes = new TreeSet<>();
        TreeSet<String> courses = new TreeSet<>();
        for (int i = 0; i < nElems; i++) {
            classes.add(students[i].studentClass);
            courses.add(students[i].course);
        }
        for (String s : classes) {
            System.out.println(s);
            for (int i = 0; i < nElems; i++) {
                if (students[i].studentClass.contains(s)) System.out.println(students[i].toString());
            }
        }

        for (String s : courses) {
            System.out.println(s);
            for (int i = 0; i < nElems; i++) {
                if (students[i].course.contains(s)) System.out.println(students[i].toString());
            }
        }
    }
    // выглядит очень элегантно, но, наверное, непонятно XD
    public void studentsAfterYear(int year){
        for (int i = 0; i < nElems; i++) {
            if(Integer.parseInt(students[i].birthday.split("\\.")[2]) >= year){
                System.out.println(students[i].toString());
            }
        }
    }
    public void studentsByGroup(String group){
        for (int i = 0; i < nElems; i++) {
            if (students[i].group.equalsIgnoreCase(group)) System.out.println(students[i].toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < nElems; i++) {
            stringBuffer.append("id=").append(students[i].id).append(", secondName='").append(students[i].secondName).append('\'').append(", firstName='").append(students[i].firstName).append('\'').append(", patronymic='").append(students[i].patronymic).append('\'').append(", birthday='").append(students[i].birthday).append('\'').append(", phoneNumber='").append(students[i].phoneNumber).append('\'').append(", course='").append(students[i].course).append('\'').append(", studentClass='").append(students[i].studentClass).append('\'').append(", group='").append(students[i].group).append('\'').append('}');

        }
        return stringBuffer.toString();
    }
}
