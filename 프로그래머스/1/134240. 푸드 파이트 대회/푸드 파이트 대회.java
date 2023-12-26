class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1 ; i<food.length ; i++){
            int count = food[i]/2;
            for(int j =0 ; j<count ; j++){
                answer+=i;
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        String reverseSB = sb.reverse().toString();
        answer=answer+0+reverseSB;
        System.out.println(answer);
        return answer;
    }
}