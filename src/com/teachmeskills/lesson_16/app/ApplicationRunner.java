package com.teachmeskills.lesson_16.app;

import com.teachmeskills.lesson_16.model.Student;
import com.teachmeskills.lesson_16.repository.StudentPassportRepository;

import java.util.Map;

/** Task 1.
 * Create a collection of passport numbers (String format).
 * Create a collection of students from our group.
 * There should be no duplicate items in each collection.
 * Create a key-value collection, where the key will be the
 * passport number from the first collection, and the value will be the
 * Student class object from the second collection.
 * Go through the key-value collection in a for-each loop and
 * display the collection items on the screen.
 */

public class ApplicationRunner {

    public static void main(String[] args) {

        StudentPassportRepository repository = new StudentPassportRepository();

        Map<String, Student> studentPassportMap = repository.createStudentPassportMap();

        repository.displayStudentPassportInfo(studentPassportMap);
    }
}