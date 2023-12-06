package noviecFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chapter05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int star = Integer.parseInt(br.readLine());
        String A = "";
        for(int i=0; i < star; i++){
            A += "*";
            System.out.println(A);
        }
    }
}
