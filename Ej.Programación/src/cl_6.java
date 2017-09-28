import java.util.Scanner;


public class cl_6 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean bucle = true;
		int num;
		
		for (int i = 0; i < 10;) {
			
			System.out.println("Introduzca un número para ver si es par o impar");
			num = input.nextInt();
			
			if(num%2==0){
	            System.out.println(num+" es par");
	        }else{
	           System.out.println(num+" es impar");
	        }
			System.out.println("Quieres introducir otro número?\n1-Si\n2-No");
			int n1;
			n1 = input.nextInt();
			if(n1 == 1){
				i++;
			}else {
				break;
			}
	}
}
}
