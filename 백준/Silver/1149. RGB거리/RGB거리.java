import java.util.*;
public class Main{
    
    static int rgb[][] ;
    static int dp[][] ;
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        rgb = new int[n][3];
        dp = new int[n][3];
        
        for(int i = 0 ;i <n ; i++){
            rgb[i][0] = sc.nextInt();
            rgb[i][1] = sc.nextInt();
            rgb[i][2] = sc.nextInt();
        }
        
        dp[0][0] = rgb[0][0];
        dp[0][1] = rgb[0][1];
        dp[0][2] = rgb[0][2];
        
        System.out.print(Math.min(cost(n-1, 0), Math.min(cost(n-1,1), cost(n-1,2))));
    }
    public static int cost(int n, int color){
        if(dp[n][color]==0){
            if(color == 0){
                dp[n][0] = Math.min(cost(n-1,1), cost(n-1,2))+rgb[n][0];
            }   
            if(color == 1){
                dp[n][1] = Math.min(cost(n-1,0), cost(n-1,2))+rgb[n][1];
            }
            if(color == 2){
                dp[n][2] = Math.min(cost(n-1,1), cost(n-1,0))+rgb[n][2];
            }
        }
        return dp[n][color];
        
    }
}