
package recursividad;


class cl_2 {

	 public static void main(String[] args) {
		 
		   int a = 3;
	   	   int b = 5;
		   int total = funcion(a, b);
	       System.out.println(total);
	}

    static int funcion(int a1, int b1) {
	   
    	a1=5;
    	b1=6;

    	int suma = a1+b1;
    	
		return suma; 
   }
}