import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int ary[] = new int[N];
		for(int i =0; i<N ; i++) {
			ary[i]=sc.nextInt();
		}
		int total =0;
		int abs =0;
		for(int i=0; i<N ; i++) {
			for(int j=i+1; j<N ; j++) {
				for(int k = j+1; k<N ; k++) {
					total = ary[i]+ary[j]+ary[k];
					if(total>abs && total<=M) {
						abs = total;
						}
					}
				}
			}
			System.out.println(abs);
		}

	}