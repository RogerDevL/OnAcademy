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
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeStudent;

	private Date dataNascimentoStudent;

	private String emailStudent;

	private String telefoneStudent;

	private String matriculaStudent;

	@ManyToOne
	@JoinColumn(name = "institution_id", nullable = false)
	private Institution institution;
	
	@OneToMany(mappedBy = "student")
	private List<Notes> notes;

	@OneToMany(mappedBy = "student")
	private List<StudentFeedBack> studentFeedBack;
}
