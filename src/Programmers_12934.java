

/**
 * Programmers 12934
 */

public class Programmers_12934 {
    public long solution(long n) {
  
        return (int)Math.sqrt(n) == Math.sqrt(n) ? (long)(Math.pow(Math.sqrt(n) + 1, 2)): -1;

    }

    public static void main(String[] args) {
        Programmers_12934 solution = new Programmers_12934();
        long n = 121;

        System.out.println(solution.solution(n));
    }
}
