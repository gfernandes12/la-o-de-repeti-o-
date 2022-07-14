package br.com.generation.repeticao;

import java.util.Scanner;

public class exercicio005 {
public static void main(String[] args) {
	
	//exercicio 05 
	
	int numero;
	double media;
	double soma = 0;
	int contar = 0;
	
	Scanner entrada = new Scanner(System.in);
	
	do {
		System.out.println("digite um numero inteiro ou zero para sair: ");
		numero = entrada.nextInt();
		
		if(numero % 3 == 0 && numero != 0) {
			soma += numero;
			contar ++;
			}
		}while(numero != 0);
			media = soma / contar;
			System.out.println("a media dos numeros multiplos de 3: " + media);
			
			entrada.close();
	
	
	
}
}
