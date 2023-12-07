<<<<<<< Updated upstream
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
=======
import java.io.*;
import java.util.Locale;
>>>>>>> Stashed changes

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

<<<<<<< Updated upstream
        int N = Integer.parseInt(br.readLine()); // 좌석갯수
        String M = br.readLine();
        String Str = "";
        for (int i = 0; i < N; i++) {
            if (M.charAt(i) == 'S') {
                Str += "*S";
            } else{
                Str += "*LL";
                i++;
            }
        }
        Str += "*";
        int count = 0;
        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) == '*') {
                count++;
            }
        }
        count = Math.min(count,N);
        System.out.println(count);
    }
=======
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(Character.isUpperCase(c)){
                    sb.append(Character.toLowerCase(c));
                }else{
                    sb.append(Character.toUpperCase(c));
                }
            }
            System.out.println(sb);

        }
>>>>>>> Stashed changes
}