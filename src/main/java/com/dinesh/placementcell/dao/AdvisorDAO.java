/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.AdvisorDetails;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface AdvisorDAO {

    public void addAdvisor(AdvisorDetails details);

    public void saveAdvisor(AdvisorDetails details);

    public List<AdvisorDetails> getAdvisorByCollege(String college);

    public List<AdvisorDetails> getAdvisorByDepartment(String dept);

    public AdvisorDetails getAdvisorById(String userId);

    public List<AdvisorDetails> getAdvisorDetailsByName(String name);
}
