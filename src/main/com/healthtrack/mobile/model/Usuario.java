package com.healthtrack.mobile.model;

import java.util.Date;
import java.util.ArrayList;

/**
 * Classe de usuário
 * @author Diego Tenório
 * @version 1.0
 */
public class Usuario {

	/**
	 * Nome do usuário
	 */
	private String nome;

	/**
	 * Email do usuário
	 */
	private String email;

	/**
	 * Sexo do usuário
	 */
	private char sexo;

	/**
	 * Data de nascimento do usuário
	 */
	private Date dataNascimento;

	/**
	 * Data de registro do usuário
	 */
	private Date dataRegistro;

	/**
	 * Altura do usuário
	 */
	private float altura;

	/**
	 * Histórico de Peso do usuário
	 */
	private ArrayList<Peso> pesoList = new ArrayList<Peso>();

	/**
	 * Histórico de Treino do usuário
	 */
	private ArrayList<Treino> treinoList = new ArrayList<Treino>();
	
	/**
	 * Construtor padrão
	 */
	public Usuario () {
	}

	/**
	 * @param nome - nome do usuário
	 * @param email - email do usuário
	 * @param sexo - sexo do usuário
	 * @param dataNascimento - data de nascimento do usuário
	 * @param dataRegistro - data de registro do usuário
	 * @param altura - altura do usuário
	 */
	public Usuario(
		String nome,
		String email,
		char sexo,
		Date dataNascimento,
		Date dataRegistro,
		float altura
	) {
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.dataRegistro = dataRegistro;
		this.altura = altura;
	}

	/**
	 * @return Retorna nome do usuário
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome - nome do usuário
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return Retorna email do usuário
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email - email do usuário
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return Retorna sexo do usuário
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo - sexo do usuário
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return Retorna data de nascimento do usuário
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento - data de nascimento do usuário
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return Retorna data de registro do usuário
	 */
	public Date getDataRegistro() {
		return dataRegistro;
	}

	/**
	 * @param dataRegistro - data de registro do usuário
	 */
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	/**
	 * @return Retorna altura do usuário
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura - altura do usuário
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * @return Retorna lista de peso do usuário
	 */
	public ArrayList<Peso> getPesoList() {
		return pesoList;
	}

	/**
	 * @param pesoList - lista de peso do usuário
	 */
	public void setPesoList(ArrayList<Peso> pesoList) {
		this.pesoList = pesoList;
	}

	/** 
	 * @return Retorna lista de treino do usuário
	 */		
	public ArrayList<Treino> getTreinoList() {
		return treinoList;
	}

	/**
	 * @param treinoList - lista de treino do usuário
	 */
	public void setTreinoList(ArrayList<Treino> treinoList) {
		this.treinoList = treinoList;
	}

}
