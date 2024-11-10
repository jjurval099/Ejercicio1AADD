package es.iesjandula.Ejercicio1AADD.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Alumno
{
	@Id
	@Column(length = 9)
	private String dni;
	
	@Column(length = 15)
	private String nombre;
	
	@Column(length = 9)
	private String apellidos;
	
	@ManyToOne
	private Curso curso;
	
}
