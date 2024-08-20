import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
       for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                sb.append(" ");
                continue;
            }

            if (65 <= ch && ch <= 90) {
                char rot13 = (char) (ch + 13);
                if(ch > 77) {
                    rot13 %= 90;
                    rot13 += 64;
                }
                //77이하는 13 더해도 안넘어감.
                sb.append((char)rot13);
                continue;
            }
            if (97 <= ch && ch <= 122){
                char rot13 = (char) (ch + 13);
                if(ch > 109){
                    rot13 %= 122;
                    rot13 += 96;
                }

                sb.append((char)rot13);
                continue;
            }
            //숫자는 아무데도 안걸림
            sb.append(ch+"");
        }
        System.out.println(sb);
    }
}