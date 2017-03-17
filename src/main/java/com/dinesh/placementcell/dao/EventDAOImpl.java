/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dinesh.placementcell.dao;

import com.dinesh.placementcell.model.Event;
import java.util.List;
import org.hibernate.Criteria;

/**
 *
 * @author Dinesh
 */
public class EventDAOImpl extends AbstarctDao<String, Event> implements EventDAO {

    @Override
    public Event getEventById(String id) {
        return getByKey(id);
    }

    @Override
    public List<Event> getAllEvents() {
        Criteria c = createEntityCriteria();
        return c.list();
    }

    @Override
    public void saveEvent(Event event) {
        getSession().saveOrUpdate(event);
    }

    @Override
    public void addEvent(Event event) {
        getSession().save(event);
    }
    
}
