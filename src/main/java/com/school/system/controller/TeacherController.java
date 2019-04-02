package com.school.system.controller;

import com.alibaba.druid.util.StringUtils;
import com.school.system.domain.Teacher;
import com.school.system.service.CourseService;
import com.school.system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private CourseService courseService;

    @GetMapping("login")
    public String login() {
        return "teacher/login";
    }

    @GetMapping("index")
    public String index() {
        return "teacher/index";
    }

    @GetMapping("profile")
    public String profile(HttpSession session, Model model) {
        Teacher teacher = teacherService.getTeacherByTeacherNum((String) session.getAttribute("teacherNum"));
        model.addAttribute("teacher", teacher);
        return "teacher/profile";
    }

    @PostMapping("login")
    public String login(Teacher teacher, HttpSession session) {
        Teacher checkLogin = teacherService.checkLogin(teacher);
        if (checkLogin != null) {
            session.setAttribute("id", checkLogin.getId());
            session.setAttribute("teacherNum", checkLogin.getTeacherNum());
            session.setAttribute("teacherName", checkLogin.getTeacherName());
            session.setAttribute("role", "teacher");
            return "redirect:/teacherNum/index";
        }
        return "redirect:/teacherNum/login";
    }

    @GetMapping("adminUpdate")
    public String update(String id, Model model) {
        if (id != null && !StringUtils.equals(id, "")) {
            Teacher teacher = teacherService.getTeacherById(id);
            model.addAttribute("teacher", teacher);
        } else {
            model.addAttribute("teacher", new Teacher());
        }
        return "admin/teacherUpdate";
    }

    @PostMapping("adminUpdate")
    public String adminUpdate(Teacher teacher) {
        if (teacher.getId() != null) {
            teacherService.updateTeacher(teacher);
        } else {
            teacherService.insertTeacher(teacher);
        }
        return "redirect:/admin/teacher";
    }

    @PostMapping("update")
    public String update(Teacher teacher, HttpSession session) {
        teacherService.updateTeacher(teacher);
        session.setAttribute("teacherNum", teacher.getTeacherNum());
        return "redirect:/teacher/profile";
    }

    @RequestMapping("delete")
    public String delete(String id) {
        if (id != null) {
            String ids[] = id.split(",");
            for (String id1 : ids) {
                teacherService.deleteById(Integer.parseInt(id1));
            }
        }
        return "redirect:/admin/teacher";
    }
}