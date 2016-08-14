package org.alzv.testtask.hrms.controller;

import org.alzv.testtask.hrms.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/")
    public String root(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("user", auth.getName());

        //returns the view name
        return "index";
    }

    @RequestMapping("/departments")
    public String getDepartments(Model model) {
        model.addAttribute("departments", departmentService.getAllDepartments());
        //returns the view name
        return "index";
    }

}