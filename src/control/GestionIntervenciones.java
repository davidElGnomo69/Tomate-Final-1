package control;

import Modelo.CirujanoActivo;
import Modelo.Intervencion;
import Modelo.Medico;
import Modelo.Paciente;

public class GestionIntervenciones {
public Intervencion crearIntervencion(int idIntervencion,Paciente paciente,Medico medico,CirujanoActivo cirujano,String tipoIntervencion) {
	return new Intervencion(idIntervencion, paciente, medico, cirujano, tipoIntervencion);
}
public boolean canIntervencion(CirujanoActivo cirujano) {
 return cirujano.getIntervenciones().size()<2;
}

}
