package vistaPaciente;

import javax.swing.JPanel;
import javax.crypto.SealedObject;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Mensaje;
import panelComunes.Seleccion;
import panelComunes.VistaCitaIssam;

import java.awt.BorderLayout;

public class PedirCitaEspecialista extends JPanel {

	Mensaje mensaje;

	/**
	 * Create the panel.
	 */
	public PedirCitaEspecialista() {
		Seleccion seleccion = new Seleccion();
		VistaCitaIssam horario = new VistaCitaIssam();
		mensaje = new Mensaje();

		JLabel lblNewLabel = new JLabel("Cita Especialista");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addContainerGap()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(mensaje, GroupLayout.DEFAULT_SIZE, 683,
																Short.MAX_VALUE)
														.addContainerGap())
												.addGroup(Alignment.TRAILING,
														groupLayout.createSequentialGroup()
																.addComponent(horario, GroupLayout.DEFAULT_SIZE, 699,
																		Short.MAX_VALUE)
																.addContainerGap())
												.addGroup(Alignment.TRAILING,
														groupLayout.createSequentialGroup()
																.addComponent(seleccion, GroupLayout.DEFAULT_SIZE, 699,
																		Short.MAX_VALUE)
																.addContainerGap())
												.addGroup(Alignment.TRAILING,
														groupLayout.createSequentialGroup().addComponent(lblNewLabel)
																.addContainerGap(540, Short.MAX_VALUE)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblNewLabel)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(seleccion, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(horario, GroupLayout.PREFERRED_SIZE, 298, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		setLayout(groupLayout);

	}

	public Mensaje getMensajePedirCitaEspecialista() {
		return mensaje;
	}

	public void setMensajePedirCitaEspecialista(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

	public String getTextField() {
		return mensaje.getTextField().getText();
	}

}
