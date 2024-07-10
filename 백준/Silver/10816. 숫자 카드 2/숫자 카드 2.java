import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();

        StringTokenizer st_N = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++) {
            int token = Integer.parseInt(st_N.nextToken());
            
            if(map.containsKey(token)) {
                int value = map.get(token); // value값을 뽑아 1씩 증가시키 위해
                map.put(token, value+1);
            
            } else {
                map.put(token, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st_m = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < M; i++) {
            int token = Integer.parseInt(st_m.nextToken());
            
            if(map.containsKey(token)) {
                sb.append(map.get(token)).append(" ");
            
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);

    }
}