package br.com.litebootcamp.repository;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.litebootcamp.dominio.Conteudo;

public class Desenvolvedor extends Pessoa{
	
	   private String nome;
	   private String email;
	   
	   private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	   private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	   
	   
	   public double calculaXP() {
		   return 0D;
	   }
	   
	   public void inscreverBootcamp(Bootcamp bootcamp) {
		   
	   }
	   
	   
	

}
