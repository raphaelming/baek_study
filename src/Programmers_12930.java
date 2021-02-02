/**
다시 풀 것
*/
public class Programmers_12930 {
    public String solution(String s) {
        String answer = "";
        StringBuilder result = new StringBuilder(s);
        int count = 0;

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == ' ') {
                count = 0;
            } else {
                count++;
                if (count % 2 != 0) {
                    result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
                } else {
                    result.setCharAt(i, Character.toLowerCase(result.charAt(i)));
                }
            }
            
        }
        answer = result.toString();
        return answer;
    }
