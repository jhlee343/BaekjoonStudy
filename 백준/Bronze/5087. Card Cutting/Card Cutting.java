import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//짝수가 나오면 Taina got score 홀수가 나오면 Cheryl get score
		Scanner sc = new Scanner(System.in);
		while(true) {
			int Tania = 0 ; int Cheryl = 0;
			
			while(sc.hasNext()) {
				String a = sc.next();
				
				if (a.equals("#")) {
					return;
				}
				if(a.equals("*")) {
					break;	
					}
				
				int point ;
				if(a.equals("A")) {
					point = 1;
				}else {
					point = Integer.parseInt(a);
				}
				
				if(point %2==0) {
					Tania +=1;
				}else{
					Cheryl +=1;
				}
			}
			if(Cheryl > Tania) {
				System.out.println("Cheryl");
			} else if(Cheryl <Tania) {
				System.out.println("Tania");
			}else {
				System.out.println("Draw");
			}
		}
	}
}
