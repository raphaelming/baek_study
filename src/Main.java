import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            boolean isVPS = true;
            char chkInput;

            for (int i = 0; i < input.length(); i++) {
                chkInput = input.charAt(i);
                if (chkInput == '(') {
                    stack.push(chkInput);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        isVPS = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) isVPS = false;

            if(isVPS) {
                bw.write("YES");
            }
            else {
                bw.write("NO");
            }
            bw.newLine();

        }
        br.close();
        bw.flush();
        bw.close();
    }
}
