package vistaMedico;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import panelComunes.Identificacion;
import panelComunes.Mensaje;

public class AltaMedico extends JPanel {

	private JTextField altaConsulta;
	private JTextField altaHorario;
	
	Identificacion identificacion;
	Mensaje mensaje;

	/**
	 * Create the frame.
	 */
	public AltaMedico() {
		setBounds(100, 100, 657, 475);

		JLabel lblEspecialidad = new JLabel("Especialidad");

		JComboBox altaEspecialidad = new JComboBox();

		JLabel lblConsulta = new JLabel("Consulta");

		JLabel lblHorario = new JLabel("Horario");

		altaConsulta = new JTextField();
		altaConsulta.setColumns(10);

		altaHorario = new JTextField();
		altaHorario.setColumns(10);

		JLabel lblAltaMedico = new JLabel("Alta Medico");
		lblAltaMedico.setFont(new Font("Tahoma", Font.PLAIN, 24));

		identificacion = new Identificacion();

		mensaje = new Mensaje();
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(lblAltaMedico)
					.addContainerGap(504, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(101)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(identificacion, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(9)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblConsulta)
										.addComponent(lblEspecialidad)
										.addComponent(lblHorario))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(altaHorario, 356, 356, 356)
										.addComponent(altaConsulta, 356, 356, 356)
										.addComponent(altaEspecialidad, 0, 356, Short.MAX_VALUE))
									.addGap(11))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(mensaje, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
									.addGap(3)))
							.addGap(92))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(lblAltaMedico)
					.addGap(52)
					.addComponent(identificacion, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(altaEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEspecialidad))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(altaConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblConsulta))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHorario)
						.addComponent(altaHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		this.setLayout(gl_contentPane);
	}
	
	public Identificacion getIdentificacionAltaMedico() {
		return identificacion;
	}

	public void setIdentificacionAltaMedico(Identificacion identificacion) {
		this.identificacion = identificacion;
	}

	public Mensaje getMensajeAltaMedico() {
		return mensaje;
	}

	public void setMensajeAltaMedico(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

	public String getTxtNombre() {
		return identificacion.getTextNombre().getText();
	}

	public String getTextApellidos() {
		return identificacion.getTextApellidos().getText();
	}

	public String getTextDireccion() {
		return identificacion.getTextDireccion().getText();
	}

	public String getTextTelefono() {
		return identificacion.getTextTelefono().getText();
	}

	public String getTxtNacimiento() {
		return identificacion.getTxtNacimiento().getText();
	}

	public String getTextField() {
		return mensaje.getTextField().getText();
	}

	public JTextField getAltaConsulta() {
		return altaConsulta;
	}

	public void setAltaConsulta(JTextField altaConsulta) {
		this.altaConsulta = altaConsulta;
	}

	public JTextField getAltaHorario() {
		return altaHorario;
	}

	public void setAltaHorario(JTextField altaHorario) {
		this.altaHorario = altaHorario;
	}

}