package atividades;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class a10 {

	public static void main(String[] args) {	  
		
		Scanner input = new Scanner(System.in);
		
		                /* 10) Receba o raio, calcule e apresente:
                               a. O comprimento de uma esfera: C = 2 * π * R.
                               b. A área de uma esfera: A = π * R2
                               c. O volume de uma esfera: V = 3⁄4 * π * R3 */

		    double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da esfera:"));
	        
	        double comprimento = 2 * Math.PI * raio;
	        
	        double area = Math.PI * Math.pow(raio, 2);
	        
	        double volume = (3.0/4.0) * Math.PI * Math.pow(raio, 3);
	        
	        JOptionPane.showMessageDialog(null, "Comprimento da esfera: " + comprimento +
	                                            "\nÁrea da esfera: " + area +
	                                            "\nVolume da esfera: " + volume);
		  
	}

}
