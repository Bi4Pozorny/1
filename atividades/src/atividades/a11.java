package atividades;

import java.util.Scanner;

public class a11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
                        /* 11) Calcule e mostre a tabuada de multiplicação de um número informado pelo usuário no
                               teclado. Exemplo: Informe um número: 7
                               7 x 0 = 0
                               7 x 1 = 7
                               7 x 2 = 14
                               7 x 3 = 21
                               7 x 4 = 28
                               7 x 5 = 35
                               7 x 6 = 42
                               7 x 7 = 49
                               7 x 8 = 56
                               7 x 9 = 63
                               7 x 10 = 70 */

	      System.out.print("numero =");
	      int num = input.nextInt();

	      for (int i = 1; i <= 10; i++) {
	         System.out.println(num + " x " + i + " = " + (num * i));
	     }
	}  
}
