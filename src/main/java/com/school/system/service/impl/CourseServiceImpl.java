package com.school.system.service.impl;

import com.school.system.dao.CourseMapper;
import com.school.system.domain.Course;
import com.school.system.domain.CourseExample;
import com.school.system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

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
}
