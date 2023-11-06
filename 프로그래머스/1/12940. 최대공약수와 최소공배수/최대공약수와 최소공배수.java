class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min =0 ;
        int max = 0;
        
        if(m>n){
            for(int i = 1; i<= m ; i++){
                if(m%i==0){
                    if(n%i==0){
                        min = i;
                    }
                }
            }
        }
        if(m<=n){
              for(int i = 1; i<= n ; i++){
                if(n%i==0){
                    if(m%i==0){
                        min = i;
                    }
                }
            }
        }
       
        max = n*m/min;
        
        answer[0] = min ; answer[1] =max;
        return answer;
    }
}