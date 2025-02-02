package com.tcc.OnAcademy.entities;

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
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tituloFeedback;
	
	private String conteudoFeeback;
	
	@OneToMany(mappedBy = "feedBack")
	private List<StudentFeedBack> StudentFeedBack;
	
	@ManyToOne
	@JoinColumn(name = "classes_id")
	private Classes classes;
	
	@OneToMany(mappedBy = "feedBack")
	private List<TeacherFeedBack> teacherFeedBack;
	

	
}
