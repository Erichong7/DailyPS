import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<String, String> expiration = new HashMap<>();

        for (String term : terms) {
            String[] temp = term.split(" ");
            expiration.put(temp[0], temp[1]);
        }

        for (int i = 0; i < privacies.length; i++) {
            
            String[] temp = privacies[i].split(" ");
            String date = temp[0];
            String type = temp[1];
            
            int totalDate = getTotalDate(date);
            int period = Integer.parseInt(expiration.get(type));
            int expirationDate = totalDate + period * 28 - 1;
            int now = getTotalDate(today);
            
            if(expirationDate < now) {
                answer.add(i + 1);
            }
        }
        
        return answer;
    }

    public int getTotalDate(String date) {
        String[] each = date.split("\\.");
        int year = Integer.parseInt(each[0].substring(2));
        int month = Integer.parseInt(each[1]);
        int day = Integer.parseInt(each[2]);

        return (year * 12 + month) * 28 + day;
    }
}