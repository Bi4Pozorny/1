package atividades;

import java.util.Scanner;

public class a8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		                /* 8) Receba o peso de uma pessoa, calcule e apresente o novo peso:
                              a. Se a pessoa engordar 15%.
                              b. Se a pessoa emagrecer 20%. */
		   
		   double kg, g15, m20;
			
		   System.out.print("peso =");
		   kg = input.nextDouble(); 
		   
		   g15 = (kg * 1.15); 
		   System.out.println("mais 15% =" + g15);
		   
		   m20 = (kg * 0.8); 
		   System.out.println("menos 20% =" + m20);
	}

}
