package noviecFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chapter04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<10; i++){
            for(int j=1; j<N; j++)
                System.out.println("2"+"*"+i+"="+i*N);
        }
    }
}
