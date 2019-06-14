package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Identificacion;
import panelComunes.Mensaje;
import panelComunes.Seleccion;

public class BajaPaciente extends JPanel {

	/**
	 * Create the panel.
	 */
	public BajaPaciente() {
		Identificacion identificacion = new Identificacion();
		Mensaje mensaje = new Mensaje();
		Seleccion seleccion = new Seleccion();
		
		
		
		JLabel lblBajaPaciente = new JLabel("Baja Paciente");
		lblBajaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		int[] camposDeshabilitados=  {0,1,2,3,4};
		identificacion.deshabilitarCampo(camposDeshabilitados);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(31)
							.addComponent(seleccion, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblBajaPaciente, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(mensaje, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
								.addComponent(identificacion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBajaPaciente, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(seleccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(identificacion, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		setLayout(groupLayout);

	}

}
