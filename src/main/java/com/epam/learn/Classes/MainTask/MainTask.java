package com.epam.learn.Classes.MainTask;

public class MainTask {
    public static void main(String[] args) {
        StudentsArray studentsArray = new StudentsArray();
        studentsArray.create(10);
        studentsArray.set(new Student(0, "Мишин", "Денис", "Дмитриевич", "30.10.2000", "895024342343", "3", "Engineering", "ПИБ-1803б"));
        studentsArray.set(new Student(1, "Юдин", "Антон", "Михайлович", "12.12.2001", "895045623495", "2", "Automatics", "ПИБ-1802а"));
        studentsArray.set(new Student(2, "Арсеньев", "Борис", "Петрович", "16.11.1999", "89501239525", "4", "Programming", "ПИБ-1803б"));
        studentsArray.set(new Student(3, "Коколов", "Михаил", "Владимирович", "25.08.2000", "89504029483", "1", "Nurse", "ПИБ-1802а"));
        studentsArray.set(new Student(4, "Николаев", "Даниил", "Иванович", "23.06.2000", "89504364934", "3", "Mechanic", "ПИБ-1803а"));
        studentsArray.set(new Student(5, "Мишин", "Денис", "Дмитриевич", "30.10.2000", "895024342343", "3", "Engineering", "ПИБ-1803а"));
        studentsArray.set(new Student(6, "Юдин", "Антон", "Михайлович", "12.12.2001", "895045623495", "2", "Automatics", "ПИБ-1803б"));
        studentsArray.set(new Student(7, "Арсеньев", "Борис", "Петрович", "16.11.1999", "89501239525", "4", "Programming", "ПИБ-1803б"));
        studentsArray.set(new Student(8, "Коколов", "Михаил", "Владимирович", "25.08.2000", "89504029483", "1", "Nurse", "ПИБ-1803а"));
        studentsArray.set(new Student(9, "Николаев", "Даниил", "Иванович", "23.06.2000", "89504364934", "3", "Mechanic", "ПИБ-1803б"));

        studentsArray.studentsByGroup("Пиб-1802а");
    }
}
