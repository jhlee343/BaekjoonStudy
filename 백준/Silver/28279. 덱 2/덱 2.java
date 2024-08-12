import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "1" : dq.addFirst(Integer.parseInt(st.nextToken())); break;
                    
                case "2" : dq.addLast(Integer.parseInt(st.nextToken())); break;
                    
                case "3" : 
                    if(!dq.isEmpty()){
                        sb.append(dq.removeFirst()).append("\n");
                    }
                    else{
                        sb.append(-1).append("\n");
                    }
                    break;
                case "4" : 
                    if(!dq.isEmpty()){
                        sb.append(dq.removeLast()).append("\n");
                    }
                    else{
                        sb.append(-1).append("\n");
                    }
                    break;
                    
                case "5" : sb.append(dq.size()).append("\n"); break;
                    
                case "6" : sb.append(dq.isEmpty() ? 1 : 0).append("\n"); break;
                    
                case "7" : 
                    if(!dq.isEmpty()){
                        sb.append(dq.getFirst()).append("\n");
                    }
                    else{
                        sb.append(-1).append("\n");
                    }
                    break;
                    
                case "8" : 
                    if(!dq.isEmpty()){
                        sb.append(dq.getLast()).append("\n");
                    }
                    else{
                        sb.append(-1).append("\n");
                    }
                    break;
                    
            }
        }
        System.out.println(sb.toString());
    }

}