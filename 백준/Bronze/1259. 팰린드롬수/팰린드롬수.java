import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int word = sc.nextInt();
            if(word==0){
                break;
            }
            else{
                String a = Integer.toString(word);
                int len = a.length();
                int count =0;
                for(int i =0 ; i<len/2; i++){
                    if(a.charAt(i)==a.charAt(len-i-1)){
                       count++;                     
                    }
                }
                if(count == len/2){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
        }
     }
}