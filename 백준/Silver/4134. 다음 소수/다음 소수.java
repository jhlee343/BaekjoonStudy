import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        for (long i = 0; i < N; i++) {
            long a = sc.nextLong();
            while(true){
	    		long in =  0;
                for (long j = 2; j <= Math.sqrt(a); j++) {
                        if (a % j == 0) {
                            in++;
                            break;
				}
			}
            if (in == 0) {
                    if (a == 0 || a == 1) {
                        a = 2;
                    }
                    System.out.println(a);
                    break;
                }
            a++;
		}
	}
    }
	
}