import java.util.*;
import java.util.stream.IntStream;
class Programmers_12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> aw = new ArrayList<>();
       
        
        for (int num : arr) {
            if (num % divisor == 0) {
                aw.add(num);
            }
        }
        
        if (aw.size() != 0) {
            int index = 0;
            answer = new int[aw.size()];
            for (int num : aw) {
                answer[index++] = num;
            }
            Arrays.sort(answer);
            return answer;
        } else {
            
            answer = new int[]{-1};
            return answer;
        }
         // answer = Arrays.stream(arr).filter(num -> num % divisor == 0).sorted().toArray();
        // answer = aw.stream().mapToInt(i -> i).sorted().toArray();
        
        
        // Arrays.sort(answer);
//         for (int num : arr) {
//             if (num % divisor == 0) {
//                 answer = Arrays.copyOf(answer, answer.length + 1);
//                 answer[answer.length - 1] = num;
//             }
//         }
        
        
        
//         Arrays.sort(answer);
        
        
        
        
    }
}
