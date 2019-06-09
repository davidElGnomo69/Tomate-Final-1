package control;

import java.util.regex.Pattern;

public class Validadores {

	public static boolean validar(String regex, String cadena) {
		return Pattern.matches(regex, cadena);
	}

}
