package com.dinesh.placementcell.service;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;

import com.dinesh.placementcell.model.Student;
import com.dinesh.placementcell.util.MailConfig;
import com.dinesh.placementcell.util.MailingService;

public class Utilities {
	@Autowired
	MailingService mailingService;
	@Autowired
	MailConfig mailConfig;
	public void approvalDetailsMail(Student student){
		try {		
			mailConfig.setToAddress(student.getEmail());	
			mailConfig.setMailSubject("Student Details Approved");
			mailConfig.setMailContent("Hi "+student.getName()+"\n\t Your details are verfied successfully");
			mailingService.sendMail(mailConfig);
		} 
		
		catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	
	public void incorrectDetailsMail(Student student){
		try {		
			mailConfig.setToAddress(student.getEmail());	
			mailConfig.setMailSubject("Student Details are Incorrect");
			mailConfig.setMailContent("Hi "+student.getName()+"\n\t Your details are Incorrect. Please verify your details") ;
			mailingService.sendMail(mailConfig);
		} 
		
		catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	

}
