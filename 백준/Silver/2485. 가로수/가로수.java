import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int arr[] = new int[N];    

        for(int i =0 ; i<N; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int min =0;
        for(int i=0; i<N-1; i++){
            int max =arr[i+1]-arr[i]; //최대위치
            min = GCD(max,min);
        }
        
        System.out.println((arr[N-1]-arr[0])/min+1-(arr.length));
        
    }
    
     static int GCD(int a, int b){
        if(b==0){return a;}
        else{
            return GCD(b,a%b);
        }
    }
}