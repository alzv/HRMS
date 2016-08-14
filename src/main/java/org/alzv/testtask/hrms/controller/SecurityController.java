package org.alzv.testtask.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class SecurityController {

    @RequestMapping("/login")
    public String hello(@RequestParam(value="username", required=false) String username,
                        Model model) {

        model.addAttribute("username", username);

        //returns the view name
        return "login";

    }

    @RequestMapping("/loginfailed")
    public String error(Model model) {
        model.addAttribute("error", "loginFailed");
        //returns the view name
        return "login";
    }

    // for 403 access denied page
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accessDenied(Principal user) {

        ModelAndView model = new ModelAndView();

        if (user != null) {
            model.addObject("msg", user.getName()
                    + ", you do not have permission to access this page!");
        } else {
            model.addObject("msg",
                    "You do not have permission to access this page!");
        }

        model.setViewName("403");
        return model;

    }

}