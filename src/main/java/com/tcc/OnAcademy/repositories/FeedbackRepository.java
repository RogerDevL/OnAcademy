package com.tcc.OnAcademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.OnAcademy.entities.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
