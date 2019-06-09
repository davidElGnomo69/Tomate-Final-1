package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Identificacion;
import panelComunes.Seleccion;

import java.awt.BorderLayout;

public class ConsultaDatosPaciente extends JPanel {

	Identificacion identificacion;

	/**
	 * Create the panel.
	 */
	public ConsultaDatosPaciente() {
		Seleccion seleccion = new Seleccion();
		identificacion = new Identificacion();

		JLabel lblNewLabel = new JLabel("Consulta Datos Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));

		int[] camposDeshabilitados = { 0, 1, 2, 3, 4 };
		identificacion.deshabilitarCampo(camposDeshabilitados);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
								groupLayout.createSequentialGroup().addContainerGap().addComponent(lblNewLabel,
										GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup().addGap(23)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(identificacion, GroupLayout.DEFAULT_SIZE, 384,
														Short.MAX_VALUE)
												.addComponent(seleccion, GroupLayout.DEFAULT_SIZE, 384,
														Short.MAX_VALUE))))
						.addGap(30)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(seleccion, GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(identificacion, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE).addGap(38)));
		setLayout(groupLayout);

	}

	public Identificacion getIdentificacionConsultaDatosPaciente() {
		return identificacion;
	}

	public void setIdentificacionConsultaDatosPaciente(Identificacion identificacion) {
		this.identificacion = identificacion;
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

}
