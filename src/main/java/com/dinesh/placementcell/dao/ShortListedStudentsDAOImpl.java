/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.ShortlistedStudents;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dinesh
 */
public class ShortListedStudentsDAOImpl extends AbstarctDao<String, ShortlistedStudents> implements ShortlistedStudentsDAO{

    @Override
    public List<ShortlistedStudents> getDetailsByEvent(String eventId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("eventId",eventId));
        return criteria.list();
    }

    @Override
    public void saveDetails(List<ShortlistedStudents> shortlistedStudents) {
        for (ShortlistedStudents student : shortlistedStudents) {
            getSession().persist(student);
        }
    }

    @Override
    public ShortlistedStudents findByRegNo(String regNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
