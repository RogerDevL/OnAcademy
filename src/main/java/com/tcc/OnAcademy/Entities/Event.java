package com.tcc.OnAcademy.entities;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tituloEvent;
	
	private Date dataEvent;
	
	private Time horarioEvent;
	
	private String localEvent;
	
	private String descricaoEvent;
	
	@ManyToOne
	@JoinColumn(name = "institution_id")
	private Institution institution;
	
	@ManyToOne
	@JoinColumn(name = "calendar_id")
	private Calendar calendar;
}
