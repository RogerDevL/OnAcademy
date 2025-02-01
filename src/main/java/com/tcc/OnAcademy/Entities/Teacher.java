package com.tcc.OnAcademy.Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeTeacher;
	
	private Date dataNascimentoTeacher;
	
	private String emailTeacher;
	
	private String identificadorTeacher;
	

}
