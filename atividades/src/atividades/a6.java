package atividades;

import java.util.Scanner;

public class a6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		                /* 6) Receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit.
                              OBS: F = (C * 1,8) + 32.*/
		
		   double с, result;
			
		   System.out.print("Celsium =");
		   с = input.nextDouble(); 
		      
		   result = (с * 1.8) + 32;
		   System.out.println("Farhengeit =" + result);			
		

	}

}
