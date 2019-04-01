package com.school.system.service;

import com.school.system.domain.Student;

public interface StudentService {
    Student checkLogin(Student student);

    Student getStudentBySNum(String studentNum);

    int updateStudent(Student student);
}
