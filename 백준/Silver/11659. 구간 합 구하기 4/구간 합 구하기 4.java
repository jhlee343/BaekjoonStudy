import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N+1];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i<=N ; i++){
            arr[0]= 0;
            arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int j =0 ; j <M ; j++){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int sum = arr[b]-arr[a-1];
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}