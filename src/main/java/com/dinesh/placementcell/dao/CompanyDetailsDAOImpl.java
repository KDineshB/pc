/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.CompanyDetails;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dinesh
 */
@Transactional
@Repository
public class CompanyDetailsDAOImpl extends AbstarctDao<String, CompanyDetails> implements CompanyDetailsDAO {

    @Override
    public CompanyDetails findCompanyDetailsByName(String name) {
        return getByKey(name);
    }

    @Override
    public void addCompany(CompanyDetails company) {
        getSession().save(company);
    }

    @Override
    public void saveCompany(CompanyDetails company) {
        getSession().saveOrUpdate(company);
    }

    @Override
    public List<CompanyDetails> findAllCompany() {
        Criteria criteria = createEntityCriteria();
        return (List<CompanyDetails>)criteria.list();
    }

}
