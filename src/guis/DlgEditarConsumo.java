package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import Arreglos.arregloElectrodomestico;
import clases.Electrodomesticos;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgEditarConsumo extends JDialog implements ActionListener {
	private JTextField txtConsumo;
	private JTextField txtConsumidor;
	private JButton btnAceptar;
	
	arregloElectrodomestico a = new arregloElectrodomestico();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgEditarConsumo dialog = new DlgEditarConsumo ();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgEditarConsumo() {
		setTitle("EDITAR CONSUMO");
		setBounds(100, 100, 704, 122);
		getContentPane().setLayout(null);
		
		JLabel lblConsumidor = new JLabel("Electrodomesticos :");
		lblConsumidor.setBounds(10, 36, 108, 14);
		getContentPane().add(lblConsumidor);
		
		txtConsumo = new JTextField();
		txtConsumo.setBounds(335, 33, 102, 20);
		getContentPane().add(txtConsumo);
		txtConsumo.setColumns(10);
		
		JComboBox cboMoneda = new JComboBox();
		cboMoneda.setModel(new DefaultComboBoxModel(new String[] {"kWh", "Watts"}));
		cboMoneda.setBounds(447, 32, 97, 22);
		getContentPane().add(cboMoneda);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(589, 11, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(589, 36, 89, 23);
		getContentPane().add(btnBorrar);
		
		txtConsumidor = new JTextField();
		txtConsumidor.setColumns(10);
		txtConsumidor.setBounds(112, 33, 135, 20);
		getContentPane().add(txtConsumidor);
		
		JLabel lblConsumo = new JLabel("Consumo :");
		lblConsumo.setBounds(272, 36, 64, 14);
		getContentPane().add(lblConsumo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DlgEditarConsumo.class.getResource("/img/fondoparalosdlg.jpg")));
		lblNewLabel.setBounds(0, 0, 688, 83);
		getContentPane().add(lblNewLabel);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		String txtNombre = "";
		double consumo = 0;
		int tipo = 0;
		
		Electrodomesticos xd = a.buscar(txtNombre);
		
		if(tipo == 0){
			xd.setKwhElectrodomestico(consumo);
		}else {
			
		}
		
		
	}
}