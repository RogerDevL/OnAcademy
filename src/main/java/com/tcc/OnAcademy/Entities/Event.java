package com.tcc.OnAcademy.Entities;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tituloEvent;
	
	private Date dataEvent;
	
	private Time horarioEvent;
	
	private String localEvent;
	
	private String descricaoEvent;
}
