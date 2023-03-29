package atividades;

import java.util.Scanner;

public class a7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		                /* 7) Receba o valor do salário mínimo e o valor do salário de um funcionário. O algoritmo
                              deve calcular e apresentar a quantidade de salários mínimos que esse funcionário recebe.*/
		
		   int min, sal, result;
			
		   System.out.print("salario min =");
		   min = input.nextInt(); 
		   
		   System.out.print("salario =");
		   sal = input.nextInt(); 
		      
		   result = (sal / min);
		   System.out.println("todos salarios min =" + result);			
	}

}
