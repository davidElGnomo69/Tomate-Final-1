package control;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

import Modelo.Cita;
import adaptadores.AdaptadorArraylist;

public class GestionCitas {
	ArrayList<Cita> citasAtendidas = new ArrayList<Cita>();
	ArrayList<Cita> citasPendientes = new ArrayList<Cita>();

	public String[] getDatosCita(Cita cita, int[] campos) {
		String datos[] = { cita.getPaciente().getNombre(), cita.getMedico().getEspecialidad().name(),
				cita.getFechaCita().toString(), cita.getMedico().getNombre() };
		String[] retorno = new String[campos.length];
		for (int i = 0; i < campos.length; i++) {
			retorno[i] = datos[campos[i]];
		}
		return retorno;
	}

	public String[][] getDatos(ArrayList<Cita> lista, int[] campos) {
		String[][] retorno = new String[lista.size()][campos.length];
		int i = 0;
		for (Cita cita : lista) {
			retorno[i] = getDatosCita(cita, campos);
			i++;
		}
		return retorno;
	}

	public void eliminarCitasPasadas(LocalDateTime fechaActual) {
		ArrayList<Cita> citasEliminadas = new ArrayList<Cita>();
		for (Cita cita : citasPendientes) {
			if (cita.getFechaCita().isAfter(fechaActual)) {
				citasEliminadas.add(cita);
			}
		}
		citasPendientes.removeAll(citasEliminadas);
	}

	public ArrayList<Cita> getCitasPendientes() {
		return citasPendientes;
	}

	public void setCitasPendientes(ArrayList<Cita> citasPendientes) {
		this.citasPendientes = citasPendientes;
	}

}
