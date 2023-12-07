

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        int find = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find)
                count++;
        }
        System.out.println(count);
        br.close();
    }

            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(Character.isUpperCase(c)){
                    sb.append(Character.toLowerCase(c));
                }else{
                    sb.append(Character.toUpperCase(c));
                }
            }
            System.out.println(sb);


}