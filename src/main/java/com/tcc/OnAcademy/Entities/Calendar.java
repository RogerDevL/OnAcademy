package com.tcc.OnAcademy.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Calendar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int anoCalendar;
	
	private int mesCalendar;
	
	private String feriadosCalendar;
	
	private String diasSemanasCalendar;
	
	

}
