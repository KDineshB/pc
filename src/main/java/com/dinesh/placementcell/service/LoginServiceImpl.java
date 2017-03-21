/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.service;

import com.dinesh.placementcell.dao.LoginDetailsDAO;
import com.dinesh.placementcell.model.LoginDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Dinesh
 */
public class LoginServiceImpl implements LoginService, UserDetailsService {

    @Autowired
    private LoginDetailsDAO loginDetailsDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginDetails details = loginDetailsDAO.getLoginDetailsByUsername(username);
        List<GrantedAuthority> list = new ArrayList<>();
        list.add(new SimpleGrantedAuthority(details.getRole()));
        System.out.println(username);
        UserDetails user = new User(details.getUserId(), details.getPassword(), true, true, true, true, list);
        return user;
    }

    public LoginDetailsDAO getLoginDetailsDAO() {
        return loginDetailsDAO;
    }

    public void setLoginDetailsDAO(LoginDetailsDAO loginDetailsDAO) {
        this.loginDetailsDAO = loginDetailsDAO;
    }

}
