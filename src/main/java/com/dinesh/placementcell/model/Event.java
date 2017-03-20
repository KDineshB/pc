package com.dinesh.placementcell.model;

import java.util.Date;
import java.util.List;

public class Event {

    private String companyName;

    private Date eventDate;

    private List<EventRound> rounds;

    private String venue;

    private String notes;

    private String instruction;

    private List<EventDepartment> department;

    private List<EventCollege> college;

    private String startTime;

    private String joiningLocation;

    private String bond;

    private String eventId;

    private EventCriteria criteria;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public List<EventRound> getRounds() {
        return rounds;
    }

    public void setRounds(List<EventRound> rounds) {
        this.rounds = rounds;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public List<EventDepartment> getDepartment() {
        return department;
    }

    public void setDepartment(List<EventDepartment> department) {
        this.department = department;
    }

    public List<EventCollege> getCollege() {
        return college;
    }

    public void setCollege(List<EventCollege> college) {
        this.college = college;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getJoiningLocation() {
        return joiningLocation;
    }

    public void setJoiningLocation(String joiningLocation) {
        this.joiningLocation = joiningLocation;
    }

    public String getBond() {
        return bond;
    }

    public void setBond(String bond) {
        this.bond = bond;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public EventCriteria getCriteria() {
        return criteria;
    }

    public void setCriteria(EventCriteria criteria) {
        this.criteria = criteria;
    }

}
