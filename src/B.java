import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(Integer.parseInt(reader.readLine()) == 1){
                count++;
                if (count > max){
                    max = count;
                }
            }else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
