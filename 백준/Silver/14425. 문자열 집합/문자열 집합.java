import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        
        int count = 0;
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for(int i =0 ;i<N ; i++){
            map.put(br.readLine(),0);
        }
        
        for(int j = 0 ; j<M ; j++){
            if(map.get(br.readLine())!=null){
                count++;
            }
        }
        System.out.println(count);
    }
}