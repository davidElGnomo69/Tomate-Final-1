package Modelo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Consulta {
	ArrayList<Persona> puestosAtencionPrimaria = new ArrayList<Persona>();
	ArrayList<LocalTime[]> turnosDisponibles = new ArrayList<LocalTime[]>();
	Horario horario;

	public Consulta(int turno,Persona medico,DiasDeLaSemana[] diaTrabajo) {
		super();
		int ultimaHora=8;
		for (int i = 0; i < 2; i++) {
			LocalTime[] horas = new LocalTime[4];
			for (int j = 0; j < 4; j++) {
				horas[j] = horas[j].of(ultimaHora++, 0);
			}
			turnosDisponibles.add(horas);
		}
		contratarMedico(medico);
		horario=new Horario(obtenerTurno(turno), diaTrabajo);
	}

	/*
	 * esta variable no esta puesta en funcion de si quereis poner mas de un medico
	 * en una consulta
	 */
	final int numeroTrabajadores = 2;

	public boolean puestoLibre() {
		return puestosAtencionPrimaria.size() < numeroTrabajadores;
	}

	public void eliminarMedico(Medico medico) {
		puestosAtencionPrimaria.remove(medico);
	}

	public LocalTime[] obtenerTurno(int turno) {
		LocalTime[] retorno = null;
		if (turno<=turnosDisponibles.size()) {
			retorno=turnosDisponibles.get(turno);
//			eliminarTurno(turno);
		}
		return retorno;
	}
	public Horario getHOHorario() {
		return horario;
	}
	private void eliminarTurno(int turno) {
		turnosDisponibles.remove(turno);
	}
	

	public void contratarMedico(Persona medico) {
//		turnosDisponibles.remove(turno);
		puestosAtencionPrimaria.add(medico);
	}

}
