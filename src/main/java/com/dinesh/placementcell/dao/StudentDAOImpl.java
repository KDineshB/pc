/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.Student;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dinesh
 */
@Repository
public class StudentDAOImpl extends AbstarctDao<String,Student> implements StudentDAO {

    @Override
    public Student findStudentByRegNo(String regNo) {
        Student student = (Student) getSession().load(Student.class, regNo);
        return student;
    }

    @Override
    public void saveStudent(Student student) {
        getSession().saveOrUpdate(student);
    }

    @Override
    public List<Student> findstudentByCriteria(Criteria criteria) {
        return ((List< Student>) criteria.list());
    }

    @Override
    public List<Student> findAllStudents() {
        Criteria criteria = createEntityCriteria();
        return ((List < Student >) criteria.list());
    }

}
