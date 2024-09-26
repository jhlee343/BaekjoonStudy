import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
    
    public static long fact(int x){
        if(x<=1){
            return 1;
        }
        else{
            return x*fact(x-1);
        }

    }
}