package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class chechArr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num[] = br.readLine().split("");
        Arrays.sort(num, Comparator.reverseOrder());

        String N ="";
        for(int i =0; i<num.length; i++){
            System.out.print(num[i].toString());
        }


    }
}
