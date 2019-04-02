package com.school.system.service.impl;

import com.school.system.dao.StudentMapper;
import com.school.system.domain.Student;
import com.school.system.domain.StudentExample;
import com.school.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student checkLogin(Student student) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentNumEqualTo(student.getStudentNum()).andStudentPasswordEqualTo(student.getStudentPassword());
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students != null && students.size() > 0 ? students.get(0) : null;
    }

    @Override
    public Student getStudentBySNum(String studentNum) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentNumEqualTo(studentNum);
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students != null && students.size() > 0 ? students.get(0) : null;
    }

    @Override
    public int updateStudent(Student student) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andIdEqualTo(student.getId());
        return studentMapper.updateByExampleSelective(student, studentExample);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.selectByExample(new StudentExample());
    }

    @Override
    public Student getStudentById(String id) {
        return studentMapper.selectByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int deleteById(int id) {
        return studentMapper.deleteByPrimaryKey(id);
    }
}
