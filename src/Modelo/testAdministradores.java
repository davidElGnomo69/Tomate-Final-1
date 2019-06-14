package Modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAdministradores {
	private AdministradorDePacientes pacientes=new AdministradorDePacientes();
	private AdministradorPersonal personal=new AdministradorPersonal();
	
	@Test
	void testGeneradorDeId() {
		
		Paciente paciente1=pacientes.darDeAltaPaciente("pepe laja", "Rotonda del vino", "89388472", null);
		Paciente paciente2=pacientes.darDeAltaPaciente("chumari", "calle lentejas", "9182918292", null);
		MedicoActivo medico= personal.darDeAltaMedicoActivo("juliana", "18291829182", "calle matahacas", Especialidades.Ginecologia, null, null);
		CirujanoActivo cirujano=personal.darDeAltaCirujanoActivo("pepelu", "91918291", "calle baones", Especialidades.Cirujia, null);
		
		System.out.println(paciente1.getIdPersona());
		System.out.println(paciente2.getIdPersona());
		System.out.println(medico.getIdPersona());
		System.out.println(cirujano.getIdPersona());
		
	}

}
