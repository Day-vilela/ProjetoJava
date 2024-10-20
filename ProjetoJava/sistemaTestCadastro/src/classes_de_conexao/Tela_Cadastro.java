package classes_de_conexao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;

public class Tela_Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeProduto;
	private JTextField tfCodProduto;
	private JTextField tfValorCompra;
	private JTextField tfMarca;
	private JTextField tfDescricao;
	private JTextField tfQuantidade;
	private JTextField tfFornecedor;
	private JTextField tfValorVenda;
	private JTextField tfCategoria;
	private JTextField tfID;
	private JTextField tfAbrirbusca;
	private JTable tbDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastro frame = new Tela_Cadastro();
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
	public Tela_Cadastro() {
		setResizable(false);
		setTitle("Cadastro ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 360);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Produto");
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 109, 14);
		contentPane.add(lblNewLabel);
		
		tfNomeProduto = new JTextField();
		tfNomeProduto.setForeground(Color.DARK_GRAY);
		tfNomeProduto.setBackground(Color.LIGHT_GRAY);
		tfNomeProduto.setBounds(129, 8, 133, 20);
		contentPane.add(tfNomeProduto);
		tfNomeProduto.setColumns(10);
		
		JLabel lblCdigoProduto = new JLabel("Código Produto");
		lblCdigoProduto.setForeground(Color.WHITE);
		lblCdigoProduto.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblCdigoProduto.setBounds(10, 36, 109, 14);
		contentPane.add(lblCdigoProduto);
		
		JLabel lblValorDaCompra = new JLabel("Valor da Compra");
		lblValorDaCompra.setForeground(Color.WHITE);
		lblValorDaCompra.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblValorDaCompra.setBounds(10, 61, 109, 14);
		contentPane.add(lblValorDaCompra);
		
		JLabel lblNewLabel_2_1 = new JLabel("Marca");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(473, 11, 109, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Quantidade");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(272, 11, 95, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Fornecedor");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblNewLabel_2_3.setBounds(272, 36, 95, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Valor da Venda");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblNewLabel_2_4.setBounds(272, 61, 95, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Categoria");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblNewLabel_2_5.setBounds(473, 36, 95, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Descrição");
		lblNewLabel_2_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_5_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblNewLabel_2_5_1.setBounds(10, 86, 109, 14);
		contentPane.add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_2_5_2 = new JLabel("ID");
		lblNewLabel_2_5_2.setForeground(Color.WHITE);
		lblNewLabel_2_5_2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 13));
		lblNewLabel_2_5_2.setBounds(473, 61, 24, 14);
		contentPane.add(lblNewLabel_2_5_2);
		
		tfCodProduto = new JTextField();
		tfCodProduto.setForeground(Color.DARK_GRAY);
		tfCodProduto.setColumns(10);
		tfCodProduto.setBackground(Color.LIGHT_GRAY);
		tfCodProduto.setBounds(129, 33, 133, 20);
		contentPane.add(tfCodProduto);
		
		tfValorCompra = new JTextField();
		tfValorCompra.setForeground(Color.DARK_GRAY);
		tfValorCompra.setColumns(10);
		tfValorCompra.setBackground(Color.LIGHT_GRAY);
		tfValorCompra.setBounds(129, 58, 133, 20);
		contentPane.add(tfValorCompra);
		
		tfMarca = new JTextField();
		tfMarca.setForeground(Color.DARK_GRAY);
		tfMarca.setColumns(10);
		tfMarca.setBackground(Color.LIGHT_GRAY);
		tfMarca.setBounds(592, 8, 86, 20);
		contentPane.add(tfMarca);
		
		tfDescricao = new JTextField();
		tfDescricao.setForeground(Color.DARK_GRAY);
		tfDescricao.setColumns(10);
		tfDescricao.setBackground(Color.LIGHT_GRAY);
		tfDescricao.setBounds(129, 86, 549, 20);
		contentPane.add(tfDescricao);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setForeground(Color.DARK_GRAY);
		tfQuantidade.setColumns(10);
		tfQuantidade.setBackground(Color.LIGHT_GRAY);
		tfQuantidade.setBounds(377, 8, 86, 20);
		contentPane.add(tfQuantidade);
		
		tfFornecedor = new JTextField();
		tfFornecedor.setForeground(Color.DARK_GRAY);
		tfFornecedor.setColumns(10);
		tfFornecedor.setBackground(Color.LIGHT_GRAY);
		tfFornecedor.setBounds(377, 33, 86, 20);
		contentPane.add(tfFornecedor);
		
		tfValorVenda = new JTextField();
		tfValorVenda.setForeground(Color.DARK_GRAY);
		tfValorVenda.setColumns(10);
		tfValorVenda.setBackground(Color.LIGHT_GRAY);
		tfValorVenda.setBounds(377, 58, 86, 20);
		contentPane.add(tfValorVenda);
		
		tfCategoria = new JTextField();
		tfCategoria.setForeground(Color.DARK_GRAY);
		tfCategoria.setColumns(10);
		tfCategoria.setBackground(Color.LIGHT_GRAY);
		tfCategoria.setBounds(592, 33, 86, 20);
		contentPane.add(tfCategoria);
		
		tfID = new JTextField();
		tfID.setEditable(false);
		tfID.setForeground(Color.DARK_GRAY);
		tfID.setColumns(10);
		tfID.setBackground(Color.LIGHT_GRAY);
		tfID.setBounds(592, 58, 86, 20);
		contentPane.add(tfID);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 117, 334, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //CADASTRO===========================================================================
				
					if (tfNomeProduto.getText().equals(" ") || tfCodProduto.getText().equals(" ") || tfValorCompra.getText().equals(" ") ||  
							tfMarca.getText().equals(" ") || tfDescricao.getText().equals("") || tfCategoria.getText().equals(" ") || tfFornecedor.getText().equals(" ")
							|| tfValorVenda.getText().equals(" ")) {
						
						JOptionPane.showMessageDialog(null, "É necessário preencher todos os campos.");
						
					} else {
				
				try {
					
					Connection con = Conexao.faz_conexao();
					
					// Verifica se o produto já existe
		            String checkSql = "SELECT COUNT(*) FROM dados_produtos WHERE codigo_produto = ?";
		            PreparedStatement checkStmt = con.prepareStatement(checkSql);
		            checkStmt.setInt(1, Integer.parseInt(tfCodProduto.getText().trim()));
		            ResultSet rs = checkStmt.executeQuery();
		            rs.next();
		            int count = rs.getInt(1);
		            rs.close();
		            checkStmt.close();
		            
		            if (count > 0) {
		                JOptionPane.showMessageDialog(null, "Produto já cadastrado.");
		                return;
		            }
					
		            //INSERIR NOVO PRODUTO
					String sql = "insert into dados_produtos(nome_produto, codigo_produto, valor_compra, marca, descricao, quantidade, fornecedor, valor_venda, categoria) value (?, ?, ?, ?, ?, ?, ?, ?, ?)";
					 PreparedStatement stmt = con.prepareStatement(sql);
					 
					 stmt.setString(1, tfNomeProduto.getText());
					 if (!tfCodProduto.getText().trim().isEmpty()) {
				            stmt.setInt(2, Integer.parseInt(tfCodProduto.getText().trim()));
				        } else {
				            JOptionPane.showMessageDialog(null, "O campo Código do Produto não pode estar vazio.");
				            return;
				        }
				        
				        if (!tfValorCompra.getText().trim().isEmpty()) {
				            stmt.setDouble(3, Double.parseDouble(tfValorCompra.getText().trim()));
				        } else {
				            JOptionPane.showMessageDialog(null, "O campo Valor de Compra não pode estar vazio.");
				            return;
				        }
				        
				        stmt.setString(4, tfMarca.getText());
				        stmt.setString(5, tfDescricao.getText());
				        
				        if (!tfQuantidade.getText().trim().isEmpty()) {
				            stmt.setInt(6, Integer.parseInt(tfQuantidade.getText().trim()));
				        } else {
				            JOptionPane.showMessageDialog(null, "O campo Quantidade não pode estar vazio.");
				            return;
				        }
				        
				        stmt.setString(7, tfFornecedor.getText());
				        
				        if (!tfValorVenda.getText().trim().isEmpty()) {
				            stmt.setDouble(8, Double.parseDouble(tfValorVenda.getText().trim()));
				        } else {
				            JOptionPane.showMessageDialog(null, "O campo Valor de Venda não pode estar vazio.");
				            return;
				        }
				        
				        stmt.setString(9, tfCategoria.getText());
				        

					 
					 stmt.execute();
					 
					 stmt.close();
					 con.close();
					 
					JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
					
					tfNomeProduto.setText(" ");
					tfCodProduto.setText(" ");
					tfValorCompra.setText("");
					tfMarca.setText("");
					tfDescricao.setText("");
					tfQuantidade.setText("");
					tfFornecedor.setText("");
					tfValorVenda.setText("");
					tfCategoria.setText("");
					 
				} catch (Exception e1) {
					e1.printStackTrace();
				    JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto: " + e1.getMessage());
				}
				
				
			}
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnNewButton.setBounds(10, 11, 95, 23);
		panel.add(btnNewButton);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //ATUALIZAR============================================================================
				
				if(tfID.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null,"Informe o id.");
					
				}else {
					
					
				try {
					Connection con = Conexao.faz_conexao();
					
					String sql = "update dados_produtos set nome_produto=?, codigo_produto=?, valor_compra=?, marca=?, descricao=?, quantidade=?, fornecedor=?, valor_venda=?, categoria=? where id=?";
					
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, tfNomeProduto.getText());
					
					 	if (!tfCodProduto.getText().trim().isEmpty()) {
				            stmt.setInt(2, Integer.parseInt(tfCodProduto.getText().trim()));
				        } else {
				            JOptionPane.showMessageDialog(null, "O campo Código do Produto não pode estar vazio.");
				            return;
				        }
				        
				        if (!tfValorCompra.getText().trim().isEmpty()) {
				            stmt.setDouble(3, Double.parseDouble(tfValorCompra.getText().trim()));
				        } else {
				            JOptionPane.showMessageDialog(null, "O campo Valor de Compra não pode estar vazio.");
				            return;
				        }
				        
				     stmt.setString(4, tfMarca.getText());
				     stmt.setString(5, tfDescricao.getText());
				        
				        if (!tfQuantidade.getText().trim().isEmpty()) {
				            stmt.setInt(6, Integer.parseInt(tfQuantidade.getText().trim()));
				        } else {
				            JOptionPane.showMessageDialog(null, "O campo Quantidade não pode estar vazio.");
				            return;
				        }
				        
				     stmt.setString(7, tfFornecedor.getText());
				        
				        if (!tfValorVenda.getText().trim().isEmpty()) {
				            stmt.setDouble(8, Double.parseDouble(tfValorVenda.getText().trim()));
				        } else {
				            JOptionPane.showMessageDialog(null, "O campo Valor de Venda não pode estar vazio.");
				            return;
				        }
				        
				     stmt.setString(9, tfCategoria.getText());
				     stmt.setString(10, tfID.getText());
				     
				     stmt.execute();
				     stmt.close();
				     con.close();
				     
				     JOptionPane.showMessageDialog(null, "Atualização concluida!");
				     
				     	tfID.setText("");
				     	tfNomeProduto.setText(" ");
						tfCodProduto.setText(" ");
						tfValorCompra.setText("");
						tfMarca.setText("");
						tfDescricao.setText("");
						tfQuantidade.setText("");
						tfFornecedor.setText("");
						tfValorVenda.setText("");
						tfCategoria.setText("");
				     
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
				
				
				
			}
		});
		btnAtualizar.setForeground(Color.DARK_GRAY);
		btnAtualizar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnAtualizar.setBackground(Color.GRAY);
		btnAtualizar.setBounds(126, 11, 89, 23);
		panel.add(btnAtualizar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//EXCLUIR ITEM==================================================================================
				// AQUI VERIFICA SE HA CAMPO PREENCHIDO PARA SER EXCLUIDO.
				
				if(tfID.getText().equals(" ")) {
					
					JOptionPane.showMessageDialog(null, "Informe o ID");
					
				}else {
				
				try {
					Connection con = Conexao.faz_conexao();
					
					String sql = "delete from fados_produtos where id=?";
					
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, tfID.getText());
					
					
					//EXECUTANDO E FECHANDO CONEXÃO
					stmt.execute();
					stmt.close();
					con.close();
					
					JOptionPane.showMessageDialog(null, "Item Excluido!");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}	
			}
		});
		btnExcluir.setForeground(Color.DARK_GRAY);
		btnExcluir.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		btnExcluir.setBackground(Color.GRAY);
		btnExcluir.setBounds(235, 11, 89, 23);
		panel.add(btnExcluir);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(354, 117, 324, 46);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Abrir");
		btnNewButton_1.setBounds(10, 11, 89, 23);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//ABRIR=========================================================================================================
				
				if (tfAbrirbusca.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Informe o ID");
					
				} else {
				
				
				try {
					
					Connection con = Conexao.faz_conexao();
					
					String sql = "select *from dados_produtos where id like ?";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, "%"+tfAbrirbusca.getText());

					ResultSet rs = stmt.executeQuery();
					
					while (rs.next()) {
						 
						tfID.setText(rs.getString("ID"));
						tfNomeProduto.setText(rs.getString("nome_produto"));
				        tfCodProduto.setText(String.valueOf(rs.getInt("codigo_produto"))); // Corrigido de "codigo_protudo"
				        tfValorCompra.setText(String.valueOf(rs.getDouble("valor_compra")));
				        tfMarca.setText(rs.getString("marca"));
				        tfQuantidade.setText(String.valueOf(rs.getInt("quantidade")));
				        tfFornecedor.setText(rs.getString("fornecedor"));
				        tfValorVenda.setText(String.valueOf(rs.getDouble("valor_venda")));
				        tfDescricao.setText(rs.getString("descricao"));
				        tfCategoria.setText(rs.getString("categoria"));
						
					}
					
					rs.close();
					con.close();
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}				
				}
			}
		});
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		
		tfAbrirbusca = new JTextField();
		tfAbrirbusca.setBounds(109, 11, 82, 22);
		panel_1.add(tfAbrirbusca);
		tfAbrirbusca.setBackground(Color.LIGHT_GRAY);
		tfAbrirbusca.setColumns(10);
		
		JButton btListar = new JButton("Listar Dados");
		btListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//LISTAR ITENS=======================================================================================================
				
				try {
					Connection con = Conexao.faz_conexao();//REALIZAANDO CONEXÇÃO
					
					String sql =  "select *from dados_produtos"; //STRING DE BUSCA COMANDO PARA O SQL
					
					PreparedStatement stmt = con.prepareStatement(sql);// PREPARANDO AS INFORMAÇÕES QUE SERAM ENVIADAS PARA O BANCO DE DADOS
					
					ResultSet rs = stmt.executeQuery();//CONSULTA AO BANCO DE DADOS
					
					DefaultTableModel modelo = (DefaultTableModel) tbDados.getModel();
					modelo.setNumRows(0);
					
					while (rs.next()) { // ENQUANTO TIVER DADOS 
						
						modelo.addRow(new Object[]{rs.getString("id"), rs.getString("nome_produto"), rs.getString("codigo_produto"), rs.getString("Valor_compra"),
								rs.getString("marca"), rs.getString("descricao"), rs.getString("quantidade"), rs.getString("fornecedor"), rs.getString("valor_venda"), 
								rs.getString("categoria")});
						
					}
					
					rs.close();
					con.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btListar.setForeground(Color.DARK_GRAY);
		btListar.setBackground(Color.GRAY);
		btListar.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btListar.setBounds(201, 11, 113, 23);
		panel_1.add(btListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 170, 668, 140);
		contentPane.add(scrollPane);
		
		tbDados = new JTable();
		tbDados.setForeground(Color.DARK_GRAY);
		tbDados.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 11));
		tbDados.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tbDados.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nome do Produto", "C\u00F3digo do Produto", "Valor da Compra", "Marca", "Descri\u00E7\u00E3o", "Quantidade", "Fornecedor", "Valor da Venda", "Categoria"
			}
		));
		tbDados.getColumnModel().getColumn(0).setPreferredWidth(37);
		tbDados.getColumnModel().getColumn(1).setPreferredWidth(96);
		tbDados.getColumnModel().getColumn(2).setPreferredWidth(55);
		tbDados.getColumnModel().getColumn(3).setPreferredWidth(56);
		tbDados.getColumnModel().getColumn(4).setPreferredWidth(51);
		tbDados.getColumnModel().getColumn(5).setPreferredWidth(135);
		tbDados.getColumnModel().getColumn(6).setPreferredWidth(31);
		tbDados.getColumnModel().getColumn(8).setPreferredWidth(47);
		tbDados.getColumnModel().getColumn(9).setPreferredWidth(38);
		scrollPane.setViewportView(tbDados);
	}
}
