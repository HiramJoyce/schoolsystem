package com.school.system.service.impl;

import com.school.system.dao.TeacherMapper;
import com.school.system.domain.*;
import com.school.system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher checkLogin(Teacher teacher) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeacherNumEqualTo(teacher.getTeacherNum()).andTeacherPasswordEqualTo(teacher.getTeacherPassword());
        List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
        return teachers != null && teachers.size() > 0 ? teachers.get(0) : null;
    }

    @Override
    public Teacher getTeacherByTeacherNum(String teacherNum) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeacherNumEqualTo(teacherNum);
        List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
        return teachers != null && teachers.size() > 0 ? teachers.get(0) : null;
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andIdEqualTo(teacher.getId());
        return teacherMapper.updateByExampleSelective(teacher, teacherExample);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherMapper.selectByExample(new TeacherExample());
    }

    @Override
    public Teacher getTeacherById(String id) {
        return teacherMapper.selectByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public int insertTeacher(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public int deleteById(int id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }
}
