package com.school.system.controller;

import com.alibaba.druid.util.StringUtils;
import com.school.system.domain.Student;
import com.school.system.domain.dto.MajorCourseDto;
import com.school.system.service.CourseService;
import com.school.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;

    @GetMapping("login")
    public String login() {
        return "student/login";
    }

    @GetMapping("index")
    public String index() {
        return "student/index";
    }

    @GetMapping("select")
    public String select(HttpSession session, Model model) {
//        List<Course> allCourses = courseService.getAllOptionalCourses();
        Student student = studentService.getStudentBySNum((String) session.getAttribute("studentNum"));
        List<MajorCourseDto> allCourses = courseService.getAllMajorOptionalCourses(student.getStudentMajorId());
        model.addAttribute("courses", allCourses);
        return "student/select";
    }

    @GetMapping("profile")
    public String profile(HttpSession session, Model model) {
        Student student = studentService.getStudentBySNum((String) session.getAttribute("studentNum"));
        model.addAttribute("student", student);
        return "student/profile";
    }

    @PostMapping("login")
    public String login(Student student, HttpSession session) {
        Student checkLogin = studentService.checkLogin(student);
        if (checkLogin != null) {
            session.setAttribute("id", checkLogin.getId());
            session.setAttribute("studentNum", checkLogin.getStudentNum());
            session.setAttribute("studentName", checkLogin.getStudentName());
            session.setAttribute("role", "student");
            return "redirect:/student/index";
        }
        return "redirect:/student/login";
    }

    @PostMapping("update")
    public String update(Student student) {
        studentService.updateStudent(student);
        return "redirect:/student/profile";
    }

    @GetMapping("adminUpdate")
    public String update(String id, Model model) {
        if (id != null && !StringUtils.equals(id, "")) {
            Student student = studentService.getStudentById(id);
            model.addAttribute("student", student);
        } else {
            model.addAttribute("student", new Student());
        }
        return "admin/studentUpdate";
    }

    @PostMapping("adminUpdate")
    public String adminUpdate(Student student) {
        if (student.getId() != null) {
            studentService.updateStudent(student);
        } else {
            studentService.insertStudent(student);
        }
        return "redirect:/admin/student";
    }

    @RequestMapping("delete")
    public String delete(String id) {
        if (id != null) {
            String ids[] = id.split(",");
            for (String id1 : ids) {
                studentService.deleteById(Integer.parseInt(id1));
            }
        }
        return "redirect:/admin/student";
    }
}
