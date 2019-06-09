package Modelo;

public class Regulares {

	public final static String comunLetras = "[A-Za-z](\\s?[A-Za-z])+";
	public final static String comunNumero = "[0-9]+";
	public final static String telefono = "(6|7|9)\\d{8}";
	public final static String hora = "([01][0-9]|[2][0-4]):([0-5][0-9])";
	public final static String dni = "\\d{8}[A-C|E-H|J-N|P-T|U-Z]";
	public final static String fecha = "([0][1-9]|[12][0-9]|3[01])/([0][1-9]|1[012])/([0-9]{4})";

//	enum perrete {
//		comunLetras("[A-Za-z](\\s?[A-Za-z])+"), comunNumeros("[0-9]+"), telefono("(6|7|9)\\d{8}"),
//		hora("([01][0-9]|[2][0-4]):([0-5][0-9])"), dni("\\d{8}[A-C|E-H|J-N|P-T|U-Z]"),
//		fecha("([0][1-9]|[12][0-9]|3[01])/([0][1-9]|1[012])/([0-9]{4})");
//
//		String cadena;
//
//		private perrete(String cadena) {
//			this.cadena = cadena;
//		}
//
//	}
}
