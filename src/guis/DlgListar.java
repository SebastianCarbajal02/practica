package guis;

import java.awt.BorderLayout;


import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class DlgListar extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JComboBox cboModelo;
	private JLabel lblImagene;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgListar dialog = new DlgListar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgListar() {
		setTitle("Electrodom\u00E9sticos");
		setBounds(100, 100, 594, 298);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("Electrodom\u00E9sticos");
		lblNewLabel.setBounds(10, 36, 179, 14);
		contentPanel.add(lblNewLabel);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Computadora ", "Foco ahorrador ", "Cocina", "TV", "Terma", "Equipo de video", "Equipo de sonido ", "Foco incandescente ", "Foco led", "Hervidor", "Lavadora", "Licuadora ", "Aspiradora ", "Microondas ", "Olla rosera ", "Plancha", "Celular", "Refrigeradora ", "Secador de cabella", "Ventilador", " Calentador ", " Ducha el\u00E9ctrica ", " Aire acondicionado "}));
		cboModelo.setBounds(156, 33, 179, 20);
		contentPanel.add(cboModelo);
		
		lblImagene = new JLabel("New label");
		lblImagene.setBounds(10, 119, 135, 93);
		contentPanel.add(lblImagene);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 99, 412, 149);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.setIcon(new ImageIcon(DlgListar.class.getResource("/img/boton-x.png")));
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(462, 27, 106, 33);
		contentPanel.add(btnNewButton);
		
		txtS.setText("");
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DlgListar.class.getResource("/img/fondoparalosdlg.jpg")));
		lblNewLabel_1.setBounds(0, 0, 578, 259);
		contentPanel.add(lblNewLabel_1);
		txtS.append("PC CONSUME UN CHINGO");
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboModelo) {
			actionPerformedComboBox(arg0);
		}
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		dispose();
		
		
	}
	protected void actionPerformedComboBox(ActionEvent arg0) {
		int modelo = cboModelo.getSelectedIndex();
		switch(modelo){
		case 0:
			txtS.setText("");
			txtS.append("PC CONSUME UN CHINGO");
			imagen("/img/pc.png");
			break;
		case 1:
			txtS.setText("");
			txtS.append("PC CONSUME UN CHINGO");
			imagen("/img/aspiradora.png");
			break;	
		default:
			txtS.append("Aire acondicionado consume un chingo: " );
		}
	}
	public void imagen(String ubicacion){
		ImageIcon imagen = new ImageIcon(getClass().getResource(ubicacion)); 
		ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagene.getWidth(), lblImagene.getHeight(), Image.SCALE_DEFAULT));
		lblImagene.setIcon(icono);

	}
}
