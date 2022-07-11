import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cliente {

	private JFrame frmFormularioDeClientes;
	private JTextField txtCodigo;
	private JTextField txtDni;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtTelf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cliente window = new cliente();
					window.frmFormularioDeClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormularioDeClientes = new JFrame();
		frmFormularioDeClientes.setTitle("FORMULARIO DE CLIENTES");
		frmFormularioDeClientes.setBounds(100, 100, 301, 362);
		frmFormularioDeClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormularioDeClientes.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(37, 35, 45, 13);
		frmFormularioDeClientes.getContentPane().add(lblNewLabel);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(37, 74, 45, 13);
		frmFormularioDeClientes.getContentPane().add(lblDni);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1.setBounds(37, 111, 45, 13);
		frmFormularioDeClientes.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombres");
		lblNewLabel_1_1_1.setBounds(37, 146, 45, 13);
		frmFormularioDeClientes.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Telefono");
		lblNewLabel_1_1_1_1.setBounds(37, 192, 45, 13);
		frmFormularioDeClientes.getContentPane().add(lblNewLabel_1_1_1_1);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(101, 32, 96, 19);
		frmFormularioDeClientes.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(101, 71, 96, 19);
		frmFormularioDeClientes.getContentPane().add(txtDni);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(101, 108, 96, 19);
		frmFormularioDeClientes.getContentPane().add(txtApellidos);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(101, 143, 96, 19);
		frmFormularioDeClientes.getContentPane().add(txtNombres);
		
		txtTelf = new JTextField();
		txtTelf.setColumns(10);
		txtTelf.setBounds(101, 189, 96, 19);
		frmFormularioDeClientes.getContentPane().add(txtTelf);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni,nom,ape,telf,cod;
				dni = txtDni.getText();
				ape = txtApellidos.getText();
				nom = txtNombres.getText();
				telf = txtTelf.getText();
				cod = dni.substring(0,3) + ape.substring(ape.length()-2,ape.length()) + nom.substring(2,4) + telf.substring(1,2) + telf.substring(6,7);
				txtCodigo.setText(cod);
			}
		});
		btnProcesar.setBounds(101, 248, 85, 21);
		frmFormularioDeClientes.getContentPane().add(btnProcesar);
	}
}
