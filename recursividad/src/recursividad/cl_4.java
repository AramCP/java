
//2-Aplicando la recursividad indirecta o cruzada, realiza un programa que determine si un
//número es positivo o negativo.

package recursividad;

import java.util.Scanner;

public class cl_4 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x = 0;
		int n1;
		
		n1=positivo(x);
		
		if(n1>0) {
			System.out.println("Es positivo");
		}else {
			System.out.println("Es negativo");
		}
		
	}
	
	static int positivo(int x) {
		
		
		x = input.nextInt();
		
		if(x>0){
			return 1;
		}else {
			return(negativo(x));
		}
	}
	
	static int negativo(int x) {
		
		if(x<0){
			return 0;
		}else {
			return(positivo(x));
		}	
	}
	
	
	
	

}
