package recursividad;

import java.util.Scanner;

public class cl_5 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x = 0;
		int n1;
		
		n1=par(x);
		
		if(n1>0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}

	}
	
	static int par(int x) {
		x = input.nextInt();
		
		if(x%2==0){
			return 1;
		}else {
			return(impar(x));
		}
	}
	
	static int impar(int x) {
		if(x%2!=0){
			return 0;
		}else {
			return(par(x));
		}	
	}

}
