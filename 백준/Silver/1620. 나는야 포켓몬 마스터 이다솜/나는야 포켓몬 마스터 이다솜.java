import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
          
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        
        for(int i =0 ; i<N; i++){
            String pocket = br.readLine();
            int count = i+1;
            map1.put(pocket, count);
            map2.put(count, pocket);
        }
        
        for(int j =0 ; j<M ; j++){
            String question = br.readLine();
            if(49 <= question.charAt(0) && question.charAt(0) <= 57){
                sb.append(map2.get(Integer.parseInt(question))).append("\n");
            }
            else{
                sb.append(map1.get(question)).append("\n");
            }
        }
        System.out.println(sb);

	}

}