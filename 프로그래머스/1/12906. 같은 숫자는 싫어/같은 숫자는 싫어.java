import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0 ; i<arr.length-1 ; i++){
           if(arr[i]==arr[i+1]){
               if(i==arr.length-2){
                   queue.add(arr[i]);
               }
                continue;
           }
            else{
                queue.add(arr[i]);
                
                if(i==arr.length-2){
                    queue.add(arr[i+1]);
                }
            }
        }
        int size = queue.size();
        answer = new int[size];
        for(int i =0 ; i< size ; i++){
            answer[i]=queue.poll();
        }
       
        return answer;
    }
}