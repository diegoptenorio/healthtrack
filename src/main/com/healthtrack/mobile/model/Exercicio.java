package com.healthtrack.mobile.model;

/**
 * Class de exercícios do treino
 * @author Diego Tenório
 * @version 1.0
 */
public class Exercicio {
	
	/**
	 * Nome do exercício
	 */
	private String nome;
	
	/**
	 * Quantas séries
	 */
	private int series;
	
	/**
	 * Quantas repetições
	 */
	private int repeticoes;
	
	/**
	 * Qual a intensidade
	 */
	private int intensidade;
	
	/**
	 * Qual medida da intensidade
	 */
	private String medida;
	
	/**
	 * Construtor padrão
	 */
	public Exercicio() {
	}
	
	/**
	 * @param nome - nome do exercício
	 * @param series - quantidade de séries do exercício
	 * @param repeticoes - quantidade de repetições
	 * @param intensidade - intensidade do exercício
	 * @param medida - medida de intensidade
	 */
	public Exercicio(
		String nome,
		int series,
		int repeticoes,
		int intensidade,
		String medida
	) {
		this.nome = nome;
		this.series = series;
		this.repeticoes = repeticoes;
		this.intensidade = intensidade;
		this.medida = medida;
	}

	/**
	 * @return Retorna o nome do exercício
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome - nome do exercício
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return Retorna a quantidade de séries
	 */
	public int getSeries() {
		return series;
	}

	/**
	 * @param series - quantidade de séries do exercício
	 */
	public void setSeries(int series) {
		this.series = series;
	}

	/**
	 * @return Retorna a quantidade de repetições
	 */
	public int getRepeticoes() {
		return repeticoes;
	}

	/**
	 * @param repeticoes - quantidade de repetições
	 */
	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}

	/**
	 * @return Retorna a intensidade
	 */
	public int getIntensidade() {
		return intensidade;
	}

	/**
	 * @param intensidade - intensidade do exercício
	 */
	public void setIntensidade(int intensidade) {
		this.intensidade = intensidade;
	}

	/**
	 * @return Retorna a medida de intensidade
	 */
	public String getMedida() {
		return medida;
	}

	/**
	 * @param medida - medida de intensidade
	 */
	public void setMedida(String medida) {
		this.medida = medida;
	}
	
	

}
