package kea.dat22v2.mdd.eksamen3sem.app.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import kea.dat22v2.mdd.eksamen3sem.app.entity.Event;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class EventResponse {

    private Integer id;

    private String name;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date;

    private String description;


    public EventResponse(Event entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.date = entity.getDate();
        this.description = entity.getDescription();
    }

}
