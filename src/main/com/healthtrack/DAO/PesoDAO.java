package com.healthtrack.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.healthtrack.mobile.model.Peso;
import com.healthtrack.mobile.model.Usuario;
import com.healthtrack.mobile.controller.PesoListaServlet;

public class PesoDAO {

	private static ConnectionManager connectionManager;
	
	public PesoDAO() {
		connectionManager = ConnectionManager.getInstance(); 
	}

	public List<Peso> getAllByPessoa(int idPessoa) throws SQLException {
		
		List<Peso> pesos = new ArrayList<>();
		
		try {
			
			String sql = "SELECT * FROM t_htk_peso WHERE t_pessoa_cd_conta = " + String.valueOf(idPessoa) + " ORDER BY dt_registro DESC";
			PreparedStatement stmt = connectionManager.getConnection().prepareStatement(sql);
			stmt.setInt(1, idPessoa);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Peso peso = new Peso();
				peso.setCodigo(rs.getInt("cd_peso"));
				peso.setIdUsuario(rs.getInt("cd_usuario"));
				peso.setPeso(rs.getDouble("nr_peso"));
				peso.setDataRegistro(rs.getDate("dt_registro"));
				pesos.add(peso);
			}
			
		} catch (SQLException e) {
			throw new SQLException(e);
		} finally {
			connectionManager.closeConnection();
		}
		
		return pesos;
		
	}
	
	
}