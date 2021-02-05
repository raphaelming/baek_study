class Programmers_12933 {
    public long solution(long n) {
        
        long answer = 0;
        for(int i = 9; i >= 0; i--) {
            long temp = n;
            while (temp > 0) {
                long digit = temp % 10;
                if (digit == i) {
                    answer = answer * 10 + digit % 10;
                }
                temp /= 10;
            } 
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_12933 solution = new Programmers_12933();
        int n = 118372;
        solution.solution(n);
    }
}
