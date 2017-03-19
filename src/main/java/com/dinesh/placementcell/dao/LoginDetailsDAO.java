/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.LoginDetails;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface LoginDetailsDAO {
    public LoginDetails getLoginDetailsByUsername(String username);
    public List<LoginDetails> getLoginByCollege(String college);
    public void saveLogin(LoginDetails loginDetails);
    public void addLogin(LoginDetails loginDetails);
}
