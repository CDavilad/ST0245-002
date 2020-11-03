
package ULTIMO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Uno {
    static int v, e; //Vertices
    static int MAX = 100005;
    static ArrayList<Integer> ady[] = new ArrayList[MAX]; //Lista de adyacencia
    static long distance[] = new long[MAX];
    static boolean marked[] = new boolean[MAX];
    static boolean camino;
    
    //Recibe el nodo inicial s
    static void bfs(int s, int j){
        Queue<Integer> cola = new LinkedList<Integer>();
        cola.add(s);
        distance[s] = 0;
        int actual, i, next;
        
        if(s == j){
            camino = true;
        }else{
            camino = false;
        }
        
        while(!cola.isEmpty()){
            actual = cola.poll();
            for(i = 0; i < ady[actual].size();i++){
                next = ady[actual].get(i);
                if(distance[next] == -1){
                    distance[next] = distance[actual]+1;
                    cola.add(next);
                }
            }
        }
        
    }
    
    static void dfs(int s, int j){
        marked[s] = true;
        int i , next;
        if(s == j){
            camino = true;
        }else{
            camino = false;
        }
        
        for(i = 0; i < ady[s].size(); i++){
            next = ady[s].get(i);
            if(!marked[next]){
                dfs(next, j);
            }
        }
    }
}