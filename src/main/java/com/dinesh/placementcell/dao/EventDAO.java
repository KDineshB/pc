/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.Event;
import java.util.List;

/**
 *
 * @author Dinesh
 */
public interface EventDAO {
    public Event getEventById(String id);
    public List<Event> getAllEvents();
    public void saveEvent(Event event);
    public void addEvent(Event event);
}
