/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.LoginDetails;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dinesh
 */

@Repository
@Transactional
public class LoginDetailsDAOImpl extends AbstarctDao<String, LoginDetails> implements LoginDetailsDAO {

    @Override
    public LoginDetails getLoginDetailsByUsername(String username) {
        return getByKey(username);
    }

    @Override
    public List<LoginDetails> getLoginByCollege(String college) {
        Criteria criteria = createEntityCriteria();
        return criteria.list();
         
    }

    @Override
    public void saveLogin(LoginDetails loginDetails) {
        getSession().saveOrUpdate(loginDetails);
    }

    @Override
    public void addLogin(LoginDetails loginDetails) {
        getSession().save(loginDetails);
    }

}