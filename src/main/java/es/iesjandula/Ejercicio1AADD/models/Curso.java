package es.iesjandula.Ejercicio1AADD.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso 
{
	@EmbeddedId
	private CursoId cursoId;
	
	@Column(length = 10)
	private String nombreTutor;
	
	@ManyToOne
	private Empresa empresa; 
	
	@OneToMany(mappedBy = "curso")
	private List<Alumno>alumno;

}
