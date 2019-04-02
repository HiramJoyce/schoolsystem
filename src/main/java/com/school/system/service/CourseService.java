package com.school.system.service;

import com.school.system.domain.Course;
import com.school.system.domain.dto.MajorCourseDto;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();

    List<Course> getAllOptionalCourses();

    Course getCouseById(String id);

    int updateCourse(Course course);

    int insertCourse(Course course);

    int deleteById(int id);

    List<MajorCourseDto> getAllMajorOptionalCourses(int major);

    int insertCourseStudent(String courseId, Integer studentId);

    int deleteCourseStudent(String courseId, Integer studentId);
}
