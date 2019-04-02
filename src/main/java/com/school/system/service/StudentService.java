package com.school.system.service;

import com.school.system.domain.Student;

import java.util.List;

public interface StudentService {
    Student checkLogin(Student student);

    Student getStudentBySNum(String studentNum);

    int updateStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(String id);

    int insertStudent(Student student);

    int deleteById(int parseInt);
}
