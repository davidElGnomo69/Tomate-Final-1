package vistaVentana;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import panelComunes.Mensaje;
import vistaMedico.AltaMedico;
import vistaMedico.AtenderCita;
import vistaMedico.BajaMedico;
import vistaMedico.ConsultaMedico;
import vistaOperacion.CierreOperacion;
import vistaPaciente.AltaPaciente;
import vistaPaciente.BajaPaciente;
import vistaPaciente.ConsultaCitasPendientes;
import vistaPaciente.ConsultaDatosPaciente;
import vistaPaciente.HistorialPaciente;
import vistaPaciente.ModificacionPaciente;
import vistaPaciente.PedirCitaEspecialista;
import vistaPaciente.PedirCitaPrimaria;
import vistaPaciente.PedirOperacion;
import javax.swing.BoxLayout;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Component;

public class UIGazpacho extends JFrame {

	protected JPanel contentPane;
	protected JButton btnPasarTiempo;
	protected JSpinner spnPasarHora;
	protected JSpinner spnPasarDía;
	protected JMenuBar menu;
	private AltaPaciente altaPaciente;
	private BajaPaciente bajaPaciente;
	private ModificacionPaciente modificacionPaciente;
	private PedirCitaEspecialista pedirCitaEspecialista;
	private PedirOperacion pedirOperacion;
	private PedirCitaPrimaria pedirCitaPrimaria;
	private CierreOperacion cierreOperacion;
	private AltaMedico altaMedico;
	private AtenderCita atenderCita;
	private BajaMedico bajaMedico;
	private ConsultaMedico consultaDatosMedico;
	private ConsultaCitasPendientes consultaCitasPendientes;
	private ConsultaDatosPaciente consultaDatosPacientes;
	private HistorialPaciente historialPaciente;

	/**
	 * Create the frame.
	 */
	public UIGazpacho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 800);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		// PANELES
		altaPaciente = new AltaPaciente();
		altaPaciente.setMaximumSize(new Dimension(3000, 32767));
		contentPane.add(altaPaciente, "altaPaciente");
		bajaPaciente = new BajaPaciente();
		contentPane.add(bajaPaciente, "bajaPaciente");
		consultaCitasPendientes = new ConsultaCitasPendientes();
		contentPane.add(consultaCitasPendientes, "consultaCitasPendientes");
		consultaDatosPacientes = new ConsultaDatosPaciente();
		contentPane.add(consultaDatosPacientes, "consultaDatosPaciente");
		historialPaciente = new HistorialPaciente();
		contentPane.add(historialPaciente, "historialPaciente");
		modificacionPaciente = new ModificacionPaciente();
		contentPane.add(modificacionPaciente, "modificacionPaciente");
		pedirCitaEspecialista = new PedirCitaEspecialista();
		contentPane.add(pedirCitaEspecialista, "pedirCitaEspecialista");
		pedirCitaPrimaria = new PedirCitaPrimaria();
		contentPane.add(pedirCitaPrimaria, "pedirCitaPrimaria");
		pedirOperacion = new PedirOperacion();
		contentPane.add(pedirOperacion, "pedirOperacion");
		cierreOperacion = new CierreOperacion();
		contentPane.add(cierreOperacion, "cierreOperacion");
		altaMedico = new AltaMedico();
		contentPane.add(altaMedico, "altaMedico");
		atenderCita = new AtenderCita();
		contentPane.add(atenderCita, "atenderCita");
		bajaMedico = new BajaMedico();
		contentPane.add(bajaMedico, "bajaMedico");
		consultaDatosMedico = new ConsultaMedico();
		contentPane.add(consultaDatosMedico, "consultaDatosMedico");

		menu = new JMenuBar();
		setJMenuBar(menu);

		JMenu mnPaciente = new JMenu("Paciente");
		mnPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menu.add(mnPaciente);

		JMenuItem mntmAlta = new JMenuItem("Alta");
		mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("altaPaciente");
			}
		});

		mnPaciente.add(mntmAlta);

		JMenuItem mntmBaja = new JMenuItem("Baja");
		mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("bajaPaciente");
			}
		});
		mnPaciente.add(mntmBaja);

		JMenuItem mntmModificacion = new JMenuItem("Modificacion");
		mntmModificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("modificacionPaciente");
			}
		});
		mnPaciente.add(mntmModificacion);

		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("consultaDatosPaciente");
			}
		});
		mnPaciente.add(mntmConsulta);

		JMenuItem mntmPedirCitaPrimaria = new JMenuItem("Pedir Cita Primaria");
		mntmPedirCitaPrimaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("pedirCitaPrimaria");
			}
		});
		mnPaciente.add(mntmPedirCitaPrimaria);

		JMenuItem mntmPedirCitaEspecialista = new JMenuItem("Pedir Cita Especialista");
		mntmPedirCitaEspecialista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("pedirCitaEspecialista");
			}
		});
		mnPaciente.add(mntmPedirCitaEspecialista);

		JMenuItem mntmPedirOperacion = new JMenuItem("Pedir Operacion");
		mntmPedirOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("pedirOperacion");
			}
		});
		mnPaciente.add(mntmPedirOperacion);

		JMenuItem mntmConsultarCitas = new JMenuItem("Consultar citas");
		mntmConsultarCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("consultaCitasPendientes");
			}
		});
		mnPaciente.add(mntmConsultarCitas);

		JMenuItem mntmVerHistorial = new JMenuItem("Ver Historial");
		mntmVerHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("historialPaciente");
			}
		});
		mnPaciente.add(mntmVerHistorial);

		JMenu mnMedico = new JMenu("Medico");
		mnMedico.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menu.add(mnMedico);

		JMenuItem mntmAlta_1 = new JMenuItem("Alta");
		mntmAlta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("altaMedico");
			}
		});
		mnMedico.add( mntmAlta_1);
		
		JMenuItem mntmBaja_1 = new JMenuItem("Baja");
		mntmBaja_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("bajaMedico");
			}
		});
		mnMedico.add(mntmBaja_1);

		JMenuItem mntmConsulta_1 = new JMenuItem("Consulta");
		mntmConsulta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asociarPanel("consultaDatosMedico");
			}
		});
		mnMedico.add(mntmConsulta_1);

		JMenuItem mntmAtenderCita = new JMenuItem("Atender cita");
		mntmAtenderCita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("atenderCita");
			}
		});
		mnMedico.add(mntmAtenderCita);

		JMenu mnOperacion = new JMenu("Operacion");
		mnOperacion.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menu.add(mnOperacion);

		JMenuItem mntmCerrarOperacion = new JMenuItem("Cerrar Operacion");
		mntmCerrarOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asociarPanel("cierreOperacion");
			}
		});
		mnOperacion.add(mntmCerrarOperacion);
		
		JPanel panel = new JPanel();
		menu.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		spnPasarHora = new JSpinner();
		spnPasarHora.setMaximumSize(new Dimension(100, 32767));
		spnPasarHora.setMinimumSize(new Dimension(17, 20));
		panel.add(spnPasarHora);
		
		JLabel lblPasarHora = new JLabel("Pasar Hora");
		panel.add(lblPasarHora);
		
		spnPasarDía = new JSpinner();
		spnPasarDía.setMaximumSize(new Dimension(100, 32767));
		panel.add(spnPasarDía);
		
		JLabel lblPasarDa = new JLabel("Pasar d\u00EDa");
		panel.add(lblPasarDa);
		
		btnPasarTiempo = new JButton("Aplicar");
		
		menu.add(btnPasarTiempo);

	}
	

	public AltaPaciente getAltaPaciente() {
		return altaPaciente;
	}
	


	public JMenuBar getMenu() {
		return menu;
	}


	public BajaPaciente getBajaPaciente() {
		return bajaPaciente;
	}


	public ModificacionPaciente getModificacionPaciente() {
		return modificacionPaciente;
	}


	public PedirCitaEspecialista getPedirCitaEspecialista() {
		return pedirCitaEspecialista;
	}


	public PedirOperacion getPedirOperacion() {
		return pedirOperacion;
	}


	public PedirCitaPrimaria getPedirCitaPrimaria() {
		return pedirCitaPrimaria;
	}


	public CierreOperacion getCierreOperacion() {
		return cierreOperacion;
	}


	public AltaMedico getAltaMedico() {
		return altaMedico;
	}


	public AtenderCita getAtenderCita() {
		return atenderCita;
	}


	public BajaMedico getBajaMedico() {
		return bajaMedico;
	}


	public ConsultaMedico getConsultaDatosMedico() {
		return consultaDatosMedico;
	}


	public ConsultaCitasPendientes getConsultaCitasPendientes() {
		return consultaCitasPendientes;
	}


	public ConsultaDatosPaciente getConsultaDatosPacientes() {
		return consultaDatosPacientes;
	}


	public HistorialPaciente getHistorialPaciente() {
		return historialPaciente;
	}


	private void asociarPanel(String string) {
		((CardLayout) contentPane.getLayout()).show(contentPane, string);
	}
}
