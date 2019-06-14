package control;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Modelo.Regulares;

class ValidadoresTest {

	@Test
	void test() {
		assertTrue(Validadores.validar(Regulares.comunLetras, "Antonio Sanchez"));
		assertTrue(Validadores.validar(Regulares.telefono, "924567123"));
		assertTrue(Validadores.validar(Regulares.telefono, "724567123"));
		assertTrue(Validadores.validar(Regulares.telefono, "624567123"));
		assertTrue(Validadores.validar(Regulares.comunNumero, "123456799"));
		assertTrue(Validadores.validar(Regulares.hora, "02:34"));
		assertTrue(Validadores.validar(Regulares.fecha, "12/12/2018"));
		assertTrue(Validadores.validar(Regulares.dni, "12345678C"));

		assertFalse(Validadores.validar(Regulares.comunLetras, "1231234232"));
		assertFalse(Validadores.validar(Regulares.telefono, "Antonio Sanchez"));
		assertFalse(Validadores.validar(Regulares.comunNumero, "Antonio Sanchez"));
		assertFalse(Validadores.validar(Regulares.hora, "25:34"));
		assertFalse(Validadores.validar(Regulares.fecha, "32/12/2018"));
		assertFalse(Validadores.validar(Regulares.fecha, "12/13/2018"));
		assertFalse(Validadores.validar(Regulares.fecha, "31/12/18"));
		assertFalse(Validadores.validar(Regulares.dni, "12345678D"));
	}

}
