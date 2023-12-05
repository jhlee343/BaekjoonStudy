import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack <Integer> stack = new Stack<>();
        /*배열에서 확인
        for(int i =0 ; i<board.length ;i++){
            for(int j =0 ; j<board[0].length ;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println(" ");
        }
        	0 0 0 0 0  
            0 0 1 0 3  
            0 2 5 0 1  
            4 2 4 4 2  
            3 5 1 3 1 
        */
        for(int i =0 ; i< moves.length ; i++){
            int y_axis = moves[i]-1; // moves[i]에서 1을 빼줘야지 배열안에서 맞춰 들어갈수 있음
            for(int j = 0 ; j<board[0].length; j++){
                if(board[j][y_axis]!=0){//
                    int obj = board[j][y_axis];
                    board[j][y_axis]=0;
                    if(stack.isEmpty()){
                        stack.push(obj);
                    }
                    else{
                        if(obj == stack.peek()){
                            stack.pop();
                            answer+=2;
                        }
                        else{
                            stack.push(obj);
                        }
                    }
                    break;
                    }
                
            }
        }
        
        // /*	4 3 1 1 3 2  stack 사용으로 구현도 해볼것 */
        // for(int i =1 ; i<list.size() ; i++){
        //         System.out.print(list.get(i-1)+" ");
        //     if(list.get(i-1)==list.get(i)){
        //         list.remove(i-1);
        //         list.remove(i);
        //         answer++;
        //     }
        //     }
        return answer;
    }
}