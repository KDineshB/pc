/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.controller;

import com.dinesh.placementcell.dao.CompanyDetailsDAO;
import com.dinesh.placementcell.dao.CompanyDetailsDAOImpl;
import com.dinesh.placementcell.model.CompanyDetails;
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
    CompanyDetailsDAO companyDetailsDAO;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String test(ModelMap model) {
        CompanyDetails details = new CompanyDetails();
        details.setCompanyName("abc");
        details.setBasicInfo("my company");
        details.setGlassdoorLink("abc.com");
        details.setWebsite("hai");
        companyDetailsDAO.addCompany(details);
        return "basicinfo";
    }

}
