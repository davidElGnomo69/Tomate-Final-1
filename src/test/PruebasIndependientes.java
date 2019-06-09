package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import Modelo.Consulta;
import Modelo.DiasDeLaSemana;
import Modelo.Especialidades;
import Modelo.Horario;
import Modelo.Medico;
import adaptadores.AdaptadorArraylist;

class PruebasIndependientes {

	@Ignore
	void test() {
		ArrayList<String[]> filas = new ArrayList<>();
		String data[][] = new String[2][1];
		String[] titulosColumnas = { "Paciente", "Operacion", "Cirujano", "Resultado" };
		String[] titulosColumnas2 = { "asffas", "gasfgasf", "wter", "hgf" };
		filas.add(titulosColumnas);
		filas.add(titulosColumnas2);
		System.out.println(data[0].length);
		String cadena2[] = new String[1];
		System.out.println(data.length);

//		filas.add(filas2.toArray(cadena2));
//		filas.add(filas2.toArray(cadena2));

		String cadena[] = new String[1];
//		for (String [] string : filas) {
//			System.out.println(string);
//			for (int i = 0; i < string.length; i++) {
//				System.out.println(string[i]);
//			}
//		}

	}

	@Test
	void test2() {
		ArrayList<Integer[]> prueba = new ArrayList<Integer[]>();
		ArrayList<Integer> prueba2 = new ArrayList<Integer>();
		Integer[][] res;
		Integer[][] res2 = new Integer[1][1];
		AdaptadorArraylist<Integer> adArraylist = new AdaptadorArraylist<Integer>();
		for (int i = 0; i < 10; i++) {
			prueba2.add(i);
		}
		prueba.add(adArraylist.convertir(Integer.class, prueba2));
		prueba.add(adArraylist.convertir(Integer.class, prueba2));
		res = prueba.toArray(new Integer[1][1]);

	}
	@Test
	void pruebaObternerTurno() {
		Medico medico= new Medico("1", "pepito", "mas", "642", Especialidades.AtencionPrimaria);
		DiasDeLaSemana [] diaTrabajo= new DiasDeLaSemana[3]; 
		diaTrabajo[0]=DiasDeLaSemana.Monday;
		diaTrabajo[1]=DiasDeLaSemana.Tuesday;
		diaTrabajo[2]=DiasDeLaSemana.ThursDay;
		Consulta consulta=new Consulta(0, medico,diaTrabajo);
		LocalTime horaTrabajo[]=consulta.obtenerTurno(1);
		LocalTime[] horasEsperadas = new LocalTime[4];
		for (int j = 0; j < 4; j++) {
			horasEsperadas[j] = horasEsperadas[j].of(8 + j, 0);
		}
//		assertArrayEquals(horaTrabajo, horasEsperadas);
		Horario horario=consulta.getHOHorario();
		int[][] horarioSemanal = horario.getHorarioSemanal();
		for (int i = 0; i < horarioSemanal.length; i++) {
			for (int j = 0; j < horarioSemanal[i].length; j++) {
				System.out.print(horarioSemanal[i][j]+" ");
			}
			System.out.println();
			System.out.println(horaTrabajo[i]);
			
		}
	}
}
