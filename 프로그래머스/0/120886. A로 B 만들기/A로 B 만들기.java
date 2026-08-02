import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String before, String after) {

        String[] bArr = before.split("");
        String[] aArr = after.split("");

        Map<String, Integer> b = new HashMap<>();
        Map<String, Integer> a = new HashMap<>();

        for (int i = 0; i < before.length(); i++) {
            b.put(bArr[i], b.getOrDefault(bArr[i], 0) + 1);
            a.put(aArr[i], a.getOrDefault(aArr[i], 0) + 1);
        }
        if(a.equals(b)) {
            return 1;
        }
        
        return 0;
    }
}