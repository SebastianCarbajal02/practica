package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class DlgCambiarCostoConsumo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField txtCostoConsumo;
	private JButton btnCambiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgCambiarCostoConsumo dialog = new DlgCambiarCostoConsumo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCambiarCostoConsumo() {
		setTitle("Cambiar costo por consumo ");
		setBounds(100, 100, 469, 117);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("Cambiar costo de consumo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 26, 203, 28);
		contentPanel.add(lblNewLabel);
		
		txtCostoConsumo = new JTextField();
		txtCostoConsumo.setBounds(208, 32, 93, 20);
		contentPanel.add(txtCostoConsumo);
		txtCostoConsumo.setColumns(10);
		
		btnCambiar = new JButton("Cambiar");
		btnCambiar.setBounds(333, 31, 89, 23);
		contentPanel.add(btnCambiar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DlgCambiarCostoConsumo.class.getResource("/img/fondoparalosdlg.jpg")));
		lblNewLabel_1.setBounds(0, 0, 453, 78);
		contentPanel.add(lblNewLabel_1);
	}
}
