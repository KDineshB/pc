/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.controller;

import com.dinesh.placementcell.dao.StudentDAO;
import com.dinesh.placementcell.model.PersonalDetails;
import com.dinesh.placementcell.model.PreGraduationDetails;
import com.dinesh.placementcell.model.Student;
import com.dinesh.placementcell.model.UnderGraduationDetails;
import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
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
    private StudentDAO studentDAO;
    private PreGraduationDetails details;

    private Student student;

    @RequestMapping(value = {"/basicinfo"}, method = RequestMethod.GET)
    public String basicInfo(ModelMap model, Principal principal) {
        try {
            String username;
            if (principal != null) {
                username = principal.getName();
            } else {
                username = "";
            }

            student = studentDAO.findStudentByRegNo(username);
            if (student == null) {
                student = new Student();
                student.setRegNo(username);
                studentDAO.addStudent(student);
                student = studentDAO.findStudentByRegNo(username);
            }
            model.addAttribute("student", student);
            return "basicinfo";
        } catch (Exception e) {
            e.printStackTrace();
            return "invalid";
        }

    }

    @RequestMapping(value = {"/basicinfo"}, method = RequestMethod.POST)

    public String saveBasicInfo(Student student, ModelMap model) {
        studentDAO.saveStudent(student);
        model.addAttribute(student);
        return "basicinfo";
    }

    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String home(ModelMap model) {
        return "home";
    }

    @RequestMapping(value = {"/pregraduate"}, method = RequestMethod.GET)
    public String pregraduate(ModelMap model) {
        details = new PreGraduationDetails();
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

    @RequestMapping(value = {"/logout"}, method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }

    @RequestMapping(value = {"/invalid"}, method = RequestMethod.GET)
    public String invalid(ModelMap model) {
        return "invalid";
    }
}
