package control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

import Modelo.AdministradorPersonal;
import Modelo.AlmacenMedicos;
import Modelo.CirujanoActivo;
import Modelo.Especialidades;
import Modelo.Medico;
import vistaVentana.UIGazpacho;

public class ParaUI extends UIGazpacho {
	AdministradorPersonal personal=new AdministradorPersonal();
	AlmacenMedicos almacenMedicos=new AlmacenMedicos();
	
	LocalDateTime fechaActual = LocalDateTime.of(2020, 01, 01, 8, 00);
	
	public ParaUI() {
		almacenMedicos.volcarDatosCirujanos();
		refrescarComboBox();
		
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
		
		getAltaMedico().getMensajeAltaMedico().getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getAltaMedico().getAltaEspecialidad().getSelectedItem().toString()=="Cirujia") {
					CirujanoActivo cirujano=personal.darDeAltaCirujanoActivo(getAltaMedico().getTxtNombre()+" "+getAltaMedico().getTextApellidos(), 
							getAltaMedico().getTextTelefono(), getAltaMedico().getTextDireccion(), Especialidades.Cirujia);
					almacenMedicos.addCirujanoActivo(cirujano);
					Medico medico=new Medico(cirujano.getIdPersona(), cirujano.getNombre(), cirujano.getDireccion(), cirujano.getTelefono(), cirujano.getEspecialidad());
					almacenMedicos.addMedico(medico);
					getConsultaDatosMedico().getSeleccion().getCmbID().addItem(cirujano.getIdPersona());
					getConsultaDatosMedico().getSeleccion().getCmbNombre().addItem(cirujano.getNombre());
					getBajaMedico().getSeleccion().getCmbID().addItem(cirujano.getIdPersona());
					getBajaMedico().getSeleccion().getCmbNombre().addItem(cirujano.getNombre());
				}else {
					//personal.darDeAltaMedicoActivo(getAltaMedico().getTxtNombre()+getAltaMedico().getTextApellidos(), 
					//		getAltaMedico().getTextTelefono(), getAltaMedico().getTextDireccion(), getAltaMedico().getAltaEspecialidad().getSelectedItem(), horario)
				}
				
				}
		});
		
		getBajaMedico().getSeleccion().getCmbID().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
					for (Iterator<CirujanoActivo> iterator = almacenMedicos.obtenerListaCirujanos().iterator(); iterator.hasNext();) {
						CirujanoActivo cirujano = (CirujanoActivo) iterator.next();
						
					 
						if(cirujano.getIdPersona().equals(getBajaMedico().getSeleccion().getCmbID().getSelectedItem())) {
							getBajaMedico().setTextNombre(cirujano.getNombre());
							getBajaMedico().setTextApellidos(cirujano.getNombre());
							getBajaMedico().setTextDireccion(cirujano.getDireccion());
							getBajaMedico().setTextTelefono(cirujano.getTelefono());
							getBajaMedico().setTextEspecialidad(cirujano.getEspecialidad().toString());
						}
					}
			}
		});
		
		getBajaMedico().getSeleccion().getCmbNombre().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				for (Iterator<CirujanoActivo> iterator = almacenMedicos.obtenerListaCirujanos().iterator(); iterator.hasNext();) {
					CirujanoActivo cirujano = (CirujanoActivo) iterator.next();
						if(cirujano.getNombre().equals(getBajaMedico().getSeleccion().getCmbNombre().getSelectedItem().toString())) {
							getBajaMedico().setTextNombre(cirujano.getNombre());
							getBajaMedico().setTextApellidos(cirujano.getNombre());
							getBajaMedico().setTextDireccion(cirujano.getDireccion());
							getBajaMedico().setTextTelefono(cirujano.getTelefono());
							getBajaMedico().setTextEspecialidad(cirujano.getEspecialidad().toString());
						
					}
				}
			}
		});
		
		getBajaMedico().getMensajeBajaMedico().getBtnAplicar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getBajaMedico().getTxtEspecialidad().getText().equals("Cirujia")) {
					System.out.println("he entrado");
					for (Iterator<CirujanoActivo> iterator = almacenMedicos.obtenerListaCirujanos().iterator(); iterator.hasNext();) {
						CirujanoActivo cirujano = (CirujanoActivo) iterator.next();
						System.out.println(cirujano.getIdPersona());
						if(cirujano.getIdPersona().equals(getBajaMedico().getSeleccion().getCmbID().getSelectedItem())) {
							getBajaMedico().getSeleccion().getCmbID().removeItem(cirujano.getIdPersona());
							getBajaMedico().getSeleccion().getCmbNombre().removeItem(cirujano.getNombre());
							getConsultaDatosMedico().getSeleccion().getCmbID().removeItem(cirujano.getIdPersona());
							getConsultaDatosMedico().getSeleccion().getCmbNombre().removeItem(cirujano.getNombre());
							almacenMedicos.eliminarCirujano(cirujano);
							iterator.remove();
						}
					}
				}
				
			}
		});
		
		getPedirCitaEspecialista().getMensaje().getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		
		
		getConsultaDatosMedico().getSeleccion().getCmbID().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				for (CirujanoActivo cirujano : almacenMedicos.obtenerListaCirujanos()) {
					if(cirujano.getIdPersona().equals(getConsultaDatosMedico().getSeleccion().getCmbID().getSelectedItem().toString())) {
						getConsultaDatosMedico().setTextNombre(cirujano.getNombre());
						getConsultaDatosMedico().setTextApellidos(cirujano.getNombre());
						getConsultaDatosMedico().setTextDireccion(cirujano.getDireccion());
						getConsultaDatosMedico().setTextTelefono(cirujano.getTelefono());
						getConsultaDatosMedico().setTextEspecialidad(cirujano.getEspecialidad().toString());
					}
				}
			}
		});
		
		
		getConsultaDatosMedico().getSeleccion().getCmbNombre().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				for (CirujanoActivo cirujano : almacenMedicos.obtenerListaCirujanos()) {
					if(cirujano.getNombre().equals(getConsultaDatosMedico().getSeleccion().getCmbNombre().getSelectedItem().toString())) {
						getConsultaDatosMedico().setTextNombre(cirujano.getNombre());
						getConsultaDatosMedico().setTextApellidos(cirujano.getNombre());
						getConsultaDatosMedico().setTextDireccion(cirujano.getDireccion());
						getConsultaDatosMedico().setTextTelefono(cirujano.getTelefono());
						getConsultaDatosMedico().setTextEspecialidad(cirujano.getEspecialidad().toString());
					}
				}
			}
		});
		
	}
	
	public void refrescarComboBox() {
		ArrayList<CirujanoActivo> cirujano=almacenMedicos.obtenerListaCirujanos();
		
		getConsultaDatosMedico().getSeleccion().getCmbID().removeAllItems();
		getConsultaDatosMedico().getSeleccion().getCmbNombre().removeAllItems();
		getBajaMedico().getSeleccion().getCmbID().removeAllItems();
		getBajaMedico().getSeleccion().getCmbNombre().removeAllItems();
		for (CirujanoActivo cirujanoActivo : cirujano){
			getConsultaDatosMedico().getSeleccion().getCmbID().addItem(cirujanoActivo.getIdPersona());
			getConsultaDatosMedico().getSeleccion().getCmbNombre().addItem(cirujanoActivo.getNombre());
			getBajaMedico().getSeleccion().getCmbID().addItem(cirujanoActivo.getIdPersona());
			getBajaMedico().getSeleccion().getCmbNombre().addItem(cirujanoActivo.getNombre());
		}
		
	}
}
