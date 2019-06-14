package vistaOperacion;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Mensaje;
import panelComunes.Tabla;

public class CierreOperacion extends JPanel {
	String [] titulosColumnas = {"Paciente","Operacion","Cirujano","Resultado"};
	String [] campos = {"tuputamadre","minguito","espabilate","que stas por hacer desgraciao"};
	
	Mensaje mensaje;
	
	/**
	 * Create the panel.
	 */
	public CierreOperacion() {
		mensaje = new Mensaje();
		Tabla tabla = new Tabla("Cierre operaciones", titulosColumnas );
		tabla.agregarFila(campos);
		
		JLabel lblNewLabel = new JLabel("Cerrar Operaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(mensaje, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
						.addComponent(tabla, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING))
					.addGap(37))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(tabla, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
	
	public Mensaje getMensajeCierreOperacion() {
		return mensaje;
	}

	public void setMensajeCierreOperacion(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getTextField() {
		return mensaje.getTextField().getText();
	}

}
