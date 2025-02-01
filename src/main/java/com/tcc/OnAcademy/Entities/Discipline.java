package com.tcc.OnAcademy.entities;

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
public class Discipline {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeDiscipline;
	
	@OneToMany(mappedBy = "discipline")
	private List<DisciplinaTeacher> disciplinaTeacher;
	
	@OneToMany(mappedBy = "disciplina")
	private List<ClassesDisciplinas> classesDisciplinas;
}
