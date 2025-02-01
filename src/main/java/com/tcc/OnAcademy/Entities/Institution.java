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
public class Institution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nameInstitution;

	private String cnpjInstitution;

	private String unitInstitution;

	@OneToMany(mappedBy = "institution")
	private List<Student> student;
	
	@OneToMany(mappedBy = "institution")
	private List<Teacher> teacher;
	
	@OneToMany(mappedBy = "institution")
	private List<Event> event;

}
