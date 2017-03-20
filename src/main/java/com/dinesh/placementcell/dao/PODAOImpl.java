/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.PO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dinesh
 */
public class PODAOImpl extends AbstractDao<String, PO> implements PODAO {

    @Override
    public void addAdvisor(PO details) {
        getSession().persist(details);
    }

    @Override
    public void saveAdvisor(PO details) {
        getSession().saveOrUpdate(details);
    }

    @Override
    public List<PO> getAdvisorByCollege(String college) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("college", college));
        return criteria.list();
    }

    @Override
    public List<PO> getAdvisorByDepartment(String dept) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("department", dept));
        return criteria.list();
    }

    @Override
    public PO getAdvisorById(String userId) {
        return getByKey(userId);
    }

}
