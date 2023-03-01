package br.com.litebootcamp.main;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import br.com.litebootcamp.repository.Bootcamp;
import br.com.litebootcamp.repository.Curso;
import br.com.litebootcamp.repository.Desenvolvedor;
import br.com.litebootcamp.repository.Mentor;
import br.com.litebootcamp.repository.Mentoria;

public class main {

	public static void main(String[] args) {
		
		//Criar mentor
		Mentor MentorPOO = new Mentor("Joao da Silva", "Linguagem de programacao");
		Mentor MentorSQL = new Mentor("jose da Silva", "Banco de dados");
		
		//Criar curso
		Set<Curso> cursos = new HashSet<>();
		cursos.add(new Curso("POO com java", "Curso teorico de poo", 10, 20));
		cursos.add(new Curso("POO com Python", "Curso teorico de python", 10, 20));
		cursos.add(new Curso("POO com java", "Curso teorico de Javascript", 10, 20));
		
		//Criar mentoria
		Set<Mentoria> mentorias = new HashSet<>();
		mentorias.add(new Mentoria("Mentoria POO", "Aprender POO", LocalDate.now() , "https://link.para.mentoria.com", MentorPOO));
		mentorias.add(new Mentoria("SQL", "Aprender SQL", LocalDate.now() , "https://link.para.mentoria.com", MentorSQL));
		
		//Criar bootcamp
		Bootcamp bt = new Bootcamp("Orangetech", "java intermediario", "Inter", "back end", cursos, mentorias);
		
		//Criar Dev
		Desenvolvedor dev = new Desenvolvedor("Steve Woznik", "steve@steve.com");
				
		dev.inscreverBootcamp(bt);
		
	}

}
