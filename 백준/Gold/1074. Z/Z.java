import java.util.*;
public class Main{
    static int ans = 0;
    static int N, r, c;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int size = (int)Math.pow(2,N);
        
        find(size,r,c);
        System.out.println(ans);   
    }
    
    static void find(int size, int r, int c){
        if(size ==1){
            return ;
        }
        if(r < size/2 && c < size/2){
            //1사분면
            find(size/2, r,c);
            
        }
        else if(r < size/2 && c >= size/2){
            //2사분면
            ans += Math.pow(size,2)/4;
            find(size/2 , r, c-size/2);
        }
        else if(r >= size/2 && c < size/2){
            //3사분면
            ans += (Math.pow(size,2)/4)*2;
            find(size/2, r-size/2,c);
        }
        else{
            //4사분면
            ans += (Math.pow(size,2)/4)*3;
            find(size/2, r-size/2,c-size/2);
        }
    }
}