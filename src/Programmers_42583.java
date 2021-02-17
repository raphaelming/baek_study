import java.util.LinkedList;
import java.util.Queue;

class Programmers_42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int mWeight = 0;
        for (int w : truck_weights) {
            while(true) {
                if (q.isEmpty()) {
                    q.offer(w);
                    mWeight += w;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    mWeight -= q.poll();
                } else {
                    if (mWeight + w > weight) {
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(w);
                        mWeight += w;
                        answer++;
                        break;
                    }
                }
            }
        }
        answer += bridge_length;
        return answer;
    }
}
