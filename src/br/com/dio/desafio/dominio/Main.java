package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();

		curso1.setTitulo("Português");
		curso1.setDescricao("Conjugação de verbo");
		curso1.setCargaHoraria(15);

		curso2.setTitulo("Matemática");
		curso2.setDescricao("Lógica básica");
		curso2.setCargaHoraria(20);

		mentoria.setTitulo("Mentoria");
		mentoria.setDescricao("Descrevendo");
		mentoria.setData(LocalDate.now());

	
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Objetivo te ajudar a ser um programador Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devCledson = new Dev();
		devCledson.setNome("Cledson");		
		devCledson.inscreverBootcamp(bootcamp);
				
		System.out.println("Conteúdos inscritos Cledson = " + devCledson.getConteudosInscritos());
		devCledson.progredir();
		devCledson.progredir();
		System.out.println("----------");
		System.out.println("Conteúdos inscritos Cledson = " + devCledson.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Cledson = " + devCledson.getConteudosConsluidos());
		System.out.println("Xp: " + devCledson.calcularXp());
		System.out.println("---------------------------------");
		
		Dev devEster = new Dev();
		devEster.setNome("Ester");
		devEster.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Ester = " + devCledson.getConteudosInscritos());
		devEster.progredir();
		System.out.println("Conteúdos inscritos Ester = " + devCledson.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Ester = " + devCledson.getConteudosConsluidos());
		System.out.println("Xp: " + devEster.calcularXp());
	}
}
