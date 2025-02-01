package com.tcc.OnAcademy.Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeStudent;
	
	private Date dataNascimentoStudent;
	
	private String emailStudent;
	
	private String telefoneStudent;
	
	private String matriculaStudent;
	
}
