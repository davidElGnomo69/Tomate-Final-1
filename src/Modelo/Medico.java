package Modelo;

import java.io.Serializable;
import java.time.LocalTime;

public class Medico extends Persona implements Serializable{
	private Especialidades especialidad;
	private LocalTime[] horario;


	public Medico(String idPersona, String nombre, String direccion, String telefono, Especialidades especialidad) {
		super(idPersona, nombre, direccion, telefono);
		this.setEspecialidad(especialidad);
		this.horario=horario;
	}

	public Especialidades getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidades especialidad) {
		this.especialidad = especialidad;
	}
	
	public LocalTime[] getHorario() {
		return horario;
	}

	public void setHorario(LocalTime[] horario) {
		this.horario = horario;
	}
	
}
