import java.io.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;


public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        LinkedHashSet<Integer> middle = new LinkedHashSet<>();


        for (int i = 0; i < n; i++) {
            middle.add(Integer.parseInt(reader.readLine()));
        }

        List<Integer> result = middle.stream().distinct().collect(Collectors.toList());


        for (Integer i:result) {
            System.out.println(i);
        }
    }
}