import java.util.*;

class Programmers_68644 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] answer = {};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if(result.indexOf(sum) == -1) {
                    result.add(sum);
                }
            }
        }
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        Arrays.sort(answer);
        // answer = result.stream()
        //                 .sorted()
        //                 .mapToInt(i->i)
        //                 .toArray();
        return answer;
    }
}
