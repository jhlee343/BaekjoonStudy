import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int paper[][] = new int[110][110];
		for(int a =0 ; a<100 ; a++) {
			Arrays.fill(paper[a], 0);
		}
		int N = sc.nextInt();
		
		for(int i =0 ; i<N ; i++) {
			int x = sc.nextInt(); int y = sc.nextInt();
			for(int j =y ; j<y+10 ; j++) {
				for(int k = x ; k<x+10 ; k++) {
					if(paper[j][k]==0) {
						paper[j][k]=1;
					}
					else {
						paper[j][k] = paper[j][k]+1;
					}
				}
			}
		}
		int count = 0 ;
		for(int i =0 ; i<100; i++) {
			for(int j = 0 ;j<100 ; j++) {
				if(paper[i][j]!=0) {
					if(paper[i][j-1]==0) {count++;}
					if(paper[i][j+1]==0){count++;}
					if(paper[i-1][j]==0){count++;}
					if(paper[i+1][j]==0) {count++;}
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
