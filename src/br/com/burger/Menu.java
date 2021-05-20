package br.com.burger;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "S";
		int opcaoDoMenu;
				
		do { 
			System.out.println("---MENU---");
			System.out.println("1) Tabuada com Do While");
			System.out.println("2) Tabuada com For");
			System.out.println("3) Editar");
			System.out.println("4) Excluir");
			System.out.println("5) Sair");
			System.out.println("----------");
		System.out.print("Informe a opção desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			switch(opcaoDoMenu) { 
			case 1: 
				System.out.println("---TABUADA--WHILE---");
				int valor; 
				int multiplicador = 0;
				
				System.out.print("Infrome um valor inteiro: ");
				valor = tec.nextInt();
				
				do { 
					System.out.println(valor + " X " + multiplicador + " = " + (valor * multiplicador)); multiplicador++;
				} while(multiplicador <=10);
				
				break;
				
			case 2:
				System.out.println("---TABUADA--FOR---");
				int valor1; 
				System.out.print("Informe um valor: ");
				valor1 = tec.nextInt();
				
				for(int g = 0; g <= 10; g++) {
					System.out.println(valor1 + " X " + g + " = " + (valor1 * g));
				}
				break;
				
			case 3:
				System.out.println("---EDITAR---");
				break;
				
			case 4:
				System.out.println("---EXCLUIR---");
				break;
				
			case 5:
				opcao = "n";
				break;
				
			
				
			default:
				System.out.println("Opção Inválida.");
				break;
				
			}
			

			
			
		} while(opcao.equalsIgnoreCase("S"));
				
		System.out.println("Sistema finalizado");
	}

}
