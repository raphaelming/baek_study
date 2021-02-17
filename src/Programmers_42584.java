import java.util.Stack;

class Programmers_42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        int length = prices.length;
        for (int i = 0; i < length; i++) {
            while (!stack.empty() && prices[stack.peek()] > prices[i]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            answer[stack.peek()] = length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }
}
