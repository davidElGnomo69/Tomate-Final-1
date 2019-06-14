package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Mensaje;
import panelComunes.Seleccion;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PedirOperacion extends JPanel {

	Mensaje mensaje;
	/**
	 * Create the panel.
	 */
	public PedirOperacion() {
		Seleccion seleccion = new Seleccion();
		Mensaje mensaje = new Mensaje();
		
		
		JLabel lblCitaOperacion = new JLabel("Cita Operacion");
		lblCitaOperacion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		
		
		JLabel lblNewLabel = new JLabel("Tipo");
		
		JComboBox cmbTipoOperacion = new JComboBox();
		
		JLabel lblNewLabel_1 = new JLabel("Cirujano");
		
		JComboBox cmbCirujanoOperacion = new JComboBox();
		
		JLabel lblFechasDisponibles = new JLabel("Fechas Disponibles");
		
		JComboBox cmbBusquedaFecha = new JComboBox();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(seleccion, GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(mensaje, GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCitaOperacion)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(8)
									.addComponent(lblFechasDisponibles, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(cmbBusquedaFecha, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cmbTipoOperacion, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cmbCirujanoOperacion, 0, 269, Short.MAX_VALUE)
							.addGap(18))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCitaOperacion)
					.addGap(18)
					.addComponent(seleccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(cmbTipoOperacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmbCirujanoOperacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cmbBusquedaFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFechasDisponibles))
					.addPreferredGap(ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
					.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
	public Mensaje getMensajePedirCitaOperacion() {
		return mensaje;
	}

	public void setMensajePedirCitaOperacion(Mensaje mensaje) {
		this.mensaje = mensaje;
	}

	public String getTextField() {
		return mensaje.getTextField().getText();
	}


}
