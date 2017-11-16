import java.awt.EventQueue;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniProyecto {

	private JFrame frame;
	private JTextField dia;
	private JTextField mes;
	private JTextField año;
	
	int contador = 75;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniProyecto window = new MiniProyecto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiniProyecto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1154, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel pregunta1 = new JLabel("1-Eres hombre o mujer?");
		pregunta1.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		pregunta1.setForeground(new Color(0, 0, 0));
		pregunta1.setBounds(44, 217, 214, 15);
		frame.getContentPane().add(pregunta1);
		
		final JRadioButton uno_1 = new JRadioButton("Hombre");
		uno_1.setForeground(Color.RED);
		uno_1.setBounds(76, 240, 149, 23);
		uno_1.setOpaque(false);
		frame.getContentPane().add(uno_1);
		
		final JRadioButton uno_2 = new JRadioButton("Mujer");
		uno_2.setForeground(Color.RED);
		uno_2.setBounds(76, 255, 149, 23);
		uno_2.setOpaque(false);
		frame.getContentPane().add(uno_2);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(uno_1);
		bg1.add(uno_2);
		
		final JLabel Pregunta2 = new JLabel("2-Eres zurdo o diestro?");
		Pregunta2.setForeground(new Color(0, 0, 0));
		Pregunta2.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		Pregunta2.setBounds(44, 298, 214, 15);
		frame.getContentPane().add(Pregunta2);
		
		final JRadioButton dos_1 = new JRadioButton("Zurdo");
		dos_1.setOpaque(false);
		dos_1.setForeground(Color.RED);
		dos_1.setBounds(76, 321, 149, 23);
		frame.getContentPane().add(dos_1);
		
		final JRadioButton dos_2 = new JRadioButton("Diestro");
		dos_2.setOpaque(false);
		dos_2.setForeground(Color.RED);
		dos_2.setBounds(76, 336, 149, 23);
		frame.getContentPane().add(dos_2);
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(dos_1);
		bg2.add(dos_2);
		
		final JLabel Pregunta3 = new JLabel("3-Haces ejercicio?");
		Pregunta3.setForeground(new Color(0, 0, 0));
		Pregunta3.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		Pregunta3.setBounds(44, 367, 214, 15);
		frame.getContentPane().add(Pregunta3);
		
		final JRadioButton tres_1 = new JRadioButton("Entre uno y tres días a la semana");
		tres_1.setOpaque(false);
		tres_1.setForeground(Color.RED);
		tres_1.setBounds(76, 390, 277, 23);
		frame.getContentPane().add(tres_1);
		
		final JRadioButton tres_2 = new JRadioButton("Más de tres días a la semana");
		tres_2.setOpaque(false);
		tres_2.setForeground(Color.RED);
		tres_2.setBounds(76, 405, 263, 23);
		frame.getContentPane().add(tres_2);
		
		final JRadioButton tres_3 = new JRadioButton("No");
		tres_3.setOpaque(false);
		tres_3.setForeground(Color.RED);
		tres_3.setBounds(76, 417, 149, 23);
		frame.getContentPane().add(tres_3);
		
		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(tres_1);
		bg3.add(tres_2);
		bg3.add(tres_3);
		
		final JLabel Pregunta4 = new JLabel("4-Cómo vas a clase/trabajo?");
		Pregunta4.setForeground(new Color(0, 0, 0));
		Pregunta4.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		Pregunta4.setBounds(44, 448, 214, 15);
		frame.getContentPane().add(Pregunta4);
		
		final JRadioButton cuatro_1 = new JRadioButton("Caminando");
		cuatro_1.setOpaque(false);
		cuatro_1.setForeground(Color.RED);
		cuatro_1.setBounds(76, 471, 277, 23);
		frame.getContentPane().add(cuatro_1);
		
		final JRadioButton cuatro_2 = new JRadioButton("En bicicleta");
		cuatro_2.setOpaque(false);
		cuatro_2.setForeground(Color.RED);
		cuatro_2.setBounds(76, 485, 277, 23);
		frame.getContentPane().add(cuatro_2);
		
		final JRadioButton cuatro_3 = new JRadioButton("En vehículo");
		cuatro_3.setOpaque(false);
		cuatro_3.setForeground(Color.RED);
		cuatro_3.setBounds(76, 498, 277, 23);
		frame.getContentPane().add(cuatro_3);
		
		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(cuatro_1);
		bg4.add(cuatro_2);
		bg4.add(cuatro_3);
		
		final JLabel Pregunta5 = new JLabel("5-Cuantas horas sueles dormir al día?");
		Pregunta5.setForeground(new Color(0, 0, 0));
		Pregunta5.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		Pregunta5.setBounds(446, 217, 277, 15);
		frame.getContentPane().add(Pregunta5);
		
		final JRadioButton cinco_1 = new JRadioButton("Más de 8");
		cinco_1.setOpaque(false);
		cinco_1.setForeground(Color.RED);
		cinco_1.setBounds(480, 240, 149, 23);
		frame.getContentPane().add(cinco_1);
		
		final JRadioButton cinco_2 = new JRadioButton("Menos de 8");
		cinco_2.setOpaque(false);
		cinco_2.setForeground(Color.RED);
		cinco_2.setBounds(480, 255, 149, 23);
		frame.getContentPane().add(cinco_2);
		
		final JRadioButton cinco_3 = new JRadioButton("Menos de 5");
		cinco_3.setOpaque(false);
		cinco_3.setForeground(Color.RED);
		cinco_3.setBounds(480, 272, 149, 23);
		frame.getContentPane().add(cinco_3);
		
		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(cinco_1);
		bg5.add(cinco_2);
		bg5.add(cinco_3);
		
		final JLabel Pregunta6 = new JLabel("6-Como es tu peso?");
		Pregunta6.setForeground(new Color(0, 0, 0));
		Pregunta6.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		Pregunta6.setBounds(446, 303, 277, 15);
		frame.getContentPane().add(Pregunta6);
		
		String peso[] = {"Peso promedio", "Soy más delgado que el promedio", "Soy más gordo que el promedio", "Tengo sobrepeso"};
		final JComboBox comboBox = new JComboBox(peso);
		comboBox.setBounds(456, 323, 263, 19);
		frame.getContentPane().add(comboBox);
		
		final JLabel Pregunta7 = new JLabel("7-Fumas?");
		Pregunta7.setForeground(new Color(0, 0, 0));
		Pregunta7.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		Pregunta7.setBounds(446, 367, 277, 15);
		frame.getContentPane().add(Pregunta7);
		
		final JRadioButton siete_1 = new JRadioButton("No");
		siete_1.setOpaque(false);
		siete_1.setForeground(Color.RED);
		siete_1.setBounds(480, 390, 277, 23);
		frame.getContentPane().add(siete_1);
		
		final JRadioButton siete_2 = new JRadioButton("Si, mucho");
		siete_2.setOpaque(false);
		siete_2.setForeground(Color.RED);
		siete_2.setBounds(480, 405, 277, 23);
		frame.getContentPane().add(siete_2);
		
		final JRadioButton siete_3 = new JRadioButton("Si, pero poco");
		siete_3.setOpaque(false);
		siete_3.setForeground(Color.RED);
		siete_3.setBounds(480, 415, 287, 26);
		frame.getContentPane().add(siete_3);
		
		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(siete_1);
		bg7.add(siete_2);
		bg7.add(siete_3);
		
		final JLabel Pregunta8 = new JLabel("8-Sueles beber?");
		Pregunta8.setForeground(new Color(0, 0, 0));
		Pregunta8.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		Pregunta8.setBounds(446, 448, 277, 15);
		frame.getContentPane().add(Pregunta8);
		
		final JRadioButton ocho_1 = new JRadioButton("Nunca");
		ocho_1.setOpaque(false);
		ocho_1.setForeground(Color.RED);
		ocho_1.setBounds(480, 471, 277, 23);
		frame.getContentPane().add(ocho_1);
		
		final JRadioButton ocho_2 = new JRadioButton("Menos de un litro al día");
		ocho_2.setOpaque(false);
		ocho_2.setForeground(Color.RED);
		ocho_2.setBounds(480, 485, 277, 23);
		frame.getContentPane().add(ocho_2);
		
		final JRadioButton ocho_3 = new JRadioButton("Mas de un litro al día");
		ocho_3.setOpaque(false);
		ocho_3.setForeground(Color.RED);
		ocho_3.setBounds(480, 498, 277, 23);
		frame.getContentPane().add(ocho_3);
		
		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(ocho_1);
		bg8.add(ocho_2);
		bg8.add(ocho_3);
		
		final JLabel Pregunta9 = new JLabel("9-Vives estresado?");
		Pregunta9.setForeground(new Color(0, 0, 0));
		Pregunta9.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		Pregunta9.setBounds(848, 217, 277, 15);
		frame.getContentPane().add(Pregunta9);
		
		final JRadioButton nueve_1 = new JRadioButton("Si");
		nueve_1.setOpaque(false);
		nueve_1.setForeground(Color.RED);
		nueve_1.setBounds(872, 240, 149, 23);
		frame.getContentPane().add(nueve_1);
		
		final JRadioButton nueve_2 = new JRadioButton("No");
		nueve_2.setOpaque(false);
		nueve_2.setForeground(Color.RED);
		nueve_2.setBounds(872, 255, 214, 23);
		frame.getContentPane().add(nueve_2);
		
		ButtonGroup bg9 = new ButtonGroup();
		bg9.add(nueve_1);
		bg9.add(nueve_2);
		
		final JLabel Pregunta10 = new JLabel("<html><body>10-Alguno de tus familiares padece \nalguna enfermedad crónica?</body></html>");
		Pregunta10.setForeground(new Color(0, 0, 0));
		Pregunta10.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		Pregunta10.setBounds(848, 310, 277, 34);
		frame.getContentPane().add(Pregunta10);
		
		final JRadioButton diez_1 = new JRadioButton("Un familiar");
		diez_1.setOpaque(false);
		diez_1.setForeground(Color.RED);
		diez_1.setBounds(872, 352, 214, 23);
		frame.getContentPane().add(diez_1);
		
		final JRadioButton diez_2 = new JRadioButton("Dos o más familiares");
		diez_2.setOpaque(false);
		diez_2.setForeground(Color.RED);
		diez_2.setBounds(872, 367, 214, 23);
		frame.getContentPane().add(diez_2);
		
		final JRadioButton diez_3 = new JRadioButton("Ningún familiar");
		diez_3.setOpaque(false);
		diez_3.setForeground(Color.RED);
		diez_3.setBounds(872, 380, 214, 23);
		frame.getContentPane().add(diez_3);
		
		ButtonGroup bg10 = new ButtonGroup();
		bg10.add(diez_1);
		bg10.add(diez_2);
		bg10.add(diez_3);
		
		final JLabel fecha = new JLabel("-Tu fecha de nacimiento:");
		fecha.setForeground(Color.BLACK);
		fecha.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		fecha.setBounds(848, 464, 277, 15);
		frame.getContentPane().add(fecha);
		
		final JLabel diaDeTuMuerte = new JLabel("");
		diaDeTuMuerte.setForeground(Color.BLACK);
		diaDeTuMuerte.setFont(new Font("Dialog", Font.BOLD, 48));
		diaDeTuMuerte.setHorizontalAlignment(SwingConstants.CENTER);
		diaDeTuMuerte.setBounds(28, 276, 1097, 79);
		diaDeTuMuerte.setVisible(false);
		frame.getContentPane().add(diaDeTuMuerte);
		
		final JLabel fechaMuerte = new JLabel("");
		fechaMuerte.setFont(new Font("Dialog", Font.BOLD, 23));
		fechaMuerte.setForeground(Color.BLACK);
		fechaMuerte.setHorizontalAlignment(SwingConstants.CENTER);
		fechaMuerte.setBounds(44, 367, 1056, 34);
		fechaMuerte.setVisible(false);
		frame.getContentPane().add(fechaMuerte);
		
		dia = new JTextField();
		dia.setBounds(858, 489, 40, 19);
		frame.getContentPane().add(dia);
		dia.setColumns(10);
		
		mes = new JTextField();
		mes.setColumns(10);
		mes.setBounds(917, 489, 40, 19);
		frame.getContentPane().add(mes);
		
		año = new JTextField();
		año.setColumns(10);
		año.setBounds(981, 489, 40, 19);
		frame.getContentPane().add(año);
		
		final JLabel label_1 = new JLabel("/");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(872, 491, 70, 15);
		frame.getContentPane().add(label_1);
		
		final JLabel label_2 = new JLabel("/");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(935, 491, 70, 15);
		frame.getContentPane().add(label_2);
		
		final JButton boton = new JButton("New button");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1-Eres hombre o mujer?
				label_1.setVisible(false);
				label_2.setVisible(false);
				fecha.setVisible(false);
				dia.setVisible(false);
				mes.setVisible(false);
				año.setVisible(false);
				if(uno_1.isSelected()) {
					contador = contador - 5;
				}
				if(uno_2.isSelected()) {
					contador = contador + 5;
				}
				uno_1.setVisible(false);
				uno_2.setVisible(false);
				//2-Eres zurdo o diestro?
				if(dos_1.isSelected()) {
					contador = contador -3;
				}
				if(dos_2.isSelected()) {
					contador = contador +3;
				}
				dos_1.setVisible(false);
				dos_2.setVisible(false);
				//3-Haces ejercicio?
				if(tres_1.isSelected()) {
					contador = contador +5;
				}
				if(tres_2.isSelected()) {
					contador = contador +3;
				}
				if(tres_3.isSelected()) {
					contador = contador -3;
				}
				tres_1.setVisible(false);
				tres_2.setVisible(false);
				tres_3.setVisible(false);
				//4-Como vas a clase/trabajo?
				if(cuatro_1.isSelected()) {
					contador = contador;
				}
				if(cuatro_2.isSelected()) {
					contador = contador +2;
				}
				if(cuatro_3.isSelected()) {
					contador = contador -2;
				}
				cuatro_1.setVisible(false);
				cuatro_2.setVisible(false);
				cuatro_3.setVisible(false);
				//5-Cuantas horas sueles dormir al día?
				if(cinco_1.isSelected()) {
					contador = contador +1;
				}
				if(cinco_2.isSelected()) {
					contador = contador;
				}
				if(cinco_3.isSelected()) {
					contador = contador -2;
				}
				cinco_1.setVisible(false);
				cinco_2.setVisible(false);
				cinco_3.setVisible(false);
				//6-Como es tu peso?
				if(comboBox.getSelectedIndex() == 0) {
					contador = contador;
				}
				if(comboBox.getSelectedIndex() == 1) {
					contador = contador -3;
				}
				if(comboBox.getSelectedIndex() == 2) {
					contador = contador -4;
				}
				if(comboBox.getSelectedIndex() == 3) {
					contador = contador -10;
				}
				comboBox.setVisible(false);
				//7-Fumas?
				if(siete_1.isSelected()) {
					contador = contador +5;
				}
				if(siete_2.isSelected()) {
					contador = contador -6;
				}
				if(siete_3.isSelected()) {
					contador = contador -2;
				}
				siete_1.setVisible(false);
				siete_2.setVisible(false);
				siete_3.setVisible(false);
				//8-Sueles beber?
				if(ocho_1.isSelected()) {
					contador = contador +3;
				}
				if(ocho_2.isSelected()) {
					contador = contador;
				}
				if(ocho_3.isSelected()) {
					contador = contador -3;
				}
				ocho_1.setVisible(false);
				ocho_2.setVisible(false);
				ocho_3.setVisible(false);
				//9-Vives estresado?
				if(nueve_1.isSelected()) {
					contador = contador -3;
				}
				if(nueve_2.isSelected()) {
					contador = contador +3;
				}
				nueve_1.setVisible(false);
				nueve_2.setVisible(false);
				//10-Alguno de tus familiares padece alguna enfermedad crónica?
				if(diez_1.isSelected()) {
					contador = contador -6;
				}
				if(diez_2.isSelected()) {
					contador = contador - 12;
				}
				if(diez_3.isSelected()) {
					contador = contador +5;
				}
				diez_1.setVisible(false);
				diez_2.setVisible(false);
				diez_3.setVisible(false);
				
				pregunta1.setVisible(false);
				Pregunta2.setVisible(false);
				Pregunta3.setVisible(false);
				Pregunta4.setVisible(false);
				Pregunta5.setVisible(false);
				Pregunta6.setVisible(false);
				Pregunta7.setVisible(false);
				Pregunta8.setVisible(false);
				Pregunta9.setVisible(false);
				Pregunta10.setVisible(false);
				System.out.println(contador);
				
				String añoString = año.getText();
				int añoInt = Integer.parseInt(añoString);
				añoInt = añoInt + contador;
				int aleatorioDia = (int)(Math.random()*28+1);
				int aleatorioMes = (int)(Math.random()*12+1);
				fechaMuerte.setText("A la edad de "+contador+" años");
				fechaMuerte.setVisible(true);
				diaDeTuMuerte.setText("Vas a morir  el dia "+aleatorioDia+"/"+aleatorioMes+"/"+añoInt);
				diaDeTuMuerte.setVisible(true);
			}
		});
		boton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				boton.setIcon(new ImageIcon("/home/arastr/Escritorio/muerte/boton2.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				boton.setIcon(new ImageIcon("/home/arastr/Escritorio/muerte/boton1.png"));
			}
		});
		boton.setIcon(new ImageIcon("/home/arastr/Escritorio/muerte/boton1.png"));
		boton.setBounds(477, 583, 220, 67);
		frame.getContentPane().add(boton);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon("/home/arastr/Escritorio/muerte/imagen.jpg"));
		fondo.setBounds(0, 0, 1152, 662);
		frame.getContentPane().add(fondo);
		
		
	}
}







