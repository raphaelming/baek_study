

class Programmers_42862 {


    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        int[] student = new int[n];
        for (int r : reserve) 
            student[r-1]++;
        for (int l : lost)
            student[l-1]--;
        int index = 0;
        for (int stat : student) {
            if (stat == -1) {
                if (index - 1 >= 0 && student[index-1] == 1) {
                    student[index]++;
                    student[index-1]--;
                } else if (index + 1 <student.length && student[index + 1] == 1) {
                    student[index]++;
                    student[index+1]--;
                } else {
                    answer--;
                }
            } 
            index++;
        }

        

        
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        solution2.solution(n, lost, reserve);
    }
}
