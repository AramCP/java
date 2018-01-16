package recursividad;

public class cl_3 {
	
	public static void main(String[] args) {
        cuentaRegresiva(10);
    }
    
    static void cuentaRegresiva(int numero) {
        System.out.println(numero);
        if(numero > 0) {
            cuentaRegresiva(numero - 1);
      }
    }
}