public class Programmers_12948 {
    public String solution(String phone_number) {
        String answer = phone_number.replaceAll(".(?=.{4})", "*");
        
        return answer;
    }


}
