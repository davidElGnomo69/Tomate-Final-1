package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDateTime;

import vistaVentana.UIGazpacho;

public class ParaUI extends UIGazpacho {
	
	LocalDateTime fechaActual = LocalDateTime.of(2020, 01, 01, 8, 00);
	
	public ParaUI() {
		
		btnPasarTiempo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int diaNuevo = (int) spnPasarDía.getValue();
				int horaNueva = (int) spnPasarHora.getValue();
				fechaActual = fechaActual.plusDays(diaNuevo);
				fechaActual = fechaActual.plusHours(horaNueva);
				System.out.println(fechaActual);
				spnPasarDía.setValue(0);
				spnPasarHora.setValue(0);
			}
		});
		getAltaPaciente().getMensaje().getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO			
				}
		});
		getBajaPaciente().getMensaje().getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		getModificacionPaciente().getMensaje().getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		//TODO ACTION DE LOS COMBOBOX
		
		getPedirCitaEspecialista().getMensaje().getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		
	}
}
