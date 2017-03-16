/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.CompanyDetails;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface CompanyDetailsDAO {

    public CompanyDetails findCompanyDetailsByName(String name);

    public void addCompany(CompanyDetails company);

    public void saveCompany(CompanyDetails company);

    public List<CompanyDetails> findAllCompany();
}
