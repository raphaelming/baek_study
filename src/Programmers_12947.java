
// programmers 12947

public class Programmers_12947 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int num = x;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

}
