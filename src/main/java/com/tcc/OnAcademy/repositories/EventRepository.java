package com.tcc.OnAcademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.OnAcademy.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
