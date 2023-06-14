package kea.dat22v2.mdd.eksamen3sem.app.service;


import kea.dat22v2.mdd.eksamen3sem.app.dto.EventRequest;
import kea.dat22v2.mdd.eksamen3sem.app.dto.EventResponse;
import kea.dat22v2.mdd.eksamen3sem.app.entity.Event;
import kea.dat22v2.mdd.eksamen3sem.app.exception.NotYetImplementedException;
import kea.dat22v2.mdd.eksamen3sem.app.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }



    public List<EventResponse> findAllEvents() {
        return repository.findAll().stream().map(EventResponse::new).toList();
    }

    public EventResponse findEvent(Integer id) {
        throw new NotYetImplementedException("TODO");
    }

    public EventResponse addEvent(EventRequest request) {
        // add checks?
        Event event = EventRequest.getEventEntity(request);
        return new EventResponse(repository.save(event));
    }

    public EventResponse updateEvent(Integer id, EventRequest request) {
        throw new NotYetImplementedException("TODO");
    }

    public EventResponse deleteEvent(Integer id) {
        throw new NotYetImplementedException("TODO");
    }


}
