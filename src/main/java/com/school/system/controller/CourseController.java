package com.school.system.controller;

import com.alibaba.druid.util.StringUtils;
import com.school.system.domain.Course;
import com.school.system.domain.Paper;
import com.school.system.domain.Score;
import com.school.system.domain.Teacher;
import com.school.system.domain.dto.CourseDto;
import com.school.system.domain.dto.StudentFileDto;
import com.school.system.service.CourseService;
import com.school.system.service.PaperService;
import com.school.system.service.ScoreService;
import com.school.system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private ScoreService scoreService;
    @Autowired
    private PaperService paperService;

    @GetMapping("info")
    public String info(String id, Model model, HttpSession session) {
        CourseDto course = courseService.getCouseDtoById(Integer.parseInt(id));
        model.addAttribute("course", course);
        Score score = scoreService.getScoreByStudentIdAndCourseId((Integer) session.getAttribute("id"), Integer.parseInt(id));
        model.addAttribute("score", score);
        Paper paper = paperService.getPaperByStudentIdAndCourseId((Integer) session.getAttribute("id"), Integer.parseInt(id));
        model.addAttribute("paper", paper);
        return "student/course";
    }

    @GetMapping("teacherInfo")
    public String teacherInfo(String id, Model model) {
        List<StudentFileDto> studentDtos = courseService.getCourseStudentsByCourseId(Integer.parseInt(id));
        model.addAttribute("students", studentDtos);
        return "teacher/course";
    }

    @PostMapping("paper")
    public String paper(HttpSession session, Paper paper, @RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) throws IOException {
        Paper paperDB = paperService.getPaperByStudentIdAndCourseId((Integer) session.getAttribute("id"), paper.getPaperCourseId());
        if (paperDB != null) {
            return "redirect:/course/info?id=" + paper.getPaperCourseId();
        }
        String newFileName = null;
        if (!file.isEmpty()) {
            String path = request.getServletContext().getRealPath("/resource/uploadFile/");
            File dir = new File(path);
            boolean dirExist = dir.exists() || dir.mkdirs();
            if (dirExist) {
                String originalFileName = file.getOriginalFilename();
                newFileName = UUID.randomUUID().toString().replaceAll("-", "") + originalFileName.substring(originalFileName.lastIndexOf("."));
                File newFile = new File(path + "/" + newFileName);
                file.transferTo(newFile);
            }
        }
        paper.setPaperCreateTime(new Date());
        paper.setPaperFile(newFileName);
        paper.setPaperState(1);
        System.out.println("create -> " + paper.toString());
        paperService.createPaper(paper);
        return "redirect:/course/info?id=" + paper.getPaperCourseId();
    }

    @GetMapping("adminUpdate")
    public String update(String id, Model model) {
        List<Teacher> allTeachers = teacherService.getAllTeachers();
        model.addAttribute("teachers", allTeachers);
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
