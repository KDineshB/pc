/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.*;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface StudentDAO {

    public void addStudent(Student student);

    public Student findStudentByRegNo(String regNo);

    public void saveStudent(Student student);

    public List<Student> findstudentByCriteria(EventCriteria criteria);

    public List<Student> findAllStudents();

    public List<Student> getStudentsByName(String name);
}
