package com.school.system.controller;

import com.alibaba.druid.util.StringUtils;
import com.school.system.domain.Course;
import com.school.system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("adminUpdate")
    public String update(String id, Model model) {
        if (id != null && !StringUtils.equals(id, "")) {
            Course course = courseService.getCouseById(id);
            model.addAttribute("course", course);
        } else {
            model.addAttribute("course", new Course());
        }
        return "admin/courseUpdate";
    }

    @PostMapping("adminUpdate")
    public String adminUpdate(Course course) {
        if (course.getId() != null) {
            courseService.updateCourse(course);
        } else {
            courseService.insertCourse(course);
        }
        return "redirect:/admin/course";
    }

    @RequestMapping("delete")
    public String delete(String id) {
        if (id != null) {
            String ids[] = id.split(",");
            for (String id1 : ids) {
                courseService.deleteById(Integer.parseInt(id1));
            }
        }
        return "redirect:/admin/course";
    }

    @RequestMapping("select")
    public String select(String id, HttpSession session) {
        courseService.insertCourseStudent(id, (Integer) session.getAttribute("id"));
        return "redirect:/student/index";
    }

    @RequestMapping("unSelect")
    public String unSelect(String id, HttpSession session) {
        courseService.deleteCourseStudent(id, (Integer) session.getAttribute("id"));
        return "redirect:/student/index";
    }
}
