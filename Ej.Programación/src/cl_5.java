import java.util.Scanner;

public class cl_5 {
	
	static Scanner input = new Scanner(System.in);
	static boolean bucle = true;
	static int si_no;
	
	public static void repetir(){
		System.out.println("Realizar otra operacion?\n1-Si\n2-No");
		si_no = input.nextInt();
		if (si_no == 1) bucle = true; else if (si_no == 2){bucle = false; System.out.println("Hasta la proxima!");}}
	public static void main(String[] args) {
		int numero; int n1; int n2;
		
	while (bucle == true){ System.out.println("1-Suma\n2-Resta\n3-Multiplicacion\n4-Division\nIntroduzca un numero:");
		numero = input.nextInt();
			switch (numero) {
	        case 1:
	        	System.out.println("Ha elegido sumar\nIntroduzca numero 1"); n1 = input.nextInt();
	        	System.out.println("Introduzca numero 2:"); n2 = input.nextInt();
	        	System.out.println("Resultado = "+(n1+n2)); repetir();
	        case 2:
	        	System.out.println("Ha elegido restar\nIntroduzca numero 1");; n1 = input.nextInt();
	        	System.out.println("Introduzca numero 2:"); n2 = input.nextInt();
	        	System.out.println("Resultado = "+(n1-n2)); repetir();
	        case 3:
	        	System.out.println("Ha elegido multiplicar\nIntroduzca numero 1"); n1 = input.nextInt();
	        	System.out.println("Introduzca numero 2:"); n2 = input.nextInt();
	        	System.out.println("Resultado = "+(n1*n2)); repetir();
	        case 4:
	        	System.out.println("Ha elegido dividir\nIntroduzca numero 1"); n1 = input.nextInt();
	        	System.out.println("Introduzca numero 2:"); n2 = input.nextInt();
	        	System.out.println("Resultado = "+(n1/2)); repetir();
	        default:
	        	System.out.println("Introduzca un numero válido"); bucle = true;
}}}}


















