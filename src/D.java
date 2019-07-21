import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        D.foo("", 0, 0, n);


    }

    public static void foo(String s, int l, int r, int pairs){
        if (l == pairs && r == pairs){
            System.out.println(s);
        }else {
            if (l < pairs){
                foo(s + "(", l + 1, r, pairs);
            }
            if (r < l){
                foo(s + ")", l, r + 1, pairs);
            }
        }
    }
}
