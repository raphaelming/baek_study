import java.util.*;
import java.util.stream.IntStream;
class Programmers_12901 {
    public String solution(int a, int b) {
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] daysPerMonth ={31,29,31,30,31,30,31,31,30,31,30,31};
        String answer = "";
        int totalDay = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDay += daysPerMonth[i];
        }

        totalDay += b;
        // int totalDay = Arrays.stream(daysPerMonth, 0, a-1).reduce(0, Integer::sum) + b;
        
        answer = days[totalDay % 7];
        return answer;
    }
}
