import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i =0 ; i<N ; i++){
            int m = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            
            for(int j =0 ; j<m ; j++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key,0)+1);
            }
            
            int count = 1;
            for(int val : map.values()){
                count = count * (val+1);
            }
            System.out.println(count-1);
        }
    }
}