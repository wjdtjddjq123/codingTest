package noviceIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chapter02 {
    public static void main(String[] args)throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(BR.readLine());
        int y = Integer.parseInt(BR.readLine());
        BR.close();
        if( x > 0 && y > 0){
            System.out.println("1");
        } else if ( x > 0 &&  y < 0 ) {
            System.out.println("4");
        } else if ( x < 0 && y > 0 ) {
            System.out.println("2");
        } else{
            System.out.println("3");
        }
    }
}
