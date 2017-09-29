import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JToolBar;

public class Frame1 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton button;
	private JButton btnBotn;
	static boolean luz = true;

//Inicia la aplicacion.

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Crea la aplicacion.
	
	public Frame1() {
		initialize();
	}


//Inicializa el contenido de la ventana.

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 255, 255));
		frame.getContentPane().setFont(new Font("Impact", Font.PLAIN, 11));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 660, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton boton = new JButton("Bot\u00F3n 1");
		boton.setBackground(new Color(230, 230, 250));
		boton.setFont(new Font("Arial", Font.BOLD, 15));
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.getContentPane().setBackground(new Color(255, 122, 190));
			}
		});
		boton.setBounds(10, 99, 171, 41);
		frame.getContentPane().add(boton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(20, 163, 161, 41);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("BOTONES QUE HACEN COSAS");
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(185, 11, 481, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		button = new JButton("Bot\u00F3n 2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Alejandro maricón");
			}
		});
		button.setFont(new Font("Arial", Font.BOLD, 15));
		button.setBackground(new Color(230, 230, 250));
		button.setBounds(237, 99, 171, 41);
		frame.getContentPane().add(button);
		
		btnBotn = new JButton("Bot\u00F3n 3");
		btnBotn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_2.setIcon(new ImageIcon("src/pene.png"));
			}
		});
		btnBotn.setFont(new Font("Arial", Font.BOLD, 15));
		btnBotn.setBackground(new Color(230, 230, 250));
		btnBotn.setBounds(463, 99, 171, 41);
		frame.getContentPane().add(btnBotn);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(57, 165, 292, 219);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
