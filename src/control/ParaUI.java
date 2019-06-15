package control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

import Modelo.AdministradorDePacientes;
import Modelo.AdministradorPersonal;
import Modelo.AlmacenMedicos;
import Modelo.AlmacenPacientes;
import Modelo.CirujanoActivo;
import Modelo.Especialidades;
import Modelo.Medico;
import Modelo.Paciente;
import vistaVentana.UIGazpacho;

public class ParaUI extends UIGazpacho {
	AdministradorPersonal personal=new AdministradorPersonal();
	AlmacenMedicos almacenMedicos=new AlmacenMedicos();
	AlmacenPacientes almacenPacientes=new AlmacenPacientes();
	AdministradorDePacientes pacientes= new AdministradorDePacientes();
	
	LocalDateTime fechaActual = LocalDateTime.of(2020, 01, 01, 8, 00);
	
	public ParaUI() {
		almacenMedicos.volcarDatosCirujanos();
		almacenPacientes.obetenerMapa();
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
		
		getBajaPaciente().getSeleccion().getCmbID().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
					
					Paciente pacienteConsulta=almacenPacientes.obtener(getBajaPaciente().getSeleccion().getCmbID().getSelectedItem().toString());
			        getBajaPaciente().getIdentificacion().getTextNombre().setText(pacienteConsulta.getNombre());
			        getBajaPaciente().getIdentificacion().getTextDireccion().setText(pacienteConsulta.getDireccion());
			        getBajaPaciente().getIdentificacion().getTextTelefono().setText(pacienteConsulta.getTelefono());
				
			}
		});
		
		getAltaPaciente().getMensaje().getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paciente pacienteAlta=(pacientes.darDeAltaPaciente(getAltaPaciente().getTxtNombre()+" "+getAltaPaciente().getTextApellidos(),
						getAltaPaciente().getTextDireccion(), getAltaPaciente().getTextTelefono(), getAltaPaciente().getTxtNacimiento()));
				almacenPacientes.grabar(pacienteAlta);
				getConsultaDatosPacientes().getSeleccion().getCmbID().addItem(pacienteAlta.getIdPersona());
				getConsultaDatosPacientes().getSeleccion().getCmbNombre().addItem(pacienteAlta.getNombre());
				getBajaPaciente().getSeleccion().getCmbID().addItem(pacienteAlta.getIdPersona());
				getBajaPaciente().getSeleccion().getCmbNombre().addItem(pacienteAlta.getNombre());
				}
		});
		
		getBajaPaciente().getMensaje().getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				almacenPacientes.borrar(getBajaPaciente().getIdentificacion().getTextNombre().getText().toString());
			}
		});
		
		getBajaPaciente().getSeleccion().getCmbNombre().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Paciente pacienteConsulta=almacenPacientes.obtener(getBajaPaciente().getSeleccion().getCmbNombre().getSelectedItem().toString());
		        getBajaPaciente().getIdentificacion().getTextNombre().setText(pacienteConsulta.getNombre());
		        getBajaPaciente().getIdentificacion().getTextDireccion().setText(pacienteConsulta.getDireccion());
		        getBajaPaciente().getIdentificacion().getTextTelefono().setText(pacienteConsulta.getTelefono());
			}
		});
		
		getModificacionPaciente().getMensaje().getBtnAplicar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		
		getConsultaDatosPacientes().getSeleccion().getCmbID().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
					
					Paciente pacienteConsulta=almacenPacientes.obtener(getConsultaDatosPacientes().getSeleccion().getCmbID().getSelectedItem().toString());
			        getConsultaDatosPacientes().getIdentificacionConsultaDatosPaciente().getTextNombre().setText(pacienteConsulta.getNombre());
			        getConsultaDatosPacientes().getIdentificacionConsultaDatosPaciente().getTextDireccion().setText(pacienteConsulta.getDireccion());
			        getConsultaDatosPacientes().getIdentificacionConsultaDatosPaciente().getTextTelefono().setText(pacienteConsulta.getTelefono());
				
			}
		});
		
		getConsultaDatosPacientes().getSeleccion().getCmbNombre().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Paciente pacienteConsulta=almacenPacientes.obtener(getConsultaDatosPacientes().getSeleccion().getCmbNombre().getSelectedItem().toString());
				getConsultaDatosPacientes().getIdentificacionConsultaDatosPaciente().getTextNombre().setText(pacienteConsulta.getNombre());
				getConsultaDatosPacientes().getIdentificacionConsultaDatosPaciente().getTextDireccion().setText(pacienteConsulta.getDireccion());
				getConsultaDatosPacientes().getIdentificacionConsultaDatosPaciente().getTextTelefono().setText(pacienteConsulta.getTelefono());
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
						if(cirujano.getNombre().equals(getBajaMedico().getSeleccion().getCmbNombre().getSelectedItem())) {
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
						if(cirujano.getIdPersona().equals(getBajaMedico().getSeleccion().getCmbID().getSelectedItem().toString()) || 
								cirujano.getNombre().equals(getBajaMedico().getSeleccion().getCmbNombre().getSelectedItem().toString())	) {
							String id=cirujano.getIdPersona();
							String nombre=cirujano.getNombre();
							System.out.println(almacenMedicos.eliminarCirujano(cirujano));
							getBajaMedico().getSeleccion().getCmbID().removeItem(id);
							getBajaMedico().getSeleccion().getCmbNombre().removeItem(nombre);
							
							
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
				for (Iterator<CirujanoActivo> iterator = almacenMedicos.obtenerListaCirujanos().iterator(); iterator.hasNext();) {
					CirujanoActivo cirujano = (CirujanoActivo) iterator.next();
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
				for (Iterator<CirujanoActivo> iterator = almacenMedicos.obtenerListaCirujanos().iterator(); iterator.hasNext();) {
					CirujanoActivo cirujano = (CirujanoActivo) iterator.next();
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
		
		
		getConsultaDatosMedico().getSeleccion().getCmbID().removeAllItems();
		getConsultaDatosMedico().getSeleccion().getCmbNombre().removeAllItems();
		getBajaMedico().getSeleccion().getCmbID().removeAllItems();
		getBajaMedico().getSeleccion().getCmbNombre().removeAllItems();
		getConsultaDatosPacientes().getSeleccion().getCmbID().removeAllItems();
		getConsultaDatosPacientes().getSeleccion().getCmbNombre().removeAllItems();
		for (Iterator<CirujanoActivo> iterator = almacenMedicos.obtenerListaCirujanos().iterator(); iterator.hasNext();) {
			CirujanoActivo cirujanoActivo = (CirujanoActivo) iterator.next();
			getConsultaDatosMedico().getSeleccion().getCmbID().addItem(cirujanoActivo.getIdPersona());
			getConsultaDatosMedico().getSeleccion().getCmbNombre().addItem(cirujanoActivo.getNombre());
			getBajaMedico().getSeleccion().getCmbID().addItem(cirujanoActivo.getIdPersona());
			getBajaMedico().getSeleccion().getCmbNombre().addItem(cirujanoActivo.getNombre());
		}
		Collection<String> ids= almacenPacientes.obetenerMapa().values();
		Collection<String> nombres=almacenPacientes.obetenerMapa().keySet();
		
		for (String id : ids) {
			getConsultaDatosPacientes().getSeleccion().getCmbID().addItem(id);
			getBajaPaciente().getSeleccion().getCmbID().addItem(id);
		}
		for (String nombre : nombres) {
			getConsultaDatosPacientes().getSeleccion().getCmbNombre().addItem(nombre);
			getBajaPaciente().getSeleccion().getCmbNombre().addItem(nombre);
		}
	}
}
