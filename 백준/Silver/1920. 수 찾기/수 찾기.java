import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0 ; i<N ; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int j = 0 ; j<M ; j++){
            if(binary(arr, sc.nextInt())>=0){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
    
        static int binary(int arr [] , int key){
            int mid;
            int low = 0 ; int high = arr.length - 1;
            
            while(low<=high){
                mid = (high+low) / 2 ;
                if(key < arr[mid]){
                    high = mid-1;
                }
                else if(key > arr[mid]){
                    low = mid+1;
                }
                else{
                    return mid;
                }
                    
            }
            return -1;
        }
    
}