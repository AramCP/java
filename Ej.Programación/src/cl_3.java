import java.util.Scanner;


/*3. Programa que solicite tres números al usuario, visualizando por pantalla el mayor de los
tres, el del valor medio y el más pequeño.*/

public class cl_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("Interoduzca número 1:");
		n1 = input.nextInt();
		System.out.println("Interoduzca número 2:");
		n2 = input.nextInt();
		System.out.println("Interoduzca número 3:");
		n3 = input.nextInt();
		
		if(n1>n2 && n1>n3){
			
			if(n2>n3){
				System.out.println(n1+" es el mayor "+n2+" el mediano y "+n3+" el mas pequeño");
			}
			else if(n3>n2){
				System.out.println(n1+" es el mayor "+n3+" el mediano y "+n2+" el mas pequeño");
			}
		}
		else if(n2>n1 && n2>n3){
			
			if(n1>n3){
				System.out.println(n2+" es el mayor "+n1+" el mediano y "+n3+" el mas pequeño");
			}
			else if(n3>n1){
				System.out.println(n2+" es el mayor "+n3+" el mediano y "+n1+" el mas pequeño");
			}
		}
		else if(n3>n1 && n3>n2){
			
			if(n2>n1){
				System.out.println(n3+" es el mayor "+n2+" el mediano y "+n1+" el mas pequeño");
			}
			else if(n1>n2){
				System.out.println(n3+" es el mayor "+n1+" el mediano y "+n2+" el mas pequeño");
			}
		}
	}
}
