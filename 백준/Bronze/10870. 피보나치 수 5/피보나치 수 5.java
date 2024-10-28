// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		System.out.println(fibo(a));
	}
	
	public static int fibo(int x){
	    if(x == 0){
	        return 0;
	    }
	    if(x==1){
	        return 1;
	    }
	    else{
	        return fibo(x-1) + fibo(x-2);
	    }
	}
}