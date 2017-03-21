package com.dinesh.placementcell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dinesh.placementcell.model.AdvisorDetails;
import com.dinesh.placementcell.model.LoginDetails;
import com.dinesh.placementcell.model.Student;
import com.dinesh.placementcell.service.AdvisorService;
import com.dinesh.placementcell.service.LoginService;
import com.dinesh.placementcell.service.StudentService;
import com.dinesh.placementcell.service.Utilities;

/**
 * 
 * @author mohan
 *
 */

@Controller
@RequestMapping("/")

public class AdvisorController {
	
	@Autowired
	StudentService studentService;
	@Autowired
	AdvisorService advisorService;
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value={"/createstudent"}, method = RequestMethod.POST)
	public String createstudent(LoginDetails loginDetails,ModelMap model){
		loginService.addNewStudentLogin(loginDetails);
		model.addAttribute("logindetails",loginDetails);
		return "createstudent";
		
	}
	
	@RequestMapping(value={"/updateadvisordetails"}, method = RequestMethod.POST)
	public String updateadvisordetails(AdvisorDetails advisorDetails, ModelMap model){
		advisorService.saveAdvisor(advisorDetails);
		model.addAttribute("advisordetails",advisorDetails);
		return "updateadvisordetails";
	}
	
	@RequestMapping(value={"/viewapprovallist"},  method = RequestMethod.GET )
	public String viewApprovalList(ModelMap model){
		studentService.getAllStudents();
		model.addAttribute("studentService",studentService);
		return "viewapprovallist";
		
	}
	
	@RequestMapping(value={"/viewstudent"},  method = RequestMethod.POST)
	public String viewStudent(String regNo, ModelMap model){
		studentService.getStudentByregNo(regNo);
		model.addAttribute("viewstudent",studentService);
		return "viewstudent";
		
	}
	
	@RequestMapping(value={"/approvestudent"},  method = RequestMethod.POST)
	public String approveStudent(Student student, ModelMap model){
		student.setApprovalStatus("Approved");
		studentService.updateStudentDetails(student);
		model.addAttribute("approvestudent", studentService);
		Utilities utilities = new Utilities();
		utilities.approvalDetailsMail(student);
		return "approvestudent";
		
	}
	
	@RequestMapping(value={"/incorrectstudentdata"},  method = RequestMethod.POST)
	public String incorrectStudentData(Student student, ModelMap model){
		studentService.updateStudentDetails(student);
		student.setApprovalStatus("Incorrect data");
		model.addAttribute("incorrectstudentdata", studentService);
		Utilities utilities = new Utilities();
		utilities.incorrectDetailsMail(student);
		return "incorrectstudentdata";
		
	}
	

}
