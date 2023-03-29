package atividades;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		                 /* 2) Receba o ano de nascimento de uma pessoa, o ano atual e imprima:
                              a. A idade da pessoa no ano atual.
                              b. A idade que a pessoa terá em 2050. */
		
		   int ano1, ano2, result1, result2;
		
		   System.out.print("nascimento =");
		   ano1 = input.nextInt(); 
		   
		   result1 = (2023 - ano1);
		   System.out.println("em 2023 =" + result1);
		   
		   result2 = (2050 - ano1);
		   System.out.println("em 2050 =" + result2); 

	}

}
