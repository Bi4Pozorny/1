package atividades;

import java.util.Scanner;

public class a5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		                /* 5) Calcule e apresente a área de um losango. As diagonais maior e menor do losango
                              devem ser informadas pelo usuário. OBS: AREA = (DIAGONAL MAIOR * DIAGONAL MENOR) / 2.*/
		
		   double dmax, dmin, result;
			
		   System.out.print("diagonal maior =");
		   dmax = input.nextDouble(); 
		   
		   System.out.print("diagonal menor =");
		   dmin = input.nextDouble(); 
		   
		   result = (dmax * dmin) / 2;
		   System.out.println("area =" + result);	
	}

}
