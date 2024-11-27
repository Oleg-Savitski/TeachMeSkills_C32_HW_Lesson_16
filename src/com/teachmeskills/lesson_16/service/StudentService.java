package com.teachmeskills.lesson_16.service;

import com.teachmeskills.lesson_16.model.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentService {

    public Set<Student> createStudents() {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Илья", "student", "С32-onl"));
        students.add(new Student("Екатерина", "student", "С32-onl"));
        students.add(new Student("Марина", "developer", "С32-onl"));
        students.add(new Student("Султан", "engineer", "С32-onl"));
        students.add(new Student("Дмитрий Х*****а", "developer", "С32-onl"));
        students.add(new Student("Игорь", "developer", "С32-onl"));
        students.add(new Student("Даниил", "developer", "С32-onl"));
        students.add(new Student("Дмитрий В*****ч", "developer", "С32-onl"));
        students.add(new Student("Олег", "developer", "С32-onl"));
        students.add(new Student("Влад", "developer", "С32-onl"));
        students.add(new Student("Рита", "manual tester", "С32-onl"));
        students.add(new Student("Киррил Р******с", "developer", "С32-onl"));
        students.add(new Student("Сергей", "developer", "С32-onl"));
        students.add(new Student("Богдан", "student", "С32-onl"));
        students.add(new Student("Киррил М******ч", "developer", "С32-onl"));
        return students;
    }
}