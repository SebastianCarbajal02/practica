package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class FrmPrincipal extends JFrame implements ActionListener {
	

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnConfig;
	private JMenu mnDetalles;
	private JMenu mnAcerca;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsumo;
	private JMenuItem mntmCosto;
	private JMenuItem mntmNewMenuItem;
	private JSeparator separator;
	private JMenuItem mntmNewMenuItem_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;

	public static int[] objetos;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPrincipal() {
		
		
		this.setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 675);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/carpetas.png")));
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("");
		mntmSalir.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/puerta-de-salida.png")));
		mntmSalir.setSelectedIcon(null);
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnDetalles = new JMenu("Detalles");
		mnDetalles.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/detalles.png")));
		menuBar.add(mnDetalles);
		
		mntmNewMenuItem = new JMenuItem("Listar");
		mntmNewMenuItem.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/lista-de-verificacion.png")));
		mntmNewMenuItem.addActionListener(this);
		mnDetalles.add(mntmNewMenuItem);
		
		mnConfig = new JMenu("Configuraci\u00F3n");
		mnConfig.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/configuracion.png")));
		menuBar.add(mnConfig);
		
		mntmConsumo = new JMenuItem("Consumo");
		mntmConsumo.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/consumo-de-energia.png")));
		mntmConsumo.addActionListener(this);
		mnConfig.add(mntmConsumo);
		
		mntmCosto = new JMenuItem("Costo");
		mntmCosto.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/costos.png")));
		mntmCosto.addActionListener(this);
		mnConfig.add(mntmCosto);
		
		mnAcerca = new JMenu("Acerca de nosotros");
		mnAcerca.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/equipos.png")));
		menuBar.add(mnAcerca);
		
		mntmNewMenuItem_1 = new JMenuItem("");
		mntmNewMenuItem_1.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/cola.png")));
		mntmNewMenuItem_1.addActionListener(this);
		mnAcerca.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		separator = new JSeparator();
		separator.setBounds(192, 109, 593, -5);
		contentPane.add(separator);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/ordenador-de-sobremesa (1).png")));
		lblNewLabel.setBounds(79, 53, 64, 64);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/aire-acondicionado.png")));
		lblNewLabel_2.setBounds(209, 53, 64, 64);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/bombilla.png")));
		lblNewLabel_3.setBounds(604, 53, 64, 64);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/aspiradora.png")));
		lblNewLabel_4.setBounds(346, 53, 64, 64);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/bombilla-de-idea.png")));
		lblNewLabel_5.setBounds(475, 53, 64, 64);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/bulbo.png")));
		lblNewLabel_6.setBounds(735, 53, 64, 64);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/calentador-de-agua.png")));
		lblNewLabel_7.setBounds(867, 53, 64, 64);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/calentador.png")));
		lblNewLabel_8.setBounds(79, 485, 64, 64);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/cocina.png")));
		lblNewLabel_9.setBounds(209, 201, 64, 64);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/equipo-de-sonido.png")));
		lblNewLabel_10.setBounds(749, 336, 64, 64);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/hervidor-electrico.png")));
		lblNewLabel_11.setBounds(79, 201, 64, 64);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/licuadora.png")));
		lblNewLabel_12.setBounds(867, 201, 64, 64);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/microonda.png")));
		lblNewLabel_13.setBounds(346, 201, 64, 64);
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/monitor-de-tv.png")));
		lblNewLabel_14.setBounds(475, 201, 64, 64);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/olla-arrocera.png")));
		lblNewLabel_15.setBounds(346, 336, 64, 64);
		contentPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/planchar.png")));
		lblNewLabel_16.setBounds(735, 201, 64, 64);
		contentPane.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/refrigerador.png")));
		lblNewLabel_17.setBounds(867, 336, 64, 64);
		contentPane.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/reproductor-de-dvd.png")));
		lblNewLabel_18.setBounds(604, 336, 64, 64);
		contentPane.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/secador-de-pelo.png")));
		lblNewLabel_19.setBounds(475, 336, 64, 64);
		contentPane.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/telefono-celular.png")));
		lblNewLabel_20.setBounds(79, 336, 64, 64);
		contentPane.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/ventilador.png")));
		lblNewLabel_21.setBounds(209, 336, 64, 64);
		contentPane.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img2/water-heater.png")));
		lblNewLabel_22.setBounds(604, 201, 64, 64);
		contentPane.add(lblNewLabel_22);
		
		JCheckBox cbPc = new JCheckBox("Computadora");
		cbPc.setBounds(59, 124, 97, 23);
		contentPane.add(cbPc);
		
		JCheckBox cbAire = new JCheckBox("Aire Acondicionado");
		cbAire.setBounds(179, 124, 127, 23);
		contentPane.add(cbAire);
		
		JCheckBox cbAspiradora = new JCheckBox("Aspiradora");
		cbAspiradora.setBounds(337, 124, 87, 23);
		contentPane.add(cbAspiradora);
		
		JCheckBox cbFocoA = new JCheckBox("Foco Incandescente");
		cbFocoA.setBounds(437, 124, 131, 23);
		contentPane.add(cbFocoA);
		
		JCheckBox cbFocoB = new JCheckBox("Foco LED");
		cbFocoB.setBounds(595, 124, 73, 23);
		contentPane.add(cbFocoB);
		
		JCheckBox cbFocoC = new JCheckBox("Foco Ahorrador");
		cbFocoC.setBounds(720, 124, 108, 23);
		contentPane.add(cbFocoC);
		
		JCheckBox cbDucha = new JCheckBox("Ducha Electrica");
		cbDucha.setBounds(845, 124, 108, 23);
		contentPane.add(cbDucha);
		
		JCheckBox cbCalentador = new JCheckBox("Calentador");
		cbCalentador.setBounds(59, 556, 97, 23);
		contentPane.add(cbCalentador);
		
		JCheckBox cbHervidor = new JCheckBox("Hervidor");
		cbHervidor.setBounds(59, 272, 73, 23);
		contentPane.add(cbHervidor);
		
		JCheckBox cbCocina = new JCheckBox("Cocina");
		cbCocina.setBounds(179, 272, 64, 23);
		contentPane.add(cbCocina);
		
		JCheckBox cbMicroondas = new JCheckBox("Microondas");
		cbMicroondas.setBounds(337, 272, 87, 23);
		contentPane.add(cbMicroondas);
		
		JCheckBox cbTv = new JCheckBox("Televisor");
		cbTv.setBounds(475, 272, 73, 23);
		contentPane.add(cbTv);
		
		JCheckBox cbTerma = new JCheckBox("Terma");
		cbTerma.setBounds(604, 272, 64, 23);
		contentPane.add(cbTerma);
		
		JCheckBox cbPLancha = new JCheckBox("Plancha Electrica");
		cbPLancha.setBounds(714, 272, 114, 23);
		contentPane.add(cbPLancha);
		
		JCheckBox cbLicuadora = new JCheckBox("Licuadora");
		cbLicuadora.setBounds(856, 272, 79, 23);
		contentPane.add(cbLicuadora);
		
		JCheckBox cbCelular = new JCheckBox("Carga de Celular");
		cbCelular.setBounds(59, 407, 114, 23);
		contentPane.add(cbCelular);
		
		JCheckBox cbVentilador = new JCheckBox("Ventilador");
		cbVentilador.setBounds(179, 407, 79, 23);
		contentPane.add(cbVentilador);
		
		JCheckBox cbOlla = new JCheckBox("Olla arrocera");
		cbOlla.setBounds(337, 407, 97, 23);
		contentPane.add(cbOlla);
		
		JCheckBox cbSecador = new JCheckBox("Secador");
		cbSecador.setBounds(475, 407, 73, 23);
		contentPane.add(cbSecador);
		
		JCheckBox cbDvd = new JCheckBox("Reproductor de DVD");
		cbDvd.setBounds(569, 407, 151, 35);
		contentPane.add(cbDvd);
		
		JCheckBox cbEquipo = new JCheckBox("Equipo de Musica");
		cbEquipo.setBounds(721, 407, 114, 23);
		contentPane.add(cbEquipo);
		
		JCheckBox cbRefri = new JCheckBox("Refrigerador");
		cbRefri.setBounds(856, 407, 97, 23);
		contentPane.add(cbRefri);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setEnabled(false);
		btnCalcular.setBounds(549, 550, 146, 35);
		contentPane.add(btnCalcular);
		
		JButton btnAsignarValores = new JButton("Asignar Valores");
		btnAsignarValores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					DlgAsignarValores valores = new DlgAsignarValores();
					valores.setVisible(true);
			
			
					
			if(cbPc.isSelected()) {
				
			}
	        if(cbAire.isSelected()) {
				
			}
	        if(cbAspiradora.isSelected()) {
				
			}
            if(cbFocoA.isSelected()) {
				
			}
            if(cbFocoB.isSelected()) {
				
			}
            if(cbFocoC.isSelected()) {
				
			}
            if(cbDucha.isSelected()) {
				
        	}
            if(cbCalentador.isSelected()) {
				
        	}
            if(cbHervidor.isSelected()) {
				
        	}
            if(cbCocina.isSelected()) {
				
        	}
            if(cbMicroondas.isSelected()) {
				
        	}
            if(cbTv.isSelected()) {
				
        	}
            if(cbTerma.isSelected()) {
				
        	}
            if(cbPLancha.isSelected()) {
				
        	}
            if(cbLicuadora.isSelected()) {
				
        	}
            if(cbCelular.isSelected()) {
				
        	}
            if(cbVentilador.isSelected()) {
				
        	}
            if(cbOlla.isSelected()) {
				
        	}
            if(cbSecador.isSelected()) {
				
        	}
            if(cbDvd.isSelected()) {
				
        	}
            if(cbEquipo.isSelected()) {
				
        	}
            if(cbRefri.isSelected()) {
				
        	}
	        
	        
			
				
			}
		});
		btnAsignarValores.setBounds(393, 550, 146, 35);
		contentPane.add(btnAsignarValores);
		
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem_1) {
			actionPerformedMntmNewMenuItem_1(arg0);
		}
		if (arg0.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(arg0);
		}
		if (arg0.getSource() == mntmCosto) {
			actionPerformedMntmCosto(arg0);
		}
		if (arg0.getSource() == mntmConsumo) {
			actionPerformedMntmConsumo(arg0);
		}
	}
	
	protected void actionPerformedMntmConsumo(ActionEvent arg0) {
		DlgEditarConsumo consumo = new DlgEditarConsumo();
		consumo.setVisible(true);
		consumo.setLocationRelativeTo(this);
	}
	

	protected void actionPerformedMntmCosto(ActionEvent arg0) {
		DlgCambiarCostoConsumo costo = new DlgCambiarCostoConsumo();
		costo.setVisible(true);
		costo.setLocationRelativeTo(this);
	}
	
	protected void actionPerformedMntmNewMenuItem(ActionEvent arg0) {
		DlgListar listar = new DlgListar();
		listar.setLocationRelativeTo(this);
		listar.setVisible(true);
	}
	protected void actionPerformedMntmNewMenuItem_1(ActionEvent arg0) {
		DlgGrupo grupo = new DlgGrupo();
		grupo.setLocationRelativeTo(this);
		grupo.setVisible(true);
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		dispose();
	}
	
}
