package kea.dat22v2.mdd.eksamen3sem.app.api;


import kea.dat22v2.mdd.eksamen3sem.app.exception.NotYetImplementedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotYetImplementedException.class)
    public ResponseEntity<Object> handleTravelException(NotYetImplementedException ex) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(Map.of("message", ex.getMessage()));
    }
}