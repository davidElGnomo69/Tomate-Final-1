package Modelo;

import java.io.Serializable;
import java.time.LocalTime;

public class Medico extends Persona implements Serializable{
	private Especialidades especialidad;
	private LocalTime[] turno;
	private Consulta consulta;

	public Medico(String idPersona, String nombre, String direccion, String telefono, Especialidades especialidad) {
		super(idPersona, nombre, direccion, telefono);
		this.setEspecialidad(especialidad);
//		this.turno=
	}

	public Especialidades getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidades especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
