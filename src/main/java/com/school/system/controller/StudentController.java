package com.school.system.controller;

import com.school.system.domain.Course;
import com.school.system.domain.Student;
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
    public String select(Model model) {
        List<Course> allCourses = courseService.getAllOptionalCourses();
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
}
