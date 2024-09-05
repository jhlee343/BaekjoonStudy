import java.util.*;
public class Main{
    static int dp[] = new int[11];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
    
        dp[0] = dp[1] = 1; 
        dp[2] = 2;  dp[3] = 4;   
        
        for(int i =4 ; i<=10 ; i++){
                dp[i]= dp[i-3]+dp[i-2]+dp[i-1];        
            }
        
        for(int j = 0 ; j<T; j++){
            int n = sc.nextInt();   
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
    }
}