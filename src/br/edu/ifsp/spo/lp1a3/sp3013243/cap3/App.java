package br.edu.ifsp.spo.lp1a3.sp3013243.cap3;

import java.util.Scanner;

public class App {

	
	
	public static void main(String[] args) {
		
		
		
		String nome;
		String sobrenome;
		int dia;
		int mes;
		int ano;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Aplicativo de cálculo de frequência cardíaca");

	       	System.out.println("\nQual o seu nome: ");
	       	nome = sc.next();
	       	
	       	
	        System.out.println("\nQual o seu sobrenome: ");
	        sobrenome = sc.next();

	        System.out.println("\nDigite o dia de seu nascimento: ");
	        dia = sc.nextInt();
	        
	        
	        System.out.println("\nDigite o mes de seu nascimento: ");
	        mes = sc.nextInt();
	        
	        
	        System.out.println("\nDigite o ano de seu nascimento: ");
	        ano = sc.nextInt();

	        HeartRates obj = new HeartRates (nome, sobrenome, dia, mes, ano);
		
	        
	       idade = obj.calcularIdade(ano);
	       obj.setFreq (obj.calcularFrequencia(idade));

	        System.out.println("\n FICHA");
	        System.out.printf("\nNome: %s %s", obj.getNome(), obj.getSobrenome() );
	        System.out.printf("\nData de nascimento: %d/%d/%d", obj.getDia(), obj.getMes(), obj.getAno());
	        System.out.printf("\nIdade: %d", idade);
	        System.out.printf("\nFrequência cardíaca máxima: %f", obj.calcularFrequencia(idade));
	        System.out.printf("\nA frequência cardíaca deve estar entre %f e %f\n", obj.mediaFreqMenor(obj.getFreq()), obj.mediaFreqMaior(obj.getFreq()));
	}
	
	
	
	
}
