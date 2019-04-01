package com.school.system.service;

import com.school.system.domain.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();

    List<Course> getAllOptionalCourses();
}
