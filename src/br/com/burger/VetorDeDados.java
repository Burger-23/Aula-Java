package br.com.burger;

import java.util.Scanner;

public class VetorDeDados{
	private static Scanner tec;

	public static void main(String[] args) {
		
		tec = new Scanner(System.in);
		int idade [] = {5, 18, 16, 21, 20, 4, 28, 32}; 
		
		for(int i = 0; i < idade.length; i++) {
		System.out.println(idade[i]);
	
		}
		
		String addNovo = "S";
		do {
			System.out.print("Informe o Index do Vetor: ");
			for (int i = 0; i < idade.length; i++ ) {
				System.out.print(i + " | ");
			
			}System.out.print("-> ");
			int index = tec.nextInt();
			
			System.out.print("Informe a idade: ");
			idade[index] = tec.nextInt();
			
		System.out.print("Deseja informar uma nova iadade? [S/N]: ");	
		addNovo = tec.next();
		} while(addNovo.equals("S"));
		
		int aux;
		for(int i = 0; i < idade.length - 1; i++) {
			for(int j = i +1; j < idade.length; j++) {
				if(idade[i] > idade[j]) {
		            aux = idade[i];
		            idade[i] = idade[j];
		            idade[j] = aux;
				}
			}
		}
			System.out.println("---VETOR--ORDENADO---");
		for(int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}
	}
}
			
			

				







			
	
			           
			    
	