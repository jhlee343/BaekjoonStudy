import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int pattern_one[] = {1,2,3,4,5};
        int pattern_two[] = {2,1,2,3,2,4,2,5};
        int pattern_three[] = {3,3,1,1,2,2,4,4,5,5};
        int count[] = new int[3];
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0 ; i<answers.length ; i++){
                if(pattern_one[i%(pattern_one.length)]==answers[i]){
                    count[0]+=1;
                }
                if(pattern_two[i%pattern_two.length]==answers[i]){
                    count[1]+=1;
                }
            
                if(pattern_three[i%pattern_three.length]==answers[i]){
                    count[2]+=1;
                }
        }
        int max = Math.max(count[0],Math.max(count[1],count[2]));
        for(int i=0 ; i<count.length ;i++){
            if(count[i]==max){
                arr.add(i+1);
            }
        }
        int answer[] = new int[arr.size()];
        for(int i=0 ; i<arr.size(); i++){
            answer[i]=arr.get(i).intValue();
        }
        return answer;
    }
}