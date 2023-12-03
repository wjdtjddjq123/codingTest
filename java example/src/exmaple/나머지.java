package exmaple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지 {
    public static void main(String[] args) throws IOException {

//        1. 불린 42개 배열 만들기
        boolean[] arr = new boolean[42];
//        2. 카운트 멤버변수 선언
        int count = 0;
//        3. 버퍼에 입력받아서 저장
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<10; i++){
//        4. 입력받은 버퍼 수 확인하기
            arr[Integer.parseInt(BR.readLine()) % 42] = true;
//        5. 입력받은 정수 % 42나누기
        }

        for(boolean c : arr){
//        6. 나눈 버퍼 수 포문돌려서 확인하기
            if(c) count ++;
//        7. 배열에 저장 된 개수 카운트하기
        }
        System.out.println(count);
    }
}
