package com.dinesh.placementcell.model;

import com.dinesh.placementcell.model.EventRound;
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

    private String college;

    private String startTime;

    private String joiningLocation;

    private String bond;

    private String eventId;

    private EventCriteria criteria; 
}
