class Solution {
    public long solution(int n) {
        long answer = 0;
        int sum =n;
        //n값이 커지는게 문제같은데...
        /*for(int i =0; i<=n ; i++){
            for(int j = n ; j>=0 ; j--){
                int total = 1*i + 2*j;
                if(sum == total){
                    if(i==0 || j==0){
                        answer++;
                    }else{ 
                        answer += i+j;
                    }
                }
            }
        }
        */
        int dp[] = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3 ; i<=n ;i++){
            dp[i] = (dp[i-1]+dp[i-2])%1234567;
        }
        answer = dp[n]%1234567;
        
        return answer;
    }
}