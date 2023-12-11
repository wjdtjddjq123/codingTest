package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class check {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String word = br.readLine();

        int count = 0;
        int index = 0;

        while (index <= str.length() - word.length()) {
            boolean check = true;

            for (int j = 0; j < word.length(); j++) {
                if (str.charAt(index + j) != word.charAt(j)) {
                    check = false;
                    break;
                }
            }

            if (check) {
                count++;
                index += word.length();
            } else {
                index++;
            }
        }

        System.out.println(count);
    }
}
