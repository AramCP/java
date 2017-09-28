import java.util.Scanner;

public class ahorcado {
	
	static Scanner input = new Scanner(System.in);
	
	static String cabeza = "0";
	static String cuerpo = "|";
	static String mano_izq = "/";
	static String mano_der = "\\";
	static String pie_izq = "/";
	static String pie_der = "\\";
	
	static String casilla1 = "_";
	static String casilla2 = "_";
	static String casilla3 = "_";
	static String casilla4 = "_";
	static String casilla5 = "_";
	
	static String letra;
	
	static String s = "                 ";
	
	public static void limpiarpantalla(){
		System.out.print("\033\143");
		System.out.println("---------------AHORCADO---------------\n");
	}
	
	public static void monigote(){
		
		System.out.println(s+" "+cabeza);
		System.out.println(s+mano_izq+cuerpo+mano_der);
		System.out.println(s+pie_izq+" "+pie_der+"\n");
		
	}
	
	public static void palabra(){
		String palabra;
		
		final String letra1 = "c";
		final String letra2 = "0";
		final String letra3 = "c";
		final String letra4 = "h";
		final String letra5 = "e";
		
		palabra = ("              "+casilla1+" "+casilla2+" "+casilla3+" "+casilla4+" "+casilla5+"\n");
		System.out.println(palabra);
		
	}
	
	public static void inicio(){
		
		for(;;){
			System.out.println("Introduce una letra:");
			letra = input.next();
			if (letra.equals("c")){
				casilla1 = "C";
				casilla3 = "C";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("o")){
				casilla2 = "O";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("h")){
				casilla4 = "H";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("e")){
				casilla5 = "E";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else {
				pie_izq = " ";
				limpiarpantalla();
				monigote();
				palabra();
				break;
				}
				
			}
		}
	
	public static void sin_pie_izq(){
		for(;;){
			System.out.println("Introduce una letra:");
			letra = input.next();
			if (letra.equals("c")){
				casilla1 = "C";
				casilla3 = "C";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("o")){
				casilla2 = "O";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("h")){
				casilla4 = "H";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("e")){
				casilla5 = "E";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else {
				pie_der = " ";
				limpiarpantalla();
				monigote();
				palabra();
				break;
			}
		}
	}
	
	public static void sin_pie_der(){
		for(;;){
			System.out.println("Introduce una letra:");
			letra = input.next();
			if (letra.equals("c")){
				casilla1 = "C";
				casilla3 = "C";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("o")){
				casilla2 = "O";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("h")){
				casilla4 = "H";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("e")){
				casilla5 = "E";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else {
				mano_izq = " ";
				limpiarpantalla();
				monigote();
				palabra();
				break;
			}
		}
	}
	
	public static void sin_mano_izq(){
		for(;;){
			System.out.println("Introduce una letra:");
			letra = input.next();
			if (letra.equals("c")){
				casilla1 = "C";
				casilla3 = "C";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("o")){
				casilla2 = "O";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("h")){
				casilla4 = "H";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("e")){
				casilla5 = "E";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else {
				mano_der = " ";
				limpiarpantalla();
				monigote();
				palabra();
				break;
			}
		}
	}
	
	public static void sin_mano_der(){
		for(;;){
			System.out.println("Introduce una letra:");
			letra = input.next();
			if (letra.equals("c")){
				casilla1 = "C";
				casilla3 = "C";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("o")){
				casilla2 = "O";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("h")){
				casilla4 = "H";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("e")){
				casilla5 = "E";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else {
				cuerpo = " ";
				limpiarpantalla();
				monigote();
				palabra();
				break;
			}
		}
	}
	
	public static void sin_cuerpo(){
		for(;;){
			System.out.println("Introduce una letra:");
			letra = input.next();
			if (letra.equals("c")){
				casilla1 = "C";
				casilla3 = "C";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("o")){
				casilla2 = "O";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("h")){
				casilla4 = "H";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else if (letra.equals("e")){
				casilla5 = "E";
				limpiarpantalla();
				monigote();
				palabra();
			}
			else {
				cabeza = " ";
				limpiarpantalla();
				monigote();
				palabra();
				break;
			}
		}
	}
	
	public static void sin_cabeza(){
		System.out.println("Has perdido");
	}
		
	

	public static void main(String[] args) {
		System.out.print("\033\143");
        System.out.println("---------------AHORCADO---------------\n");
        monigote();
        palabra();
        inicio();
        sin_pie_izq();
        sin_pie_der();
        sin_mano_izq();
        sin_mano_der();
        sin_cuerpo();
        sin_cabeza();

	}

}
