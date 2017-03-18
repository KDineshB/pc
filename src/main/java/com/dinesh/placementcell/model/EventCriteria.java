package com.dinesh.placementcell.model;

public class EventCriteria {

    private int sNo;
    private float sslcPercentage;

    private float hscPercentage;

    private float cgpa;

    private String arrearStatus;

    private String skillsPreferred;

    public int eventId;

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public float getSslcPercentage() {
        return sslcPercentage;
    }

    public void setSslcPercentage(float sslcPercentage) {
        this.sslcPercentage = sslcPercentage;
    }

    public float getHscPercentage() {
        return hscPercentage;
    }

    public void setHscPercentage(float hscPercentage) {
        this.hscPercentage = hscPercentage;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getArrearStatus() {
        return arrearStatus;
    }

    public void setArrearStatus(String arrearStatus) {
        this.arrearStatus = arrearStatus;
    }



    public String getSkillsPreferred() {
        return skillsPreferred;
    }

    public void setSkillsPreferred(String skillsPreferred) {
        this.skillsPreferred = skillsPreferred;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

}
