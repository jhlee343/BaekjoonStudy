import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			int b = sc.nextInt();
			if(b==0) {break;}
//			String p = sc.next();
//			String m = sc.next();
	
			BigInteger P = new BigInteger(sc.next(),b);
			BigInteger M = new BigInteger(sc.next(),b);
			
			BigInteger answer = P.mod(M);
			
			System.out.println(answer.toString(b));
			
		}
	}

}
