import java.util.*;

class Programmers_42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String compPlayer : completion) {
            map.put(compPlayer, map.get(compPlayer) - 1);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }
      
        
        return answer;
    }
}
