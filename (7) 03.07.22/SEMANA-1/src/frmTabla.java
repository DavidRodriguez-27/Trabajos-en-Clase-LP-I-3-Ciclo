import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//import com.sun.tools.javac.code.TypeTag.NumericClasses;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmTabla {

	private JFrame frame;
	private JTable table;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTabla window = new frmTabla();
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
	public frmTabla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 25, 404, 142);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"JUGADOR", "CATEGORIA", "PUNTAJE"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Jugador");
		lblNewLabel.setBounds(32, 184, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(32, 226, 45, 13);
		frame.getContentPane().add(lblCategoria);
		
		JLabel lblNewLabel_1_1 = new JLabel("Puntaje");
		lblNewLabel_1_1.setBounds(32, 269, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txt1 = new JTextField();
		txt1.setBounds(28, 203, 96, 19);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(29, 245, 96, 19);
		frame.getContentPane().add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(30, 287, 96, 19);
		frame.getContentPane().add(txt3);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numCols = table.getModel().getColumnCount();
				Object [] fila = new Object[numCols];
				fila[0] = "CR7";
				fila[1] = "CHAMPIONS";
				fila[2] = "100";
				((DefaultTableModel) table.getModel()).addRow(fila);
			}
		});
		btnRegistrar.setBounds(197, 202, 85, 21);
		frame.getContentPane().add(btnRegistrar);
		
		JButton btnRegistrar2 = new JButton("Registrar 2");
		btnRegistrar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numCols = table.getModel().getColumnCount();
				Object [] fila= new Object[numCols];
				fila[0] = txt1.getText();
				fila[1] = txt2.getText();
				fila[2] = txt3.getText();
				((DefaultTableModel) table.getModel()).addRow(fila);
			}
		});
		btnRegistrar2.setBounds(197, 244, 85, 21);
		frame.getContentPane().add(btnRegistrar2);
	}
}
