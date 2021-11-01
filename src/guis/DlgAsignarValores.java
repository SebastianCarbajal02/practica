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
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class DlgAsignarValores extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidad;
	private JTextField txtDias;
	private JTextField txtHora;
	private JTextField txtMinutos;
	private JButton btnAñadir;
	private JLabel lblImagen;
	private JComboBox cboArtefac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgAsignarValores dialog = new DlgAsignarValores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgAsignarValores() {
		setBounds(100, 100, 633, 311);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblImagen = new JLabel("");
			lblImagen.setBounds(10, 94, 115, 104);
			contentPanel.add(lblImagen);
		}
		{
			cboArtefac = new JComboBox();
			cboArtefac.addActionListener(this);
			cboArtefac.setModel(new DefaultComboBoxModel(new String[] {""}));
			cboArtefac.setBounds(10, 61, 115, 22);
			contentPanel.add(cboArtefac);
		}
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(211, 62, 86, 20);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtDias = new JTextField();
		txtDias.setBounds(363, 62, 86, 20);
		contentPanel.add(txtDias);
		txtDias.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad :");
		lblCantidad.setBounds(135, 65, 66, 14);
		contentPanel.add(lblCantidad);
		
		JLabel lblDias = new JLabel("D\u00EDas :");
		lblDias.setBounds(307, 65, 46, 14);
		contentPanel.add(lblDias);
		
		JLabel lblHoras = new JLabel("Horas :");
		lblHoras.setBounds(459, 65, 46, 14);
		contentPanel.add(lblHoras);
		
		txtHora = new JTextField();
		txtHora.setBounds(498, 62, 32, 20);
		contentPanel.add(txtHora);
		txtHora.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setBounds(540, 65, 16, 14);
		contentPanel.add(lblNewLabel_1);
		
		txtMinutos = new JTextField();
		txtMinutos.setBounds(563, 62, 32, 20);
		contentPanel.add(txtMinutos);
		txtMinutos.setColumns(10);
		
		btnAñadir = new JButton("A\u00F1adir Valores");
		btnAñadir.addActionListener(this);
		btnAñadir.setBounds(410, 175, 197, 22);
		contentPanel.add(btnAñadir);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(292, 175, 89, 23);
		contentPanel.add(btnGuardar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DlgAsignarValores.class.getResource("/img/fondoparalosdlg.jpg")));
		lblNewLabel_2.setBounds(0, 0, 617, 272);
		contentPanel.add(lblNewLabel_2);
		
		//Añadir los elementos
		for(int i = 0;i<FrmPrincipal.objetos.length;i++){
	        
	        switch(FrmPrincipal.objetos[i]){ 
	        case 0:
					cboArtefac.addItem("Computadora");
					imagen("/img/pc.png");
				break;
			default:
				cboArtefac.addItem("Foco ahorrador");
				imagen("/img/pc.png");
				break;
			
	        }
	        }
         
	   }
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboArtefac) {
			actionPerformedCboPrueba(e);
		}
		if (e.getSource() == btnAñadir) {
			actionPerformedBtnAñadir(e);
		}
	}
	
	
	protected void actionPerformedBtnAñadir(ActionEvent e) {
		for(int i = 0;i<FrmPrincipal.objetos.length;i++){
			
			
			switch(FrmPrincipal.objetos[i]) {
			case 0:
				cboArtefac.removeItem("Computadora");
				imagen("/img/pc.png");
			break;
			case 1:
				imagen("/img/aspiradora.png");
			break;
			
			}
			 }
	}	
	
	public void imagen(String ubicacion){
		ImageIcon imagen = new ImageIcon(getClass().getResource(ubicacion)); 
		ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
		lblImagen.setIcon(icono);

	}
	protected void actionPerformedCboPrueba(ActionEvent e) {
	}
}
