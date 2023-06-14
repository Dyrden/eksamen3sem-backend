package kea.dat22v2.mdd.eksamen3sem.app.dto;


import kea.dat22v2.mdd.eksamen3sem.app.entity.Event;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class EventResponse {

    private Integer id;

    public EventResponse(Event entity) {
        this.id = entity.getId();
    }

}
