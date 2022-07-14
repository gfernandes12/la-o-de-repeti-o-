package br.com.generation.repeticao;

import java.util.Scanner;

public class exercicio002 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int number, odd = 0, even = 0;
	
	for(int i = 0; i < 10; i++) {
		System.out.println("digite um numero inteiro positivo: ");
		number = input.nextInt();
		
		if(number%2 == 0)
			even++;
		else 
			odd++;
		
		
	}
	
	System.out.println("quantidade de numeros pares digitados: " + even);
	System.out.println("quantidade de numeros impares digitados: " + odd);
	
	input.close();
	
		
	}
	
}

