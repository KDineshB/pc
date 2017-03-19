/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.PlacedStudentsDetails;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface PlacedStudentsDAO {
    List<PlacedStudentsDetails> finStudentsByCompanyId(String companyId);
}
