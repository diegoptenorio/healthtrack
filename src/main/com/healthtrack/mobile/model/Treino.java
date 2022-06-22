package com.healthtrack.mobile.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classo de treino
 * @author Diego Tenório
 * @version 1.0
 */
public class Treino {
	
	/**
	 * Nome do treino
	 */
	private String nome;
	
	/**
	 * Data de registro do treino
	 */
	private Date dataRegistro;

	/**
	 * Lista de exercícios realizados no treino
	 */
	private ArrayList<Exercicio> exercicioList = new ArrayList<Exercicio>();
	
	/**
	 * Construtor padrão
	 */
	public Treino() {
	}
	
	/**
	 * @param nome - nome do treino
	 * @param dataRegistro - data de registro do treino
	 */
	public Treino(String nome, Date dataRegistro) {
		this.nome = nome;
		this.dataRegistro = dataRegistro;
	}

	/**
	 * @return Retorna nome do treino
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome - nome do treino
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return Retorna data de registro
	 */
	public Date getDataRegistro() {
		return dataRegistro;
	}

	/**
	 * @param dataRegistro - data de registro do treino
	 */
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	/**
	 * @return Retorna lista de exercícios do treino
	 */
	public ArrayList<Exercicio> getExercicioList() {
		return exercicioList;
	}

	/**
	 * @param exercicioList - lista de exercícios do treino
	 */
	public void setExercicioList(ArrayList<Exercicio> exercicioList) {
		this.exercicioList = exercicioList;
	}

}
