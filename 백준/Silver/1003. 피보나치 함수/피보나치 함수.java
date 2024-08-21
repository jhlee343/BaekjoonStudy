import java.util.*;
public class Main{
    static Integer ans[][] = new Integer[41][2];
    //Integer is wrapper class, u can use Null when the data type is Integer;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ans[0][0] = ans[1][1] = 1;        ans[0][1] = ans[1][0] = 0;
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int i =0 ; i<N ; i++){
            int f = sc.nextInt();    
            fibo(f);
            System.out.println(ans[f][0]+" "+ans[f][1]);
        }
    }
    public static Integer[] fibo(int x){     
        if(ans[x][0]==null || ans[x][1]==null){
            ans[x][0] = fibo(x-1)[0]+fibo(x-2)[0];
            ans[x][1] = fibo(x-1)[1]+fibo(x-2)[1];
        }
        return ans[x];
        
    }
}