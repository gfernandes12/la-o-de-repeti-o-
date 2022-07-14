package br.com.generation.repeticao;

import java.util.Scanner;

public class exercicio003 {
public static void main(String[] args) {
	
	/* solicitar a idade de varias pessoas e imprimir: total de pessoas com menos 
	 * de 21 anos. total de pessoas com mais de 50 anos. O programa termina quando a idade for 
	 * = 99
	 * */
	int idade = 0; 
	int menor21 = 0;
	int maior50 = 0;
	
	Scanner entrada = new Scanner(System.in);
	
	while(idade != -99) {
		System.out.println("digite a sua idade ou -99 para terminar: ");
		idade = entrada.nextInt();
		
		if(idade < 21 && idade >= 0)
			menor21++;
		else if( idade > 50)
			maior50++;
		
	}
	
	
	System.out.println("quantidade de pessoas com menos de 21 anos: " + menor21 );
	System.out.println("quantidade de pessoas com mais de 50 anos: " + maior50);
	
	entrada.close();
	
	
}
}
