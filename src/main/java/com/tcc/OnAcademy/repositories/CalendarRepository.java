package com.tcc.OnAcademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.OnAcademy.entities.Calendar;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {

}
