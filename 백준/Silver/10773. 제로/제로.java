import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int element;
        Stack<Integer> stack = new Stack<>();
        for(int i =0 ;i <N; i++){
            int m = sc.nextInt();
            if(m==0){
                stack.pop();
            }
            else{
                stack.push(m);
            }
        }
        
        while(!stack.isEmpty()){
            element= stack.pop();
            count += element;
        }
        System.out.println(count);
    }
}