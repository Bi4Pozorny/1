package atividades;

import java.util.Scanner;

public class a3 {
	
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		                /* 3) Receba a cotação do dólar em reais e um valor que o usuário possui em dólares.
		                     Imprima este valor em reais. */
		
		   double dollar, result;
		
		   System.out.print("$ em R$ =");
		   dollar = input.nextDouble(); 
		   
		   result = (dollar * 5.24);
		   System.out.println(result);
    }	         
}
