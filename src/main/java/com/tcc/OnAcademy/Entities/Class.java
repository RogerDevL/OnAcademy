package com.tcc.OnAcademy.Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Class {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeClass;
	
	private Date anoLetivoClass;
	
	private String periodoClass;
	
	private int capacidadeClass;
	
	private String salaClass;
	
	
}
