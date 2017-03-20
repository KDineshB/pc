/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.AdvisorDetails;
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
public class AdvisorDAOImpl extends AbstractDao<String, AdvisorDetails> implements AdvisorDAO {

    @Override
    public void addAdvisor(AdvisorDetails details) {
        getSession().persist(details);
    }

    @Override
    public void saveAdvisor(AdvisorDetails details) {
        getSession().saveOrUpdate(details);
    }

    @Override
    public List<AdvisorDetails> getAdvisorByCollege(String college) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("college", college));
        return criteria.list();
    }

    @Override
    public List<AdvisorDetails> getAdvisorByDepartment(String dept) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("department", dept));
        return criteria.list();
    }

    @Override
    public AdvisorDetails getAdvisorById(String userId) {
        return getByKey(userId);
    }

    @Override
    public List<AdvisorDetails> getAdvisorDetailsByName(String name) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
        return criteria.list();
    }

}
