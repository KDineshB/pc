/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.AdvisorDetails;
import com.dinesh.placementcell.model.EventCriteria;
import com.dinesh.placementcell.model.Student;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dinesh
 */
@Repository
@Transactional
public class StudentDAOImpl extends AbstractDao<String, Student> implements StudentDAO {

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
    public List<Student> findstudentByCriteria(EventCriteria criteria) {
        Criteria c = createEntityCriteria();
        c.add(Restrictions.eq("preGraduationDetails.sslcPercentage", criteria.getSslcPercentage()));
        c.add(Restrictions.eq("preGraduationDetails.hscPercentage", criteria.getHscPercentage()));
        c.add(Restrictions.eq("underGraduationDetails.cgpa", criteria.getCgpa()));
        c.add(Restrictions.eq("underGraduationDetails.arrearStatus", criteria.getArrearStatus()));
        return ((List< Student>) c.list());
    }

    @Override
    public List<Student> findAllStudents() {
        Criteria criteria = createEntityCriteria();
        return ((List< Student>) criteria.list());
    }

    @Override
    public void addStudent(Student student) {
        getSession().persist(student);
    }

    @Override
    public List<Student> getStudentsByName(String name) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
        return criteria.list();
    }
}
