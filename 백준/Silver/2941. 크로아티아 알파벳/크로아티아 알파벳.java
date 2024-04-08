import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		String input = br.readLine();
		int inputLength = input.length();
		
		//System.out.println(" ");
		for(int i =0 ; i<input.length();i++) {
				if(input.charAt(i)=='c') {
					if(i<input.length()-1) {
						if(input.charAt(i+1)=='-'||input.charAt(i+1)=='=') {
							answer++;
							i+=1;
						}
					}
					continue;
				}
				else if(input.charAt(i)=='l'||input.charAt(i)=='n') {
					if(i<input.length()-1) {
						if(input.charAt(i+1)=='j') {
							answer++;
							i+=1;
						}
					continue;
					}
				}
				else if(input.charAt(i)=='s'||input.charAt(i)=='z') {
					if(i<input.length()-1) {
						if(input.charAt(i+1)=='=') {
							answer++;
							i+=1;
						}
					continue;
					}
				}
			
			else if(input.charAt(i)=='d') {
				if(i<input.length()-1) {
					if(i<input.length()-2) {
						if(input.charAt(i+1)=='z' && input.charAt(i+2)=='=') {
							answer+=2;
							i+=2;
						}
					}
					if(i<input.length()-1) {
						if(input.charAt(i+1)=='-') {
							answer++;
							i+=1;
						}
					}
				}
				continue;
			}
			
		}
		//System.out.println(answer);
		answer = inputLength-(answer);
		System.out.println(answer);
	}

}
