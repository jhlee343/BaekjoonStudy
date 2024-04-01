import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int j =0 ; j<N ; j++) {
			String answer = br.readLine();
			int length = answer.length();

			int point = 0;
			int score = 0;
			for(int i =0 ;i<length ;i++) {
				if(answer.charAt(i)=='O') {
					point +=1;
					score+=point;
//					System.out.print(point + " ");
				}
				else {
					point = 0;
//					System.out.print(point + " ");
				}
			}

			System.out.println(score);
		}
	}

}
