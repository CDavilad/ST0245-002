
public class Hanoi
{
    public static void hanoi(int  disc){
        hanoi(disc, "Tower1", "Tower2", "Tower3");
    }

    public static void hanoi(int disc, String a, String b, String c){
        if (disc == 1)
            System.out.println (a + " -> " + c);
        else {
            hanoi(disc - 1 ,a , c ,b);
            hanoi(1 , a , b , c);
            hanoi(disc - 1 ,b , a ,c);
        }
    }

    public static void main(String[] args){
        hanoi(5);
    }
}

