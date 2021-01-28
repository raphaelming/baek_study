

public class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        return s.chars().filter(ch -> ch == 'P').count() == s.chars().filter(ch -> ch == 'Y').count();
    }

    public static void main(String[] args) {
        Solution solution = new Solution3();
        String s = "aaa";
        System.out.println(solution.solution(s));
        solution.solution(s);
    }
}
