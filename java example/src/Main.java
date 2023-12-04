import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
}