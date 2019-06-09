package control;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

import Modelo.Cita;

public class GestionCitas {
ArrayList<Cita> citasActivas=new ArrayList<Cita>();
ArrayList<Cita> citasLibres=new ArrayList<Cita>();
ArrayList<Cita> citasAtencionPrimaria=new ArrayList<Cita>();
ArrayList<Cita> citasEspecialista=new ArrayList<Cita>();

public void reservarCita(Cita cita) {
	citasLibres.remove(cita);
}
public void cancelarCita(Cita cita) {
	citasLibres.add(cita);
}
public ArrayList<Cita> getCitasActivas() {
	return citasActivas;
}
public ArrayList<Cita> getCitasLibres() {
	return citasLibres;
}
public void eliminarCitasPasadas(LocalDateTime caducidad) {
	ArrayList<Cita> citasEliminadas= new ArrayList<Cita>();
	for (Cita cita : citasActivas) {
		if (cita.getFechaCita().isAfter(caducidad)) {
			citasEliminadas.add(cita);
		}
	}
	citasAtencionPrimaria.removeAll(citasEliminadas);
	citasEspecialista.removeAll(citasEliminadas);
}

}
