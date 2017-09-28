import java.util.Scanner;



public class cl_4 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	int numero;
        System.out.println("Introduzca numero de mes:");
        numero = input.nextInt();
        
        String mes;
        
        switch (numero) {
            case 1:  mes = "Enero";
                     break;
            case 2:  mes = "Febrero";
                     break;
            case 3:  mes = "Marzo";
                     break;
            case 4:  mes = "Abril";
                     break;
            case 5:  mes = "Mayo";
                     break;
            case 6:  mes = "Junio";
                     break;
            case 7:  mes = "Julio";
                     break;
            case 8:  mes = "Agosto";
                     break;
            case 9:  mes = "Septiembre";
                     break;
            case 10: mes = "Octubre";
                     break;
            case 11: mes = "Noviembre";
                     break;
            case 12: mes = "Diciembre";
                     break;
            default: mes = "mes invalido";
                     break;
        }
        System.out.println(mes);
    }
}