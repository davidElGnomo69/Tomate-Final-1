package vistaMedico;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import panelComunes.Mensaje;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AtenderCita extends JPanel {

	private JTextField citaPaciente;
	private JTextField citaHora;
	private JTextField citaPeriodo;
	private JTextField citaDosis;

	Mensaje mensaje;

	/**
	 * Create the frame.
	 */
	public AtenderCita() {
		setBounds(100, 100, 671, 487);

		JLabel lblMedico = new JLabel("Medico");

		JLabel lblPaciente = new JLabel("Paciente");

		JLabel lblNewLabel = new JLabel("Hora cita");

		JComboBox citaMedico = new JComboBox();

		citaPaciente = new JTextField();
		citaPaciente.setEditable(false);
		citaPaciente.setColumns(10);

		citaHora = new JTextField();
		citaHora.setEditable(false);
		citaHora.setColumns(10);

		JLabel lblObservaciones = new JLabel("Observaciones");

		JLabel lblTratamiento = new JLabel("Tratamiento");

		JLabel lblMecicamento = new JLabel("Medicamento");

		JLabel lblNewLabel_1 = new JLabel("Periodo");

		JLabel lblDosis = new JLabel("Dosis");

		JComboBox citaMedicamento = new JComboBox();

		citaPeriodo = new JTextField();
		citaPeriodo.setColumns(10);

		citaDosis = new JTextField();
		citaDosis.setColumns(10);

		JLabel lblAtencionACita = new JLabel("Atencion a Cita");
		lblAtencionACita.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JScrollPane scrollPane = new JScrollPane();

		mensaje = new Mensaje();

		JTextArea citaObservaciones = new JTextArea();
		scrollPane.setViewportView(citaObservaciones);
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(39).addComponent(lblMedico).addGap(35)
						.addComponent(citaMedico, 0, 367, Short.MAX_VALUE).addGap(197))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(39).addComponent(lblNewLabel).addGap(25)
						.addComponent(citaHora, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE).addGap(334))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(39)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE).addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblMecicamento)
								.addComponent(lblDosis).addComponent(lblNewLabel_1))
						.addGap(10)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(citaMedicamento, 0, 240, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(citaDosis, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
										.addGap(92))
								.addGroup(
										gl_contentPane.createSequentialGroup()
												.addComponent(citaPeriodo, GroupLayout.DEFAULT_SIZE, 148,
														Short.MAX_VALUE)
												.addGap(92)))
						.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(39)
						.addComponent(mensaje, GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE).addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(39)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblObservaciones)
										.addPreferredGap(ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
										.addComponent(lblTratamiento).addGap(81))
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblPaciente).addGap(27)
										.addComponent(citaPaciente, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)))
						.addGap(150))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(lblAtencionACita).addContainerGap(502, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblAtencionACita)
						.addGap(33)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblMedico))
								.addComponent(citaMedico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblPaciente))
								.addComponent(citaPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup().addGap(3)
														.addComponent(lblNewLabel))
												.addComponent(citaHora, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(41).addComponent(lblObservaciones).addGap(9))
								.addGroup(
										gl_contentPane.createSequentialGroup().addComponent(lblTratamiento).addGap(18)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(9).addComponent(scrollPane,
										GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane
										.createSequentialGroup().addGap(3).addComponent(lblMecicamento).addGap(17)
										.addComponent(lblDosis).addGap(24).addComponent(lblNewLabel_1))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(citaMedicamento, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(11)
										.addComponent(citaDosis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(citaPeriodo, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(18).addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)));
		this.setLayout(gl_contentPane);
	}

	public Mensaje getMensajeAtenderCita() {
		return mensaje;
	}

	public void setMensajeAtenderCita(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

	public JTextField getCitaPaciente() {
		return citaPaciente;
	}

	public void setCitaPaciente(JTextField citaPaciente) {
		this.citaPaciente = citaPaciente;
	}

	public JTextField getCitaHora() {
		return citaHora;
	}

	public void setCitaHora(JTextField citaHora) {
		this.citaHora = citaHora;
	}

	public JTextField getCitaPeriodo() {
		return citaPeriodo;
	}

	public void setCitaPeriodo(JTextField citaPeriodo) {
		this.citaPeriodo = citaPeriodo;
	}

	public JTextField getCitaDosis() {
		return citaDosis;
	}

	public void setCitaDosis(JTextField citaDosis) {
		this.citaDosis = citaDosis;
	}

	public String getTextField() {
		return mensaje.getTextField().getText();
	}

}
