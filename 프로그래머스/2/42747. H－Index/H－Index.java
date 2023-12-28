import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length; //발표한 논문의 수
        Arrays.sort(citations);
        //[0.1.3.5.6]
        for(int i = 0 ; i<citations.length ; i++){
            int quote = n-i; // 인용횟수
            if(citations[i]>=quote){ //인용횟수보다 citations가 더 크다면
                answer = quote;
                break;
            }
        }
        return answer;
    }
}