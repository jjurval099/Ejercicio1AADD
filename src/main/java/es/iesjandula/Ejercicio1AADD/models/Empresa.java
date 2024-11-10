package es.iesjandula.Ejercicio1AADD.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Empresa 
{
	
	@Id
	@Column(length = 9)
	private String nif;
	
	@Column(length = 15)
	private String nombre;
	
	@Column(length = 15)
	private String direccion;
	
	@OneToMany(mappedBy = "empresa")
	private List<Evento> eventos;
	
	@OneToMany(mappedBy = "empresa")
	private List<Curso> cursos;

}
