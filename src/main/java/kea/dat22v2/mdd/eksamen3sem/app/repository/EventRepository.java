package kea.dat22v2.mdd.eksamen3sem.app.repository;


import kea.dat22v2.mdd.eksamen3sem.app.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
