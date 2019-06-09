package control;

import java.util.ArrayList;

import Modelo.Consulta;
import Modelo.Medico;

public class GestionConsultas {
ArrayList<Consulta> consultasPrimarias=new ArrayList<Consulta>();
/*no se si se va usar, por eso la dejo solamente declarada*/
ArrayList<Consulta> consultasEspecialista=new ArrayList<Consulta>();

public int consultasLibres(ArrayList<Consulta> consulta,int maxConsultas) {
	return maxConsultas-consulta.size();
}

public boolean contratarMedico(Medico medico,ArrayList<Consulta> consulta) {
	boolean stop=false;
	for (Consulta i : consulta) {
		if (i.puestoLibre()&&!stop) {
			i.contratarMedico(medico);
			stop=true;
		}
	}
	return stop;
}
}
