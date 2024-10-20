package classes_de_conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection faz_conexao() throws SQLException {
		
		//TRATAMENTO DE ERROS DE CONEXÃO
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://localhost/db_produtos","root","");
				
			
		} catch (ClassNotFoundException e) {
			
			throw new SQLException(e.getException());

		
		}
		
	}

}
