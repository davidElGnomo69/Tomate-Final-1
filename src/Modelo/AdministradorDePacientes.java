package Modelo;

import java.io.File;
import java.util.Date;

public class AdministradorDePacientes {
	private DAO daoPacientes=new DAO();
	private String path="./Indentificadores/UltimoIdPersona.persona";
	
	
	public Paciente darDeAltaPaciente(String nombre, String direccion, String telefono, Date fechaNacimiento) {
		String id=obtenerUltimoId();
		Paciente paciente=new Paciente(id, nombre, direccion, telefono, fechaNacimiento);
		
		grabarUltimoId(id);
		
		return paciente;
	}
	
	private String obtenerUltimoId() {
		String id;
		File file=new File(path);
		
		if(!file.exists()) {
			grabarUltimoId("0");
		}
		id=(String) daoPacientes.leer(path);
		
		return id;
	}
	
	private boolean grabarUltimoId(String id) {
		boolean grabado=true;
		int idNumero;
		
		idNumero=Integer.parseInt(id);
		idNumero++;
		id=Integer.toString(idNumero);
		
		if(!daoPacientes.grabar(path, id)) {
			grabado=false;
		}
		
		return grabado;
	}
	
}
