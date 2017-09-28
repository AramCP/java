import java.util.Scanner;


public class cl_7 {
	
	public static void main(String[] args) {
		
		int r;
		int h;
		String again;
		Scanner input = new Scanner(System.in);
		
		int numero;
			
		System.out.println("1-Cuadrado");
		System.out.println("2-Triangulo");
		System.out.println("3-Circulo");
		System.out.println("4-Cilindro");
		System.out.println("5-Cono");

		
	for(;;){
		
			System.out.println("Introduce un numero entre 1 y 5:");
			numero = input.nextInt();
			
			if(numero == 1){
				int a;
				System.out.println("Area del cuadrado: a²");
				System.out.println("Longitud de arista:");
				a = input.nextInt();
				System.out.println("Area del cuadrado: "+a+"² = "+(a*a));
				
				System.out.println("Calcular otra vez? si/no");
				again = input.next();
				if(again.equals("si")){}
				else if(again.equals("no")){
					System.out.println("¡Hasta la próxima!");
					break;
				}  else {
					System.out.println(again+" No es una operación válida");
				}
			}
			
			else if(numero == 2){
				int b;
				System.out.println("Area del triangulo: base * altura / 2");
				System.out.println("Introduzca la base:");
				b = input.nextInt();
				System.out.println("Introduzca la altura:");
				h = input.nextInt();
				System.out.println("Area del triangulo: "+b+"*"+h+"/2 = "+((b*h)/2));
				
				System.out.println("Calcular otra vez? si/no");
				again = input.next();
				if(again.equals("si")){}
				else if(again.equals("no")){
					System.out.println("¡Hasta la próxima!");
					break;
				}  else {
					System.out.println(again+" No es una operación válida");
				}
			}
			
			else if(numero == 3){
				System.out.println("Area del circulo: π*R²");
				System.out.println("Introduzca el radio:");
				r = input.nextInt();
				System.out.println("Area del circulo: π*"+r+"² = "+(3.14*(r*r)));
				
				System.out.println("Calcular otra vez? si/no");
				again = input.next();
				if(again.equals("si")){}
				else if(again.equals("no")){
					System.out.println("¡Hasta la próxima!");
					break;
				}  else {
					System.out.println(again+" No es una operación válida");
				}
			}
			
			else if(numero == 4){
	
				System.out.println("Area del cilindro: 2*π*r*(h+r)");
				System.out.println("Introduzca el radio:");
				r = input.nextInt();
				System.out.println("Introduzca la altura:");
				h = input.nextInt();
				System.out.println("Area del cilindro: "+(2*3.14*r*(h+r)));
				
				System.out.println("Calcular otra vez? si/no");
				again = input.next();
				if(again.equals("si")){}
				else if(again.equals("no")){
					System.out.println("¡Hasta la próxima!");
					break;
				}  else {
					System.out.println(again+" No es una operación válida");
				}
			}
					
			else if(numero == 5){
				int g;
				System.out.println("Area del cono: π*r*(g+r)");
				System.out.println("Introduzca el radio:");
				r = input.nextInt();
				System.out.println("Introduzca la generatriz:");
				g = input.nextInt();
				System.out.println("Area del cono: "+(3.14*r*(g+r)));
				
				System.out.println("Calcular otra vez? si/no");
				again = input.next();
				if(again.equals("si")){}
				else if(again.equals("no")){
					System.out.println("¡Hasta la próxima!");
					break;
				}  else {
					System.out.println(again+" No es una operación válida");
				}
			}
			
			else {
				
				System.out.println(numero +" no es un número válido");

			}
		}
	}		
}

