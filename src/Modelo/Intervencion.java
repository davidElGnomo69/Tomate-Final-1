package Modelo;

import java.io.Serializable;

public class Intervencion implements Serializable {
	int idIntervencion;
	Paciente paciente;
	Medico medico;
	CirujanoActivo cirujano;
	boolean citaRealizada;
	String tipoIntervencion;
	String resultado;

	public Intervencion(int idIntervencion, Paciente paciente, Medico medico, CirujanoActivo cirujano,
			String tipoIntervencion) {
		super();
		this.idIntervencion = idIntervencion;
		this.paciente = paciente;
		this.medico = medico;
		this.cirujano = cirujano;
		this.tipoIntervencion = tipoIntervencion;
	}

	public void setCitaRealizada(boolean citaRealizada) {
		this.citaRealizada = citaRealizada;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
}
