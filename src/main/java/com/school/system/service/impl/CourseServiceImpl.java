package com.school.system.service.impl;

import com.school.system.dao.CourseMapper;
import com.school.system.dao.CourseStudentMapper;
import com.school.system.domain.Course;
import com.school.system.domain.CourseExample;
import com.school.system.domain.CourseStudent;
import com.school.system.domain.CourseStudentExample;
import com.school.system.domain.dto.MajorCourseDto;
import com.school.system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseStudentMapper courseStudentMapper;

    @Override
    public List<Course> getAllCourses() {
        CourseExample courseExample = new CourseExample();
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public List<Course> getAllOptionalCourses() {
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();
        criteria.andCourseTypeEqualTo(2);
        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public Course getCouseById(String id) {
        return courseMapper.selectByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public int updateCourse(Course course) {
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();
        criteria.andIdEqualTo(course.getId());
        return courseMapper.updateByExampleSelective(course, courseExample);
    }

    @Override
    public int insertCourse(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int deleteById(int id) {
        return courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<MajorCourseDto> getAllMajorOptionalCourses(int major) {
        return courseMapper.selectAllMajorOptionalCourses(major);
    }

    @Override
    public int insertCourseStudent(String courseId, Integer studentId) {
        CourseStudent courseStudent = new CourseStudent();
        courseStudent.setCsCourseId(Integer.parseInt(courseId));
        courseStudent.setCsStudentId(studentId);
        CourseStudentExample courseStudentExample = new CourseStudentExample();
        CourseStudentExample.Criteria criteria = courseStudentExample.createCriteria();
        criteria.andCsCourseIdEqualTo(Integer.parseInt(courseId)).andCsStudentIdEqualTo(studentId);
        List<CourseStudent> courseStudents = courseStudentMapper.selectByExample(courseStudentExample);
        if (courseStudents == null || courseStudents.size() <= 0) {
            return courseStudentMapper.insert(courseStudent);
        }
        return 0;
    }

    @Override
    public int deleteCourseStudent(String courseId, Integer studentId) {
        CourseStudentExample courseStudentExample = new CourseStudentExample();
        CourseStudentExample.Criteria criteria = courseStudentExample.createCriteria();
        criteria.andCsCourseIdEqualTo(Integer.parseInt(courseId)).andCsStudentIdEqualTo(studentId);
        return courseStudentMapper.deleteByExample(courseStudentExample);
    }
}
