package kea.dat22v2.mdd.eksamen3sem.app.api;

import kea.dat22v2.mdd.eksamen3sem.app.dto.EventRequest;
import kea.dat22v2.mdd.eksamen3sem.app.dto.EventResponse;
import kea.dat22v2.mdd.eksamen3sem.app.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin
public class EventController {





    EventService service;

    public EventController(EventService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<EventResponse>> findAllEvents() {
        return ResponseEntity.ok().body(service.findAllEvents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventResponse> findEvent(@PathVariable("id") Integer id) {
        return ResponseEntity.ok().body(service.findEvent(id));
    }

    @PostMapping
    public ResponseEntity<EventResponse> addEvent(@RequestBody EventRequest request) {
        return ResponseEntity.ok().body(service.addEvent(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventResponse> updateEvent(@PathVariable("id") Integer id, @RequestBody EventRequest request) {
        return ResponseEntity.ok().body(service.updateEvent(id,request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EventResponse> deleteEvent(@PathVariable("id") Integer id) {
        return ResponseEntity.ok().body(service.deleteEvent(id));
    }
}