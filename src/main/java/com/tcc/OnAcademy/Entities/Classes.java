package com.tcc.OnAcademy.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeClass;
	
	private Date anoLetivoClass;
	
	private String periodoClass;
	
	private int capacidadeClass;
	
	private String salaClass;
	
	@OneToMany(mappedBy = "classes")
	private List<ClassesTeacher> classesTeacher;
	
	@OneToMany(mappedBy = "classes")
	private List<ClassesDisciplinas> classesDisciplinas;
	
	@OneToMany(mappedBy = "classes")
	private List<Feedback> feedBack;
	
	
}
