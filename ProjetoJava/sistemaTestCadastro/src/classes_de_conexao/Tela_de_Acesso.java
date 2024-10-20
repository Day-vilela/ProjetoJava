package classes_de_conexao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Tela_de_Acesso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfusuario;
	private JPasswordField pfsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_de_Acesso frame = new Tela_de_Acesso();
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
	public Tela_de_Acesso() {
		setResizable(false);
		setTitle("Tela de Acesso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 241);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 16));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(25, 35, 98, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setToolTipText("");
		lblSenha.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 16));
		lblSenha.setBounds(25, 71, 98, 25);
		contentPane.add(lblSenha);
		
		tfusuario = new JTextField();
		tfusuario.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 14));
		tfusuario.setBounds(103, 37, 153, 20);
		contentPane.add(tfusuario);
		tfusuario.setColumns(10);
		
		pfsenha = new JPasswordField();
		pfsenha.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		pfsenha.setBounds(103, 73, 153, 20);
		contentPane.add(pfsenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Connection con = Conexao.faz_conexao();
					
					String sql = "select *from dados_senha where usuario=? and senha=?";
					
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, tfusuario.getText());
					stmt.setString(2, new String(pfsenha.getPassword()));
					
					ResultSet rs = stmt.executeQuery();
					
					if (rs.next()) {
						
						 Tela_Cadastro exibir = new Tela_Cadastro();
						 exibir.setVisible(true);
						 setVisible(false);
						
					} else {
						
						JOptionPane.showMessageDialog(null, "Esse usuario não existe.");
						
					}
					
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(137, 104, 89, 23);
		contentPane.add(btnNewButton);
	}
}
