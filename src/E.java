import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class E {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();

        HashMap<Character, Integer> word1 = new HashMap<>();
        HashMap<Character, Integer> word2 = new HashMap<>();

        for (int i = 0; i <a.length() ; i++) {
            word1.put(a.charAt(i), word1.getOrDefault(a.charAt(i), 0) + 1);
        }

        for (int i = 0; i <b.length() ; i++) {
            word2.put(b.charAt(i), word2.getOrDefault(b.charAt(i), 0) + 1);
        }

        if (word1.equals(word2)){
            System.out.println(1);
        }else System.out.println(0);
    }
}
