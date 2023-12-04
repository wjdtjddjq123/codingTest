package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class catles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int col_count = 0;
        int row_count = 0;

        boolean[][] arr = new boolean[N][M];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {

                if(str.charAt(j) == '.') {
                    arr[i][j] = false;
                }
                else {
                    arr[i][j] = true;
                }
            }
        }
//      열검사
        for(int i=0; i<M; i++) {
            int count = 0;
            for(int k=0; k<N; k++) {
                if(arr[k][i] == false) {
                    count ++;
                }
            }
            if(count == N) {
                //열에 필요한 경비원 수
                col_count++;
            }
        }
//      행검사
        for(int i=0; i<N; i++) {
            int count = 0;
            for(int k=0; k<M; k++) {
                if(arr[i][k] == false) {
                    count ++;
                }
            }
            if(count == M) {
                // 행에 필요한 경비원 수
                row_count++;
            }
        }
        if( row_count >= col_count) {
            System.out.println(row_count);
        }
        else {
            System.out.println(col_count);
        }
    }
}
