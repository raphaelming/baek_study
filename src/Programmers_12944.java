import java.util.Arrays;


// Programmers 12944
public class Programmers_12944 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }

   
}
