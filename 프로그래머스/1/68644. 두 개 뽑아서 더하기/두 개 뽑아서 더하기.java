import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i =0 ; i<numbers.length ; i++){
            for(int j =i+1; j<numbers.length ; j++){
                int sum = numbers[i]+numbers[j];
//                System.out.print(sum +" ");
                if(array.contains(sum)){
                    continue;
                }
                else{
                    array.add(sum);
                }
            }
        }
        int[] answer = new int[array.size()];
        int size =0 ;
        for(int element : array){
            answer[size++]=element;
        }
        Arrays.sort(answer);
        return answer;
    }
}