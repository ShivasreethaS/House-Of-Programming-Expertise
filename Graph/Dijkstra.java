// Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges. Find and print the shortest distance from the source vertex (i.e. Vertex 0) to all other vertices (including source vertex also) using Dijkstra's Algorithm.

// Input Format

// Line 1: Two Integers V and E (separated by space) Next E lines : Three integers ei, ej and wi, denoting that there exists an edge between vertex ei and vertex ej with weight wi (separated by space)

// Constraints

// 2 <= V, E <= 10^5 Time Limit: 1 sec

// Output Format

// For each vertex, print its vertex number and its distance from source, in a separate line. The vertex number and its distance needs to be separated by a single space.

// Sample Input 0

// 4 4
// 0 1 3
// 0 3 5
// 1 2 1
// 2 3 8
// Sample Output 0

// 0 0
// 1 3
// 2 4
// 3 5
// Sample Input 1

// 3 3
// 1 2 6
// 2 0 2
// 1 0 2
// Sample Output 1

// 0 0
// 1 2
// 2 2
import java.io.*;
import java.util.*;

public class Dijkstra {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        
        int a[][] = new int[v][v];
        for(int i=0;i<e;i++)
        {
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            int w = sc.nextInt();
            
            a[sv][ev] = w;
            a[ev][sv] = w;
        }
        
        diji(a,v);
    }
    
    private static void diji(int a[][], int v)
    {
        int dis[] = new int[v];
        boolean vis[] = new boolean[v];
      
        for(int i=0;i<v;i++)
        {
            dis[i] = Integer.MAX_VALUE;
        }
        dis[0] = 0;
        
        for(int i=0;i<v-1;i++)
        {
            int sv = min(dis,vis,v);
            
            for(int ev=0;ev<v;ev++)
            {
                if(a[sv][ev]!=0 && !vis[ev])
                {
                    if(dis[sv] + a[sv][ev] < dis[ev])
                    {
                        dis[ev] = dis[sv] + a[sv][ev];
                    }
                }
            }
            vis[sv] = true;
        }
        
        for(int i=0;i<v;i++)
        {
            System.out.println(i+" "+dis[i]);
        }
    }
    
    private static int min(int dis[], boolean vis[], int v)
    {
        int m_v = Integer.MAX_VALUE;
        int m_ind = 0;
        for(int i=0;i<v;i++)
        {
            if(dis[i]<m_v && !vis[i])
            {
                m_v = dis[i];
                m_ind = i;
            }
        }
        return m_ind;
    }
}
