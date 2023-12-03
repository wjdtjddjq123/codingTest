package chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example01 {
        public static void main(String[] args) throws IOException {
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
//      1. 우선 버퍼로 입력받기
            String S = BR.readLine();
//      2. 읽을 때는 String 타입으로 읽어주기
            int count = 10;
//      3. 접시갯수 세는 변수선언, 바닥에 있는 접시 () 10을 기본 입력 값으로
            for( int i = 1 ; i <S.length(); i++){
//      4. for문으로 입력 받은 내용 확인, 바닥에 있는 접시의 갯수 1개를 디폴트 입력.
                if(S.charAt(i) == S.charAt(i-1)) {
//      5. 문자열에서 문자를 추출하는 함수 charAt을 사용, CharAt의 인덱스(i)로 확인,
//         만약에 입력한 문자() - ) => ( 이면 +5
                    count += 5;
                }else{
//      6. 그게아니면 +10
                    count += 10;
                }
            }
            System.out.println(count);
            BR.close();
    }
}
