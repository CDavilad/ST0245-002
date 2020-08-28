
public class Taller5{
    public static int suma(int[] a){
        int sum = 0; 
        for (int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args){
        /*for (int n = 20000000; n < 400000000; n = n + 20000000){ 
            long ti = System.currentTimeMillis();
            suma(new int[n]);
            long tf = System.currentTimeMillis();
            System.out.println(tf-ti);      
        }*/
        int[] nam = {2, 3, 1, 9, 7, 6, 10};
        insertionSort(nam);
        for(int i = 0; i < nam.length; i++){
            System.out.println(nam[i]);
        }
    }

    private static void comparar(int[] a, int primero, int segundo){
        if (a[segundo] > a[primero]){
            int temp = a[segundo];
            a[segundo] = a[primero];
            a[primero] = temp;
        }
    }

    public static void insertionSort(int[] a){
        for(int i = 1; i < a.length; i++) //El verde
        {
            for(int j = i; j > 0; j--) // El rojo
            {
                comparar(a, j, j-1);
            }
        }
    }
}