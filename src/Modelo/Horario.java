package Modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Horario {
	private int horarioSemanal[][] = new int[4][5];
	private LocalTime horaTrabajo[];
	private DiasDeLaSemana diaTrabajo[];

	public Horario(LocalTime[] horaTrabajo, DiasDeLaSemana[] diaTrabajo) {
		super();
		this.horaTrabajo = horaTrabajo;
		this.diaTrabajo = diaTrabajo;
		for (int i = 0; i < diaTrabajo.length; i++) {
			for (int j = 0; j < horaTrabajo.length; j++) {
				horarioSemanal[horaTrabajo[j].getHour()%4][diaTrabajo[i].getValor()-1] = 1;
			}
		}
	}

	public int[][] getHorarioSemanal() {
		return horarioSemanal;
	}

	public LocalTime[] getHoraTrabajo() {
		return horaTrabajo;
	}

	public DiasDeLaSemana[] getDiaTrabajo() {
		return diaTrabajo;
	}

	public void reservarDia (int x,int y) {
		horarioSemanal[x][y]=2;
	}
}
