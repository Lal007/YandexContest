import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        short[] digits = new short[101];

        int k = Integer.parseInt(reader.readLine());

        String[] nums;
        for (int i = 0; i < k; i++) {
            nums = reader.readLine().split(" ");

            for (int j = 1; j < nums.length; j++) {
                digits[Integer.parseInt(nums[j])]++;
            }
        }

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
