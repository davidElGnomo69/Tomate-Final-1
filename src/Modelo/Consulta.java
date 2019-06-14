package Modelo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Consulta {
	Horario[] horarios=new Horario[2];
	int[] consultas=new int[2];
	


	public Consulta(DiasDeLaSemana[] diaTrabajo) {
		super();
		int ultimaHora=8;
		for (int i = 0; i < horarios.length; i++) {
			LocalTime[] horas = new LocalTime[4];
			for (int j = 0; j < 4; j++) {
				horas[j] = horas[j].of(ultimaHora++, 0);
			}
			horarios[i]=new Horario(horas, diaTrabajo);
		}
	}

	



}
