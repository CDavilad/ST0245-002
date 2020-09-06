
package Lab2;

public class MergeSort {

    public static int[] array = new int[10001];
    
    
    public static void mergesort(int A[],int izq, int der){ 
        if (izq < der){ 
            int m=(izq+der)/2; 
            mergesort(A,izq, m); 
            mergesort(A,m+1, der); 
            merge(A,izq, m, der); 
        } 
    }
       
    public static void merge(int A[],int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length];       //array auxiliar
          
        for (i=izq; i<=der; i++)            //copia ambas mitades en el array auxiliar                                      
            B[i]=A[i];
            i=izq; j=m+1; k=izq;
            while (i<=m && j<=der)          //copia el siguiente elemento más grande                                     
                if (B[i]<=B[j])
                    A[k++]=B[i++];
                else
                    A[k++]=B[j++];
                    while (i<=m)            //copia los elementos que quedan de la
                        A[k++]=B[i++];      //primera mitad (si los hay)
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
            mergesort(array2, 0, array2.length-1);
            long tiempo2 = System.currentTimeMillis();
            System.out.println(tiempo2-tiempo);
        }
    }
}
