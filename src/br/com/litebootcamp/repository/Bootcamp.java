package br.com.litebootcamp.repository;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.litebootcamp.dominio.Conteudo;

public class Bootcamp extends Conteudo {

	private String nome;
	private String descricao;
	private String patrocinador;
	private String area;
	private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
	
	private Set<Desenvolvedor> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	
	public Bootcamp(String nome, String descricao, String patrocinador, String area) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.patrocinador = patrocinador;
		this.area = area;
	}
	



	public Set<Conteudo> getConteudos() {
		return conteudos;
	}




	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}




	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public String getPatrocinador() {
		return patrocinador;
	}
	
	
	
	
	
	@Override
	public double calculaXP() {
	
		return XP * 1.5;
	}

}
