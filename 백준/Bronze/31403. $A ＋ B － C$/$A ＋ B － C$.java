/* Online Java Compiler and Editor */
import java.util.*;
import java.io.*;
public class Main{

     public static void main(String []args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        int answer1 = a+b-c;
        String concat = ""+a+b;
        int answer2 = Integer.parseInt(concat)-c;
        
        System.out.println(answer1);
        System.out.println(answer2);
        br.close();
     }
}