package noviceIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chapter01 {
    public static void main(String[] args)throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(BR.readLine());
        BR.close();
        if(score < 60){
            System.out.println("F");
        } else if (score < 70) {
            System.out.println("D");
        }else if (score < 80) {
            System.out.println("C");
        }else if (score < 90) {
            System.out.println("B");
        }else if (score <= 100) {
            System.out.println("A");
        }

    }
}
