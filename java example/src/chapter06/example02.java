package chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example02 {
    public static void main(String[] args) throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
//      1. 우선 버퍼로 입력받기
        String S = BR.readLine();
//      2. 스트링 타입으로 읽어주기
        String arr[] = S.split(" ");
//      3. 입력 받은 값을 넣어 줄 배열 선언
        System.out.println(arr);
        for(int i=0; i < S.length(); i++){

        }
        BR.close();
    }
}
