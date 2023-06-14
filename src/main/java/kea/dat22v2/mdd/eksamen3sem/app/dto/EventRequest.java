package kea.dat22v2.mdd.eksamen3sem.app.dto;


import kea.dat22v2.mdd.eksamen3sem.app.entity.Event;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class EventRequest {

    private Integer id;

    public static Event getEventEntity(EventRequest request) {
        return Event.builder()
            .id(request.getId())
            .build();
    }

}