import java.util.*;

public class Programmers_12917 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        //Arrays.sort(str, Collections.reverseOrder());
        Collections.reverse(Arrays.asList(str));
        answer = String.join("", str);
        return answer;
    }


}
