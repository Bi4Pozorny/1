package atividades;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		                // 1) Receba três notas, calcule e apresente a média aritmética delas.//
		
		   int num1, num2, num3, result;
		   
		   System.out.print("numero 1 =");
		   num1 = input.nextInt();
		   
		   System.out.print("numero 2 =");
		   num2 = input.nextInt();
		   
		   System.out.print("numero 3 =");
		   num3 = input.nextInt();
		   
		   result = (num1 + num2 + num3) / 3;
		   System.out.println(result);		   	   
	}

}