package silver;

import java.io.*;

public class number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] esm = br.readLine().split(" ");

        int E = Integer.parseInt(esm[0]);
        int S = Integer.parseInt(esm[1]);
        int M = Integer.parseInt(esm[2]);

        int e = 1;
        int s = 1;
        int m = 1;

        int year = 1;

        while(true) {
            if(E==e && S==s && M==m) break;
            e++; s++; m++;

            if(e == 16) e = 1;
            if(s == 29) s = 1;
            if(m == 20) m = 1;

            year++;
        }
        bw.write(String.valueOf(year));
        bw.flush();
        bw.close();
    }
}
