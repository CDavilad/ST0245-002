
package Laboratorio1;

public class Recursion1 {
    public static int factorial(int n) {
        if(n < 0){
            return -1;
        }else if(n == 0 || n == 1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    
    public static int fibonacci(int n)  {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public int powerN(int base, int n) {
  	if(n == 1){
            return base;
        }else{
            return base*powerN(base, n-1);
        }
    }
    
    public int bunnyEars(int n) {
 	if(n < 0){
            return -1;
        }else if(n == 0){
            return 0;
        }else{
            return 2 + bunnyEars(n-1);
        }
    }
    
    public int triangle(int rows) {
         if(rows < 0){
        	return -1;
        }else if(rows == 0){
            return 0;
        }else if(rows == 1){
            return 1;
        }else{
            return rows + triangle(rows-1);
        }
    }
}
