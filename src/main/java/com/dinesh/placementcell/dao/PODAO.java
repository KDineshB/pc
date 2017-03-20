/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.AdvisorDetails;
import com.dinesh.placementcell.model.PO;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface PODAO {

    public void addAdvisor(PO details);

    public void saveAdvisor(PO details);

    public List<PO> getAdvisorByCollege(String college);

    public List<PO> getAdvisorByDepartment(String dept);

    public PO getAdvisorById(String userId);
}
