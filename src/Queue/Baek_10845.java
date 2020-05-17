package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baek_10845 {
    //TODO 다시풀어보기
    public static void main(String[] args) {
        int b=0;
        Queue<Integer> queue = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        while (cnt-- > 0) {

            String a = sc.next();
            if(a.equals("push")) {
                b = sc.nextInt();
                queue.add(b);
            }else if(a.equals("front")){
                System.out.println(queue.isEmpty()?-1:queue.peek());
            }else if(a.equals("back")) {
                System.out.println(queue.isEmpty()?-1:b);
            }else if(a.equals("size")) {
                System.out.println(queue.size());
            }else if(a.equals("pop")) {
                System.out.println(queue.isEmpty()?-1:queue.poll());
            }else if(a.equals("empty")) {
                System.out.println(queue.isEmpty()?1:0);
            }
        }
        sc.close();
    }
}
