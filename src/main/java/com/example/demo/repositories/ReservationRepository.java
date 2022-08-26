package com.example.demo.repositories;

import com.example.demo.models.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation,Integer> {
}
