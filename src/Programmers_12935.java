import java.util.Arrays;


public class Programmers_12935 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length > 1) {
            final int minValue = Arrays.stream(arr).min().getAsInt();
            answer = Arrays.stream(arr).filter(n -> n != minValue).toArray();

            // answer = Arrays.stream(arr).boxed().sorted((o1, o2) -> o2 - o1).mapToInt(Integer::intValue).limit(arr.length - 1).toArray();
        } else {
            answer = new int[]{-1};
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        Programmers_12935 solution = new Programmers_12935();

        int[] arr = {3, 4, 5, 6, 1, 2, 7, 9, 10};
        solution.solution(arr);
    }
}
