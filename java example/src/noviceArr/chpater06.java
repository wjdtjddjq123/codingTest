package noviceArr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chpater06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        if (a.equals("A+")){
            System.out.println(4.3);
        } else if (a.equals("A0")) {
            System.out.println(4.0);
        } else if (a.equals("A-")) {
            System.out.println(3.7);
        } else if (a.equals("B+")) {
            System.out.println(3.3);
        } else if (a.equals("B0")) {
            System.out.println(3.0);
        } else if (a.equals("B-")) {
            System.out.println(2.7);
        } else if (a.equals("C+")) {
            System.out.println(2.3);
        } else if (a.equals("C0")) {
            System.out.println(2.0);
        } else if (a.equals("C-")) {
            System.out.println(1.7);
        } else if (a.equals("D+")) {
            System.out.println(1.3);
        } else if (a.equals("D0")) {
            System.out.println(1.0);
        } else if (a.equals("D-")) {
            System.out.println(0.7);
        } else if (a.equals("F")) {
            System.out.println(0.0);
        }
    }
}
