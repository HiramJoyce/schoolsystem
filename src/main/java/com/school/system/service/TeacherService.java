package com.school.system.service;

import com.school.system.domain.Teacher;
import com.school.system.domain.dto.TeacherDto;

import java.util.List;

public interface TeacherService {
    Teacher checkLogin(Teacher teacher);

    Teacher getTeacherByTeacherNum(String teacherNum);

    int updateTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();

    Teacher getTeacherById(String id);

    int insertTeacher(Teacher teacher);

    int deleteById(int id);

    List<TeacherDto> getAllTeacherDtos();
}
