/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.service;

import com.dinesh.placementcell.dao.StudentDAO;
import com.dinesh.placementcell.model.Event;
import com.dinesh.placementcell.model.EventCriteria;
import com.dinesh.placementcell.model.Student;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dinesh
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    private List<Student> sortAlphabetically(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
        return students;
    }

    @Override
    public List<Student> getStudentsByCriteriaSortByName(Event event) {

        EventCriteria criteria = event.getCriteria();
        List<Student> students = studentDAO.findstudentByCriteria(criteria);
        sortAlphabetically(students);
        return students;
    }

    @Override
    public List<Student> getAllStudents() {
        return sortAlphabetically(studentDAO.findAllStudents());
    }

    @Override
    public Student getStudentByregNo(String regNo) {
        return studentDAO.findStudentByRegNo(regNo);
    }

    @Override
    public void addNewstudent(Student student) {
        studentDAO.addStudent(student);
    }

    @Override
    public void updateStudentDetails(Student student) {
        studentDAO.saveStudent(student);
    }

    @Override
    public List<Student> getStudentsByName(String name) {
        return studentDAO.getStudentsByName(name);
    }

}
