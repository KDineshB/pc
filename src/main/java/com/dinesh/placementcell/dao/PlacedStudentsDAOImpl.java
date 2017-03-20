/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.PlacedStudentsDetails;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dinesh
 */
@Repository
@Transactional
public class PlacedStudentsDAOImpl extends AbstractDao<String, PlacedStudentsDetails> implements PlacedStudentsDAO {

    @Override
    public List<PlacedStudentsDetails> finStudentsByCompanyId(String companyId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("companyId", companyId));
        return criteria.list();
    }

}
