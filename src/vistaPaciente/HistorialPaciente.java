package vistaPaciente;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Seleccion;
import panelComunes.Tabla;

public class HistorialPaciente extends JPanel {
	String [] titulosColumnas = {"Paciente","Tipo","Fecha","Medico"};
	String [] titulosColumnas2 = {"Paciente","Medicamento","Posologia","Periodo"};
	/**
	 * Create the panel.
	 */
	public HistorialPaciente() {
		
		Tabla tabla = new Tabla("Historial citas", titulosColumnas, null, titulosColumnas);
		Tabla tabla2 = new Tabla("Tratamiento", titulosColumnas2, null, titulosColumnas);
		Seleccion seleccion = new Seleccion();
		JLabel lblNewLabel = new JLabel("Historial Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(tabla2, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(seleccion, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(tabla, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(seleccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tabla, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
					.addGap(13)
					.addComponent(tabla2, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
					.addGap(19))
		);
		
		setLayout(groupLayout);

	}
}
