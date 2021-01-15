import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int col = commands.length;
        int row = 0;
        int index = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        answer = new int[col];
        while(index <= col-1) {
            i = commands[index][row];
            j = commands[index][row+1];
            k = commands[index][row+2];
 
        
            int[] splitArray = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(splitArray);
            answer[index] += splitArray[k - 1]; 
            index++;
        }
        
        return answer;
    }
}
