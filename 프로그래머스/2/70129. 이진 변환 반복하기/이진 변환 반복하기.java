class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count_zero = 0;
        //delete '0' using replaceAll
        while(s.length() > 1){
            int count_one = 0;
            for(int i =0 ; i<s.length() ; i++){
                if(s.charAt(i)=='0'){
                    answer[1] +=1;
                }
                else{
                    count_one +=1 ;    
                }
            }
            s = Integer.toBinaryString(count_one);
            answer[0] +=1;
        }
        return answer;
    }
}