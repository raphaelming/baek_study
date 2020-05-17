package Stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            leftStack.push(input.charAt(i));
        }
        int command = Integer.parseInt(br.readLine());
        while (command-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String inputCommand = st.nextToken();
            switch (inputCommand) {
                case "L":
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.peek());
                        leftStack.pop();
                    }
                    break;
                case "D":
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.peek());
                        rightStack.pop();
                    }
                    break;
                case "B":
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                case "P":
                    leftStack.push(st.nextToken().charAt(0));
                    break;
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.peek());
            leftStack.pop();
        }
        while (!rightStack.isEmpty()) {
            bw.append(rightStack.pop());
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
