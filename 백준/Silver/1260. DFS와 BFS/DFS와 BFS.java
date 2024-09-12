import java.util.*;
public class Main{
    static int n, m, v;
    static boolean visit[];
    static int map[][];
    static int count ;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<Integer>(); 
    
    public static void dfs(int x){
        visit[x] = true;
        sb.append(x+" ");
        
        for(int i = 0; i<=n;i++){
            if(map[x][i]==1 && visit[i]==false){
                dfs(i);
            }
        }
    }
    public static void bfs(int x){
       
        queue.add(x);
        visit[x] = true;
        
        while(!queue.isEmpty()){
            x = queue.poll();
            sb.append(x+" ");
            
            for(int i = 1 ;i<=n ;i++){
                if(map[x][i]==1 && visit[i] == false){
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        
        map = new int[n+1][n+1];
        visit = new boolean [n+1];
        
        for(int i = 0 ; i< m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            map[a][b]=map[b][a] = 1;
        }
        dfs(v);            
        sb.append("\n");   
        
        visit = new boolean[n+1];
        bfs(v);
        
        System.out.println(sb);

    }
}