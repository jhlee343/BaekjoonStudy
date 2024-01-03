import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        //people배열 정렬
        Arrays.sort(people);
        // [50-50-70-80]
        int index =0;
        int answer = 0;
        
        for(int i =people.length-1 ; i>=0 ; i--){
            if(people[i]==0){
                continue;
            }
            if(people[i]+people[index]<=limit){
                    people[index]=0;
                    index++;
            }
            answer++;
        }

        return answer;
    }
}