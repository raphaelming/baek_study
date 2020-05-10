package Stack;

import java.io.*;
import java.util.Stack;

public class Baek_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    while (!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else {
                    stack.push(s.charAt(j));
                }
            }
            while (!stack.empty()) {
                sb.append(stack.pop());
            }
            bw.write(sb.toString());
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
