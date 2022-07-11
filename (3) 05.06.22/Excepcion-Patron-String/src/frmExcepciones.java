import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmExcepciones extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtRpta;
	private JTextField txtNum;
	private JTextField txtCaracter;
	private JTextField txtObs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmExcepciones frame = new frmExcepciones();
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
	public frmExcepciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(57, 61, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(187, 61, 96, 19);
		contentPane.add(txt2);
		
		txtRpta = new JTextField();
		txtRpta.setColumns(10);
		txtRpta.setBounds(414, 61, 96, 19);
		contentPane.add(txtRpta);
		
		txtNum = new JTextField();
		txtNum.setColumns(10);
		txtNum.setBounds(187, 169, 96, 19);
		contentPane.add(txtNum);
		
		txtCaracter = new JTextField();
		txtCaracter.setColumns(10);
		txtCaracter.setBounds(414, 169, 96, 19);
		contentPane.add(txtCaracter);
		
		txtObs = new JTextField();
		txtObs.setBounds(57, 113, 453, 19);
		contentPane.add(txtObs);
		txtObs.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					int a,b,r;
					a = Integer.parseInt(txt1.getText());
					b = Integer.parseInt(txt2.getText());
					r = a/b;
					txtRpta.setText(String.valueOf(r));
				}
				catch(ArithmeticException ex) {
					txtObs.setText("Division por cero");
				}	
				catch (NumberFormatException ex) {
					txtObs.setText("Se esperaba que ingrese un entero");
				}
				catch (Exception ex) {
					txtObs.setText("Verifique sus datos de entrada");
				}
				finally {
					txtObs.setText(txtObs.getText() + "- Que tenga un buen dia");
				}
				
			}
		});
		btnCalcular.setBounds(305, 60, 85, 21);
		contentPane.add(btnCalcular);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String[] palabra= {"C","O","N","S","T","A","N","T","I","N","O","P","L","A"};
					int n = Integer.parseInt(txtNum.getText());
					txtCaracter.setText(palabra[n-1]);
				}
				catch(IndexOutOfBoundsException ex) {
					txtObs.setText("No hay ese numero de caracteres");
				}
				catch (Exception ex) {
					txtObs.setText(txtObs.getText()+ " Ingrese un valor valido");
				}
				finally {
					txtObs.setText(txtObs.getText() + " - Que tenga un buen dia");
				}
			}
		});
		btnMostrar.setBounds(305, 168, 85, 21);
		contentPane.add(btnMostrar);
		
		JLabel lblNewLabel = new JLabel("1er numero");
		lblNewLabel.setBounds(60, 43, 65, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lbldoNumero = new JLabel("2do numero");
		lbldoNumero.setBounds(187, 43, 65, 13);
		contentPane.add(lbldoNumero);
		
		JLabel lblDivision = new JLabel("division");
		lblDivision.setBounds(415, 43, 65, 13);
		contentPane.add(lblDivision);
		
		JLabel lblObservaciones = new JLabel("observaciones");
		lblObservaciones.setBounds(57, 90, 65, 13);
		contentPane.add(lblObservaciones);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(187, 153, 65, 13);
		contentPane.add(lblNumero);
		
		JLabel lblCaracter = new JLabel("Caracter");
		lblCaracter.setBounds(415, 153, 65, 13);
		contentPane.add(lblCaracter);
		
		JLabel lblConstatinopla = new JLabel("Constatinopla");
		lblConstatinopla.setBounds(75, 169, 65, 16);
		contentPane.add(lblConstatinopla);
	}
}
