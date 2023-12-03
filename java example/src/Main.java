import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
//      1. 우선 버퍼로 입력받기
        String S ="";
//      2. 입력 받을 값을 저장할 변수 선언
        int superMario = 0;
//      3. 버섯 먹을 마리오
        while ((S = BR.readLine()) != null){
//      4. 입력한 값이 끝 나기 전 까지
            int mush = Integer.parseInt(S);
//      5. 버섯 숫자 값으로 변환
            for(int i=0; i < S.length(); i++){
//      6. 입력한 값 만큼 버섯 먹여 주기
                if( superMario < 99){
                    superMario += mush;
                    break;
//      7. 100 넘어 가면 멈추기
                }else{
//      8. 혹시모르니까 한 번더 멈춰주기
                    System.out.println(superMario);
                    break;
                }
            }
        }
        BR.close();
    }
}
