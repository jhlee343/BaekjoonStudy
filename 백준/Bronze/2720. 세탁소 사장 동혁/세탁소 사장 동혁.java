import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		int ary[] = new int [T];
		int anw[][] = new int [T][4];
		for(int i =0; i<T ; i++) {
			ary[i]=sc.nextInt();
			anw[i][0]=ary[i]/25;	
			anw[i][1]=(ary[i]%25)/10;
			anw[i][2]=((ary[i]%25)%10)/5;
			anw[i][3]=((ary[i]%25)%10)%5;
		}
		for(int i =0 ; i<T ; i++) {
			for(int j = 0 ; j<4 ; j++) {
				if(j==3) {
					System.out.println(anw[i][j]);
				}
				else
					System.out.print(anw[i][j]+" ");
			}
		}

		sc.close();
	}
}