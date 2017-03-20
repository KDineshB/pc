/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.service;

import com.dinesh.placementcell.dao.AdvisorDAO;
import com.dinesh.placementcell.model.AdvisorDetails;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dinesh
 */
@Service
public class AdvisorServiceImpl implements AdvisorService {

    @Autowired
    private AdvisorDAO advisorDAO;

    private List<AdvisorDetails> sortAlphabetically(List<AdvisorDetails> advs) {
        Collections.sort(advs, new Comparator<AdvisorDetails>() {
            @Override
            public int compare(AdvisorDetails o1, AdvisorDetails o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
        return advs;
    }

    @Override
    public AdvisorDetails getAdvisorByAdvisorId(String advisorId) {
        return advisorDAO.getAdvisorById(advisorId);
    }

    @Override
    public List<AdvisorDetails> getAdvisorByCollege(String college) {
        return sortAlphabetically(advisorDAO.getAdvisorByCollege(college));
    }

    @Override
    public List<AdvisorDetails> getAdvisorByDept(String dept) {
        return sortAlphabetically(advisorDAO.getAdvisorByDepartment(dept));
    }

    @Override
    public List<AdvisorDetails> getAdvisorByCollegeAndDept(String college, String dept) {
        List<AdvisorDetails> advisorDetails = getAdvisorByCollege(college);
        advisorDetails.addAll(getAdvisorByDept(dept));
        return sortAlphabetically(advisorDetails);
    }

    @Override
    public List<AdvisorDetails> getAdviosrByName(String name) {
        return advisorDAO.getAdvisorDetailsByName(name);
    }

}
