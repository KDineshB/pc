/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.controller;

import com.dinesh.placementcell.service.AdvisorService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Dinesh
 */
@Controller
@RequestMapping("/advisor")
public class AdvisorController {

    @Autowired
    private AdvisorService advisorService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String addStudent(ModelMap map) {

        return "advisor_add_student";
    }

    @RequestMapping(value = "/addstudentc", method = RequestMethod.POST)
    public String addStudentWithCount(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        int i = 0;
        if (request.getParameter("count") != null) {
            i = Integer.parseInt(request.getParameter("count").toString());
        }
        request.setAttribute("count", i);
        return "advisor_add_student";
    }

    @RequestMapping(value = "/addstudentsave", method = RequestMethod.POST)
    public String addStudentSave(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        request.setAttribute("count", 0);
        request.setAttribute("flag", "ok");
        return "advisor_add_student";
    }
}
