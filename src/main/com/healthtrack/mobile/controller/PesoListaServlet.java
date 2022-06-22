package com.healthtrack.mobile.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthtrack.mobile.model.Peso;
import com.healthtrack.DAO.PesoDAO;

@WebServlet("/listar-peso")

public class PesoListaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PesoDAO pesoDAO;
       
    public PesoListaServlet() {
        super();
        pesoDAO = new PesoDAO();
    }
    
    public void init(ServletConfig config)) throws ServletException {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final int PESSOA_SELECIONADA = 1;
		
		List<Peso> pesos;
		
		try {

			pesos = pesoDAO.getAllByPessoa(PESSOA_SELECIONADA);
			request.setAttribute("pesosUsuario", pesos);
			
			request.getRequestDispatcher("/weigth.jsp")
					.forward(request, response);
			
		} catch (SQLException e) {
			request
				.getRequestDispatcher("/erro-geral.jsp")
				.forward(request, response);
		}
		
	}

}