class Solution {
    public String solution(int n) {
        String answer = "";
        String watermelon = "수박";
        if (n % 2 == 0) {
            answer = watermelon.repeat(n / 2);
        } else {
            answer = watermelon.repeat(n / 2) + "수";
        }
        System.out.println(answer);
        return answer;
    }
}
