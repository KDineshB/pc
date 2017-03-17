/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.ShortlistedStudents;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface ShortlistedStudentsDAO {

    public List<ShortlistedStudents> getDetailsByEvent(String eventId);

    public void saveDetails(List<ShortlistedStudents> shortlistedStudents);
    //public void addDetails(List<ShortlistedStudents> shortlistedStudents);

    public ShortlistedStudents findByRegNo(String regNo);
}
