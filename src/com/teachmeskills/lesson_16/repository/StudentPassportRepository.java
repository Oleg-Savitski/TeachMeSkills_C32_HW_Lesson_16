package com.teachmeskills.lesson_16.repository;

import com.teachmeskills.lesson_16.model.Passport;
import com.teachmeskills.lesson_16.model.Student;
import com.teachmeskills.lesson_16.service.PassportService;
import com.teachmeskills.lesson_16.service.StudentService;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentPassportRepository {

    private final PassportService passportService;
    private final StudentService studentService;

    public StudentPassportRepository() {
        this.passportService = new PassportService();
        this.studentService = new StudentService();
    }

    public Map<String, Student> createStudentPassportMap() {
        Set<Passport> passports = passportService.generatePassports();
        Set<Student> students = studentService.createStudents();

        Map<String, Student> studentMap = new TreeMap<>();

        Iterator<Passport> passportIterator = passports.iterator();
        Iterator<Student> studentIterator = students.iterator();

        while (passportIterator.hasNext() && studentIterator.hasNext()) {
            Passport passport = passportIterator.next();
            Student student = studentIterator.next();

            studentMap.put(passport.getFullPassportNumber(), student);
        }

        return studentMap;
    }

    public void displayStudentPassportInfo(Map<String, Student> studentMap) {
        System.out.println("Information about students and their passports:");
        System.out.println();
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Passport: " + entry.getKey());
            System.out.println("Student: " + entry.getValue());
            System.out.println("----------------------------");
        }
    }
}