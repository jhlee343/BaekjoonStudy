import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score[] = {10,8,6,5,4,3,2,1,0};
		int rank[] = new int[8];
		
		String[] teamArr = new String[8];
		int[] timeArr = new int[8];
		
		int teamB = 0;
		int teamR = 0;
		
		for(int i = 0 ;i<8 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			String time = st.nextToken();
			String team = st.nextToken();
			
			int timeInt = Integer.parseInt(time.replace(":", ""));
			timeArr[i]=timeInt;
			teamArr[i]=team;
		}
		
		for(int i =0 ; i<8 ; i++) {
			for(int j =0 ; j<8 ; j++) {
				if(timeArr[i]>timeArr[j]) {
					//먼저 입력된 값이 더 늦게 들어온경우
					//둘의 순서 교체해줘야함
					rank[i]+=1;
				}
			}
		}
		
		for(int i =0 ;i<8 ; i++) {
			if(teamArr[i].equals("B")) {
				//b팀의 경우
				teamB +=score[rank[i]];
			}
			else {
				teamR +=score[rank[i]];
			}
		}
		
		if(teamB>teamR) {
			//blue 팀이 이긴경우
			System.out.print("Blue");
		}else {
			System.out.println("Red");
		}
	}

}
