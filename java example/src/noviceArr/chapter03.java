package noviceArr;

import java.io.IOException;
import java.util.Scanner;

public class chapter03 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int [] check = new int [31];

        for(int i = 1; i <= 30; i++){
            check[i] = 0;
        }

        for(int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            check[n] = 1;
        }

        for(int i = 1; i <= 30; i++){
            if(check[i] != 1){
                System.out.println(i);
            }
        }
    }
}
