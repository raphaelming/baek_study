public class Programmers_12943 {
    public int solution(int num) {
        int answer = 0;
        final int MAX_SIZE = 500;
        long n = num;
        while(answer < MAX_SIZE) {
            if (n == 1) {
                return answer;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            answer++;
        }
     
        return -1;
    }

}
