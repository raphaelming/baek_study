package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int m = 1;
        int[] input = new int[testCase];
        boolean isAble = true;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < testCase; i++) {
            input[i] = Integer.parseInt(br.readLine());
            if (isAble) {
                if (m <= input[i]) {
                    while (m <= input[i]) {
                        stack.push(m++);
                        sb.append("+ \n");
                    }
                }
                if(stack.isEmpty()) isAble = false;
                else {
                    while (stack.peek() >= input[i]) {
                        stack.pop();
                        sb.append("- \n");
                        if(stack.isEmpty()) {
                            break;
                        }
                    }
                }
            }
        }
        br.close();
        if (isAble) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
