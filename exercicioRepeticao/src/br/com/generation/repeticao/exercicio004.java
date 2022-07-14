package br.com.generation.repeticao;

import java.util.Scanner;

public class exercicio004 {
public static void main(String[] args) {
	
	//exercicio 004 criar um programa que leia um numero da maquina
	//ate que seja igual a zero. No final, mostre sua soma 
	int soma = 0;
	int numero;
	
	Scanner entrada = new Scanner(System.in);
	

	
	
	do {
		System.out.println("digite um numero inteiro: ");
		numero = entrada.nextInt();
		
		soma += numero;
	}while(numero != 0);
	
	System.out.println("a soma dos numeros digitados é: " + soma);
	entrada.close();
	
		
		
		
		
		
	
	
}
}
