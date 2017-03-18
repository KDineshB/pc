/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Dinesh
 */
@Controller
public class StudentController {

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String test(ModelMap model) {
        return "basicinfo";
    }

}
