import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String j = reader.readLine();
        String s = reader.readLine();
        int count = 0;

        for (int i = 0; i <s.length() ; i++) {
            Character tmp = s.charAt(i);
            if (j.contains(tmp.toString())){
                count++;
            }
        }

        System.out.println(count);
    }
}
