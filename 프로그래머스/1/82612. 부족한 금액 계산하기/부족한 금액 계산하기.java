class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        int c = 1; //진행한 횟수
        long cumsum = 0; //누적 증가 비용
        long total = 0;
        while(c<=count){
            //3..6...9..비용 증가
            cumsum +=price;
            //증가비용 total
            total +=cumsum;
            //while문 count
            c+=1;
        }
        answer =total-money;
         // !!금액이 부족하지 않은 경우!!!
        if(answer<0){answer =0;}
        return answer;
    }
}