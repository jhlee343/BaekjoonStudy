class Solution {
    public long solution(int k, int d) {
        long answer =0 ;
        for(int i =0 ; i<=d ; i+=k){
            answer += ((int)Math.sqrt(Math.pow(d,2.0) - Math.pow(i,2.0)))/k+1;
            }
        return answer;
        }
    }