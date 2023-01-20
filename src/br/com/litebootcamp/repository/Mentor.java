package br.com.litebootcamp.repository;

public class Mentor extends Pessoa{
	
	private String nome;
	private String area;
	
	
	public Mentor(String nome, String area) {
		super();
		this.nome = nome;
		this.area = area;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
	
	

}
