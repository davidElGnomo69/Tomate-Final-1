package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Identificacion;
import panelComunes.Mensaje;
import panelComunes.Seleccion;

import java.awt.BorderLayout;

public class ModificacionPaciente extends JPanel {
	Identificacion identificacion;
	Mensaje mensaje;

	/**
	 * Create the panel.
	 */
	public ModificacionPaciente() {
		Seleccion seleccion = new Seleccion();
		identificacion = new Identificacion();
		mensaje = new Mensaje();

		JLabel lblNewLabel = new JLabel("Modificacion Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));

		int[] camposDeshabilitados = { 0, 1, 3 };
		identificacion.deshabilitarCampo(camposDeshabilitados);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(26).addComponent(identificacion,
								GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup().addGap(26)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(mensaje, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
										.addComponent(seleccion, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblNewLabel)))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblNewLabel).addGap(18)
						.addComponent(seleccion, GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(identificacion, GroupLayout.PREFERRED_SIZE, 169, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		setLayout(groupLayout);

	}

	public Identificacion getIdentificacionModificacionPaciente() {
		return identificacion;
	}

	public void setIdentificacionModificacionPaciente(Identificacion identificacion) {
		this.identificacion = identificacion;
	}

	public Mensaje getMensajeModificacionPaciente() {
		return mensaje;
	}

	public void setMensajeModificacionPaciente(Mensaje mensaje) {
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

}
