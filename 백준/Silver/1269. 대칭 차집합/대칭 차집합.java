import java.util.*;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
         Set<Integer> set = new HashSet<>();

    
        for(int i = 0 ;i <N+M; i++){
            int element = sc.nextInt();
            if(set.contains(element)){
                set.remove(element);
             }  
            else{
                 set.add(element);
            }
        }
        System.out.println(set.size());
	}

}
      