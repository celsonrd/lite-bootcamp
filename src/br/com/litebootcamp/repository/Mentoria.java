package br.com.litebootcamp.repository;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.litebootcamp.dominio.Conteudo;

public class Mentoria extends Conteudo {

	private String titulo;
	private String descricao;
	private LocalDate data;
	private String URL;
	private Mentor mentor;
	
	public Mentoria(String titulo, String descricao, LocalDate data, String uRL, Mentor mentor) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
		URL = uRL;
		this.mentor = mentor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public Set<Desenvolvedor> getDesenvolvedoresInscritos() {
		return desenvolvedoresInscritos;
	}

	public void setDesenvolvedoresInscritos(Set<Desenvolvedor> desenvolvedoresInscritos) {
		this.desenvolvedoresInscritos = desenvolvedoresInscritos;
	}

	private Set<Desenvolvedor> desenvolvedoresInscritos = new LinkedHashSet<>();
	
	
	@Override
	public double calculaXP() {
		// TODO Auto-generated method stub
		return XP * 2.0;
	}
	
	

}
