import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int roller = section[0];
        for(int paint : section){
            if(roller+m-1<paint){
                answer+=1;
                roller = paint;
            }
            
        }
        return answer;
    }
}