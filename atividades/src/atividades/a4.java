package atividades;

import java.util.Scanner;

public class a4 {
	
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		                
		                /* 4) Faça um programa que receba o salário de um funcionário, calcule e mostre o novo
                              salário, sabendo-se que ele sofreu um aumento de 25%.*/
		    
		   double sal, result;
		
		   System.out.print("salario =");
		   sal = input.nextDouble(); 
		   
		   result = (sal / 4 + sal);
		   System.out.println(result);	
    }
}
