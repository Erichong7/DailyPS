import java.util.*;

class Solution {

    private final Map<String, String> userRepository = new HashMap<>();
    private final List<Event> events = new ArrayList<>();

    public String[] solution(String[] record) {

        for (String r : record) {
            String[] element = r.split(" ");
            String command = element[0];
            String userId = element[1];

            if (command.equals("Enter")) {
                events.add(new Event(command, userId));
                userRepository.put(userId, element[2]);
            } else if (command.equals("Leave")) {
                events.add(new Event(command, userId));
            } else { // Change
                userRepository.put(userId, element[2]);
            }
        }

        String[] answer = new String[events.size()];
        int idx = 0;
        for(Event event : events) {
            StringBuilder sb = new StringBuilder();
            String nickName = userRepository.get(event.userId());
            String command = event.command();

            sb.append(nickName);
            if(command.equals("Enter")) {
                sb.append("님이 들어왔습니다.");
            } else {
                sb.append("님이 나갔습니다.");
            }
            answer[idx++] = sb.toString();
        }

        return answer;
    }
}

record Event(String command, String userId) { }