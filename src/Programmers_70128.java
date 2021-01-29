import java.util.stream.IntStream;

class Programmers_70128 {
    public int solution(int[] a, int[] b) {
       
        return IntStream.range(0, a.length).reduce(0, (sum, i) -> sum += a[i] * b[i]);
    }
}
