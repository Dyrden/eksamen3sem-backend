package kea.dat22v2.mdd.eksamen3sem.app.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class EventAttendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//?? skal vi have dem her?
    @CreationTimestamp
    private LocalDateTime created;

    @UpdateTimestamp
    private LocalDateTime updated;

    private LocalDateTime register;

    @ManyToOne
    private Event event;


    @ManyToOne
    private Attendee attendee;



}
