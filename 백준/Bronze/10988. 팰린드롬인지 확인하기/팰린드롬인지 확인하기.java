import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int length = str.length();
		for(int i= 0 ; i< length/2 ; i++) {
			char front = str.charAt(i);
			char end = str.charAt(length-1-i);
			
			if(front != end) {
				System.out.println(0);
				return ;
			}
		}
		System.out.println(1);
	}
}
