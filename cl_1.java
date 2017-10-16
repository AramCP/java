package paquete;

import java.util.Scanner;

public class cl_1 {
	
	public static void main (String args []) {
		Scanner input = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Dime una frase:");
		frase = input.nextLine();
		System.out.println("Palabras:");
		//Separa las palabras de la frase cuando encuentra un espacio
		String arrayPalabras[] = frase.split(" "); 
		
		//Bucle que se ejecuta hasta que el numero de palabra sea superior a la longitud del array
		for(int nPalabra=0; nPalabra<arrayPalabras.length; nPalabra++) {
			System.out.println(arrayPalabras[nPalabra]);
		}
	}
}
