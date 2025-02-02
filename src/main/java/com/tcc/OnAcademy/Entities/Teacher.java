package com.tcc.OnAcademy.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeTeacher;
	
	private Date dataNascimentoTeacher;
	
	private String emailTeacher;
	
	private String identificadorTeacher;
	
	@ManyToOne
	@JoinColumn(name = "institution_id", nullable=false)
	private Institution institution;
	
	@OneToMany(mappedBy = "teacher")
	private List<ClassesTeacher> classesTeacher;
	
	@OneToMany(mappedBy = "teacher")
	private List<DisciplinaTeacher> disciplinaTeacher;
	
	@OneToMany(mappedBy = "teacher")
	private List<TeacherFeedBack> teacherFeedback;
	

}
