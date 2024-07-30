import java.util.Scanner;
 
public class Main {
    public static boolean[] prime = new boolean[246913];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        is_prime();
        while(true){
            int Min = sc.nextInt();
            if(Min==0){break;}
            
            int count = 0 ;
            for(int i = Min+1; i<=(2*Min); i++){
                if(!prime[i]){count++;}
            }
            System.out.println(count);
        }
    }
        
    public static void is_prime(){
        prime[0]=prime[1]=true;
            
        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
		   	for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
        }      
    }
}