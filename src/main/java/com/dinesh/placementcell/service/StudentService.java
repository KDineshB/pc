/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.service;

import com.dinesh.placementcell.model.Event;
import com.dinesh.placementcell.model.Student;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface StudentService {

    public List<Student> getStudentsByCriteriaSortByName(Event event);

    public List<Student> getAllStudents();

    public List<Student> getStudentsByName(String name);

    public Student getStudentByregNo(String regNo);

    public void addNewstudent(Student student);

    public void updateStudentDetails(Student student);
}
