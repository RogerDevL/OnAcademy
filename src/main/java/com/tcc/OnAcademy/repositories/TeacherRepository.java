package com.tcc.OnAcademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcc.OnAcademy.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
