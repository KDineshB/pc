/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.model;

/**
 *
 * @author Dinesh
 */
public class Skills {

    private int sNo;
    private String skillSet;

    private String otherCourses;

    private int gateScore;

    private int tancetScore;

    private String amcatId;

    private String cocubesId;
    private Student student;

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getOtherCourses() {
        return otherCourses;
    }

    public void setOtherCourses(String otherCourses) {
        this.otherCourses = otherCourses;
    }

    public int getGateScore() {
        return gateScore;
    }

    public void setGateScore(int gateScore) {
        this.gateScore = gateScore;
    }

    public int getTancetScore() {
        return tancetScore;
    }

    public void setTancetScore(int tancetScore) {
        this.tancetScore = tancetScore;
    }

    public String getAmcatId() {
        return amcatId;
    }

    public void setAmcatId(String amcatId) {
        this.amcatId = amcatId;
    }

    public String getCocubesId() {
        return cocubesId;
    }

    public void setCocubesId(String cocubesId) {
        this.cocubesId = cocubesId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
