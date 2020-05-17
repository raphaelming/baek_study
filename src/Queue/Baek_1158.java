package Queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Baek_1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] splitInput = input.split(" ");
        int N = Integer.parseInt(splitInput[0]);
        int K = Integer.parseInt(splitInput[1]);

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!queue.isEmpty()) {
            for (int j = 1; j <= K; j++) {
                if (j != K) {
                    queue.offer(queue.poll());
                } else {
                    sb.append(queue.poll());
                    sb.append(", ");
                }
            }
        }
        String tmp = sb.substring(0, sb.length() -2);
        sb = new StringBuilder(tmp);
        sb.append(">");
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
