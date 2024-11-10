package es.iesjandula.Ejercicio1AADD.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CursoId implements Serializable
{
	
	private Integer id;
	
	private Integer aroAcademico;
	

}
