package br.com.holz;

import java.util.Scanner;

public class AtividadeLogica {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		String continuar = "s";
		int opcaoDoMenu;
		
		do {	
			System.out.println("|-----------Menu-----------|");
			System.out.println("|1 - Verificar Sexo e Idade|");
			System.out.println("|2 - Contagem de Valores   |");
			System.out.println("|3 - Tabuada               |");
			System.out.println("|4 - Cadastrar Cursos      |");
			System.out.println("|--------------------------|");
			System.out.println("\n");
			System.out.print("Informe a opção desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			System.out.println("\n");
			
			switch(opcaoDoMenu) {
			case 1:
				System.out.println("---- Verificar Sexo e Idade ----");
				String nome;
				int anoDeNascimento;
				String sexo;
				int idade;
				
				System.out.print("Informe seu nome: ");
				nome = tec.next();
				System.out.print("Informe seu ano de nascimento: ");
				anoDeNascimento = tec.nextInt();
				System.out.print("Informe seu sexo [M/F]: ");
				sexo = tec.next();
				idade = 2021 - anoDeNascimento;
				
				System.out.println("\n");
				
				if(idade < 12) {
					System.out.println(nome+ ", você ainda é uma criança, tem " +idade+ " anos de idade");
				}
				else if (idade >= 12 && idade < 18) {
					System.out.println(nome+ ", você é jovem, tem " +idade+ " anos de idade");
				}
				else if (idade >= 18 && idade < 65) {
					System.out.println(nome+ ", você já é adulto, tem " +idade+ " anos de idade");
				}
				else {
					System.out.println(nome+ ", você já é um idoso, tem " +idade+ " anos de idade");
				}
				
				if(sexo.equalsIgnoreCase("m")) {
					System.out.println("É do sexo masculino");
				}
				else if (sexo.equalsIgnoreCase("f")) {
					System.out.println("É do sexo feminino");
				}
				else {
					System.out.println("Opção Inválida!!!");
				}
				
				if(idade < 16) {
					System.out.println("Você ainda não pode votar");
				}
				else if(idade >= 16 && idade < 18 || idade > 70) {
					System.out.println("Você pode votar, mas não é obrigatório");
				}
				else {
					System.out.println("Seu voto é obrigatório!!");
				}
				
				if(idade < 18) {
					System.out.println("E você ainda não pode tirar habilitação");
				}
				else {
					System.out.println("E você já pode tirar habilitação");
				}
				break;
				
			case 2:
				System.out.println("---- Contagem de Valores ----");
				int primeiroValor;
				int segundoValor;
				
				System.out.print("Informe o primeiro valor: ");
				primeiroValor = tec.nextInt();
				System.out.print("Informe o segundo valor: ");
				segundoValor = tec.nextInt();
				
				if(primeiroValor == segundoValor) {
					System.out.println("Valor igual ao primeiro, impossível imprimir a sequência");
				}
			    if(primeiroValor > segundoValor) {
			      while(segundoValor <= primeiroValor) {
			    	  System.out.println(segundoValor);
			          	segundoValor += 1;}
			     }
			      
			    else if(segundoValor > primeiroValor) {
			    	while(primeiroValor <= segundoValor) {
			    		System.out.println(primeiroValor);
			                primeiroValor += 1;
			            }
			      }
				break;
				
			case 3:
				
				System.out.println("---- Tabuada ----");
				break;
				
			case 4:
				System.out.println("---- Cadastrar Cursos ----");
				break;
				
				default:
					System.out.println("Opção Inválida.");
				break;
			}
		System.out.println("\n");
		System.out.print("Deseja realizar uma nova operação? [S/N] -> ");
		continuar = tec.next();
		System.out.println("\n");
		} while(continuar.equalsIgnoreCase("s"));
		
		System.out.println("Sistema Encerrado!!!");
	}
}