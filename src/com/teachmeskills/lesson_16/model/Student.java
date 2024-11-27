package com.teachmeskills.lesson_16.model;

import java.util.Objects;

public class Student {

    private final String firsName;
    private final String speciality;
    private final String groupNumber;

    public Student(String firsName, String speciality, String groupNumber) {
        this.firsName = firsName;
        this.speciality = speciality;
        this.groupNumber = groupNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firsName, student.firsName) &&
                Objects.equals(speciality, student.speciality) &&
                Objects.equals(groupNumber, student.groupNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, speciality, groupNumber);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, group %s",
                firsName, speciality, groupNumber);
    }
}