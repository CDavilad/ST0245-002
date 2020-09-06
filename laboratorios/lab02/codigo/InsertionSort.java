
package Lab2;

public class InsertionSort {
    public static int[] array = new int[10001];
    public static void insertionSort (int[] array){
        for (int i = 1; i < array.length; i++) {    //2n+1
            int key = array[i];                     //1*n
            int j = i-1;                            // n
            while(j>=0 && array[j]>key){            //2*n^2
                array[j+1]=array[j];                //(n^2)*2
                j--;                                //n^2
            }
            array[j+1]=key;                         //n
        }
    }
    
    public static void main(String[] args) {
        int cont = 0;
        for (int i = 10000; i > -1; i--) {
            array[cont] = i;
            cont++;
        }
        for (int i = 0; i < 20; i++) {
            int[] array2 = new int[8000+i];
            
            for (int j = 0; j < array2.length; j++) {
                array2[j] = array[j]; 
            }
            long tiempo = System.currentTimeMillis();
            insertionSort(array2);
            long tiempo2 = System.currentTimeMillis();
            System.out.println(tiempo2-tiempo);
        }
    }
}
