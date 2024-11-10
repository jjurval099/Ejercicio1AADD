package es.iesjandula.Ejercicio1AADD.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Evento 
{
	@Id
	@Column(length = 15)
	private String nombre;
	
	@Column(length = 20)
	private String duracion;
	
	@ManyToOne
	private Empresa empresa; 
}
