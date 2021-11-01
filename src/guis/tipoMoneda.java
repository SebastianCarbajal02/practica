package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tipoMoneda extends JDialog implements ActionListener {
	private JTextField txtMoneda;
	private JButton btnConvertir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			tipoMoneda dialog = new tipoMoneda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public tipoMoneda() {
		setTitle("CAMBIO DE MONEDA");
		setBounds(100, 100, 450, 123);
		getContentPane().setLayout(null);
		
		JLabel lblMoneda = new JLabel("Moneda :");
		lblMoneda.setBounds(10, 36, 46, 14);
		getContentPane().add(lblMoneda);
		
		txtMoneda = new JTextField();
		txtMoneda.setBounds(66, 33, 86, 20);
		getContentPane().add(txtMoneda);
		txtMoneda.setColumns(10);
		
		JComboBox cboMoneda = new JComboBox();
		cboMoneda.setBounds(162, 32, 86, 22);
		getContentPane().add(cboMoneda);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(this);
		btnConvertir.setBounds(335, 11, 89, 23);
		getContentPane().add(btnConvertir);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(335, 36, 89, 23);
		getContentPane().add(btnBorrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConvertir) {
			actionPerformedBtnConvertir(e);
		}
	}
	protected void actionPerformedBtnConvertir(ActionEvent e) {
	}
}
