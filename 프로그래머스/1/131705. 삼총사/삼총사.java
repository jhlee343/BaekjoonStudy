class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int size = number.length;
        int sum =0 ;
        for(int i =0 ; i< size ; i++){
            for(int j = i+1 ; j< size ; j++){
                for(int k = j+1 ; k< size ; k++){
                    if(number[i] + number[j] + number[k]==0){
                        answer ++ ;
                    }
                }
            }
        }
        
        return answer;
    }
}