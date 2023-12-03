package chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exmaple03 {
    public static void main(String[] args) throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
//      1. 우선 버퍼로 입력받기
        String S ="";
//      2. 입력 받을 문자열 변수선언
        while ((S = BR.readLine()) != null){
//      3. 입력받은 값이 없을 때 까지 읽기 ( 알아두면 좋음 )
            int count[] = new int[4];
//      4. 카운트 할 배열 선언
            StringBuilder SB = new StringBuilder();
//      5. 변경가능한 문자열을 선언
//            Stirng은 변경 불가능한 문자열을 생성하지만 StringBuilder는
//            변경 가능한 문자열을 만들어 주기 때문에,
//            String을 합치는 작업 시 하나의 대안
            for(int i = 0; i < S.length(); i++){
                if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z') count[0]++;
//                소문자 카운트
                else if(S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') count[1]++;
//                대문자 카운트
                else if(S.charAt(i) >= '0' && S.charAt(i) <= '9') count[2]++;
//                숫자 카운트
                else if(S.charAt(i) == ' ') count[3]++;
//                공백 카운트
            }
            for(int i : count)
                SB.append(i).append(" ");
//                포문 돌려서 카운트 공백과 함께 넣기

            System.out.println(SB.toString());
//                출력
        }
        BR.close();
    }
}

