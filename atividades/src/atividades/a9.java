package atividades;

import java.util.Scanner;

public class a9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		                /* 9) Receba os valores dos dois catetos de um triângulo, calcule e apresente o valor da
                              hipotenusa. OBS - Teorema de Pitágoras: a
                              2 = b2 + c2.*/
		
		   double cat1, cat2, result;
			
		   System.out.print("1 cateto =");
		   cat1 = input.nextDouble(); 
		   
		   System.out.print("2 cateto =");
		   cat2 = input.nextDouble(); 
		      
		   result = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		   System.out.println("todos salarios min =" + result);				
	}

}
