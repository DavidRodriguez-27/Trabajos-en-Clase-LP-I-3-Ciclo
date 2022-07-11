import java.awt.EventQueue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frm1 {

	private JFrame frame;
	private JTextField txt_codigo;
	private JTextField txt_usuario;
	private JTextField txt_contrasena;
	private JTextField txt_nombre;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txt_apellido;
	private JTextField txt_edad;
	private JTextField txt_pais;
	private JTable table;
	private Connection conexion;
	DefaultTableModel dfm = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	
	private void Mostrar_grid() {
		try {
			int filas = table.getRowCount();
      for (int i = 0;filas>i; i++) {
        dfm.removeRow(0);
      }
			final String consulta = "SELECT * FROM REGISTRO";
			ResultSet rs = null;
			Statement sentencia = conexion.createStatement();
			rs = sentencia.executeQuery(consulta);			

			while(rs.next())
				dfm.addRow(new Object[] {rs.getString("ID"),rs.getString("USUARIO"),rs.getString("CONTRASENA"),rs.getString("NOMBRE"),
						rs.getString("APELLIDO"),rs.getString("EDAD"),rs.getString("PAIS")});
		}catch(Exception e){
			e.getStackTrace();
			JOptionPane.showMessageDialog(null,"Error al mostrar desde BD");}
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm1 window = new frm1();
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
	public frm1() {
		initialize();
		try {
			//conexion = DriverManager.getConnection("jdbc:mysql://localhost: 3306/usuarios_login", "root","mysql");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/usuarios_login?useTimezOne=true&serverTimezone=UTC", "root","MiSQLDR");
			table = this.table;
			dfm.setColumnIdentifiers(new Object[] {"ID", "USUARIO", "CONTRASENA", "NOMBRE", "APELLIDO", "EDAD", "PAIS"});
			Mostrar_grid();
		  }catch(Exception e) {
			  e.getStackTrace();
			  JOptionPane.showMessageDialog(null, "Error al conectar a BD");		  
			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(37, 34, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(38, 60, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1_1.setBounds(37, 90, 61, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1_1.setBounds(37, 119, 61, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		txt_codigo = new JTextField();
		txt_codigo.setBounds(108, 31, 96, 19);
		frame.getContentPane().add(txt_codigo);
		txt_codigo.setColumns(10);
		
		txt_usuario = new JTextField();
		txt_usuario.setColumns(10);
		txt_usuario.setBounds(108, 59, 96, 19);
		frame.getContentPane().add(txt_usuario);
		
		txt_contrasena = new JTextField();
		txt_contrasena.setColumns(10);
		txt_contrasena.setBounds(108, 89, 96, 19);
		frame.getContentPane().add(txt_contrasena);
		
		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(108, 116, 96, 19);
		frame.getContentPane().add(txt_nombre);
		
		lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(231, 65, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Edad");
		lblNewLabel_3.setBounds(231, 90, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Pais");
		lblNewLabel_4.setBounds(231, 119, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		txt_apellido = new JTextField();
		txt_apellido.setColumns(10);
		txt_apellido.setBounds(286, 60, 96, 19);
		frame.getContentPane().add(txt_apellido);
		
		txt_edad = new JTextField();
		txt_edad.setColumns(10);
		txt_edad.setBounds(286, 87, 96, 19);
		frame.getContentPane().add(txt_edad);
		
		txt_pais = new JTextField();
		txt_pais.setColumns(10);
		txt_pais.setBounds(286, 116, 96, 19);
		frame.getContentPane().add(txt_pais);
		
		JButton button = new JButton("INSERTAR");
		button.setBounds(416, 60, 104, 21);
		frame.getContentPane().add(button);
		
		JButton button1 = new JButton("ACTUALIZAR");
		button1.setBounds(418, 91, 102, 21);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("ELIMINAR");
		button2.setBounds(419, 120, 101, 21);
		frame.getContentPane().add(button2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 170, 497, 138);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
