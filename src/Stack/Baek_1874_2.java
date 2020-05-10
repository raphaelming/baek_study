package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_1874_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int m = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        while (testCase-- >0) {
            int input = Integer.parseInt(br.readLine());
            if (input > m) {
                while (input > m) {
                    stack.push(++m);
                    sb.append("+ \n");
                }
                stack.pop();
                sb.append("- \n");
            } else {
                boolean found = false;
                if (!stack.isEmpty()) {
                    int top = stack.peek();
                    stack.pop();
                    sb.append("- \n");
                    if (input == top) {
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(sb.toString());
        br.close();

    }
}
