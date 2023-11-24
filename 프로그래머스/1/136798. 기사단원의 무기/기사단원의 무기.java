class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int div_count[] = new int[number];
        for(int N =1 ; N<=number ; N++){
            int count =0 ;
            for (int i = 1; i * i <= N; i++) {
    	        if (i * i == N) count++;
	            else if (N % i == 0) count += 2;
            }
            div_count[N-1] = count; 
        }
        System.out.println();
        for(int i =0 ; i< div_count.length ; i++){
            if(div_count[i]>limit) div_count[i] = power;      
            answer += div_count[i];
        }
        return answer;
    }
}