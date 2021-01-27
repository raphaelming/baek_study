
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        int tempNum = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            if (num != tempNum) {
                result.add(num);
                tempNum = num;
            }
        }
        
        // for (int num : arr) {
        //     if (num != tempNum) {
        //         answer = Arrays.copyOf(answer, index + 1);
        //         answer[answer.length - 1] = num;
        //         index++;
        //         tempNum = num;
        //     }
        // }  
        answer = new int[result.size()];
        int index = 0;
        for (int num : result) {
            answer[index++] = num;
        }   
        
        //answer = result.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(index);

            
        

        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] test1 = new int[]{1, 1,  2, 3, 3, 0, 1, 1, 2};
        int[] test1 = new int[]{1, 1, 1, 1, 4, 10};
        int[] test2 = new int[]{};
        test2 = solution.solution(test1);
        System.out.println(Arrays.toString(test2));
    }
}

