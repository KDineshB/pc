/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.service;

import com.dinesh.placementcell.model.AdvisorDetails;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface AdvisorService {

    public AdvisorDetails getAdvisorByAdvisorId(String advisorId);

    public List<AdvisorDetails> getAdvisorByCollege(String college);

    public List<AdvisorDetails> getAdvisorByDept(String college);

    public List<AdvisorDetails> getAdvisorByCollegeAndDept(String college, String dept);

    public List<AdvisorDetails> getAdviosrByName(String name);
}
