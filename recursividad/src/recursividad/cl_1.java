package recursividad;


class cl_1 {

   static int suma(int a[], int n) {
	   
       if (n <= 0) {
           return 0;
       }
       return suma(a, n - 1) + a[n - 1];
   }


   public static void main(String[] args) {
	   
	   int array[] = { 1, 2, 3, 4, 5 };
	   int longitud = array.length;
	   int total = suma(array, longitud);
       System.out.println(total);
   }
}