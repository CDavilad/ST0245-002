
public class Lab01
{
    public static void main(String[] args){
        String cadena1 = "gctagcgtagcttaactaaagcataacactgaagatgttaagatgagccctagacagctccgcaggcacaaaggcttggtcctggccttactatcaatt";
        String cadena2 = "gctagcgtagcttaattaaagcataacactgaagatgttaagatgggccctagaaagccccgcgggcacaaaggcttggtcctggctttactatcaact";
        for(int i = 30;i < 50; i++){
            long ti = System.currentTimeMillis();
            lcsDNA(cadena1.substring(0, i), cadena2.substring(0, i));
            long tf = System.currentTimeMillis();
            System.out.println(tf - ti);
        }

    }

    public static int lcsDNA(String string1, String string2){
        return lcsDNAaux(string1, string2, string1.length(), string2.length());
    }

    public static int lcsDNAaux(String string1, String string2, int m, int n){
        if(m == 0 || n == 0){
            return 0;		//t(m,n) = c1, donde c1 = 5
        }
        if(string1.charAt(m-1) == string2.charAt(n-1)){
            return 1 + lcsDNAaux(string1, string2, m-1, n-1);		//T(n,m) = c2 + T(n-1, m-1)
        }
        return Math.max(lcsDNAaux(string1, string2, m, n-1), lcsDNAaux(string1, string2, m-1, n));		//T(n,m) = c3 + T(n-1, m) + T(n, m-1)
    }
    
    public static int rectangulo(int n){
  	if(n <= 0){
            return -1;
  	}else if(n == 1){
            return 1;
        }
        return 1 + rectangulo(n-1);
    }
}
