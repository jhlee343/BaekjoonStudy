import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Deque<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer command;  
        
        for(int i =0 ; i<N; i++){
            command = new StringTokenizer(br.readLine(), " ");
            
            switch(command.nextToken()){
                case "push":
                    queue.offer(Integer.parseInt(command.nextToken()));	
				    break;
                    
                case "pop" :
                    Integer item = queue.poll();	
				    if(item == null) {
					sb.append(-1).append('\n');
				    }
				    else {
				    	sb.append(item).append('\n');
				    }
                    break;
                    
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                    
                case "empty" :
                    if(queue.isEmpty()){
                        sb.append(1).append("\n");                        
                    }
                    else{
                        sb.append(0).append("\n");                        
                    }
                    break;
                    
                case "front" :
                    Integer ite = queue.peek();
				if(ite == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(ite).append('\n');
				}
				break;
                case "back" :
                    Integer it = queue.peekLast();	 
				    if(it == null) {
				    	sb.append(-1).append('\n');
			    	}
			    	else {
			    		sb.append(it).append('\n');
			    	}
				break;
            }
        }
        System.out.println(sb);
    }
}