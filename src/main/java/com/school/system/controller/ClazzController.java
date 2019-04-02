package com.school.system.controller;

import com.alibaba.druid.util.StringUtils;
import com.school.system.domain.Clazz;
import com.school.system.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("clazz")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @GetMapping("adminUpdate")
    public String update(String id, Model model) {
        if (id != null && !StringUtils.equals(id, "")) {
            Clazz clazz = clazzService.getClazzById(id);
            model.addAttribute("clazz", clazz);
        } else {
            model.addAttribute("clazz", new Clazz());
        }
        return "admin/clazzUpdate";
    }

    @PostMapping("adminUpdate")
    public String adminUpdate(Clazz clazz) {
        if (clazz.getId() != null) {
            clazzService.updateClazz(clazz);
        } else {
            clazzService.insertClazz(clazz);
        }
        return "redirect:/admin/clazz";
    }

    @RequestMapping("delete")
    public String delete(String id) {
        if (id != null) {
            String ids[] = id.split(",");
            for (String id1 : ids) {
                clazzService.deleteById(Integer.parseInt(id1));
            }
        }
        return "redirect:/admin/clazz";
    }
}
