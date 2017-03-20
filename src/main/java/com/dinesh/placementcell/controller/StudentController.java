/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.controller;

import com.dinesh.placementcell.dao.CompanyDetailsDAO;
import com.dinesh.placementcell.model.PersonalDetails;
import com.dinesh.placementcell.model.PreGraduationDetails;
import com.dinesh.placementcell.model.Student;
import com.dinesh.placementcell.model.UnderGraduationDetails;
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
@RequestMapping("/")
public class StudentController {

    @Autowired
    private CompanyDetailsDAO companyDetailsDAO;
    private Student student;

    @RequestMapping(value = {"/basicinfo"}, method = RequestMethod.GET)

    public String basicinfo(ModelMap model) {
        student = new Student();
        student.setRegNo("1313023");
        model.addAttribute("student",student);
        return "basicinfo";
    }

    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String home(ModelMap model) {

        return "home";
    }

    @RequestMapping(value = {"/pregraduate"}, method = RequestMethod.GET)
    public String pregraduate(ModelMap model) {
        student = new Student();
        PreGraduationDetails details = new PreGraduationDetails();
        model.addAttribute("details", details);
        return "pregraduate";
    }

    @RequestMapping(value = {"/ugraduate"}, method = RequestMethod.GET)
    public String ugraduate(ModelMap model) {
        student = new Student();
        UnderGraduationDetails details = new UnderGraduationDetails();
        model.addAttribute("details", details);
        return "ugraduate";
    }

    @RequestMapping(value = {"/personal"}, method = RequestMethod.GET)
    public String personal(ModelMap model) {
        student = new Student();
        PersonalDetails details = new PersonalDetails();
        model.addAttribute("details", details);
        return "personal";
    }
}
