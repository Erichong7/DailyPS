import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    private final List<Person> people = new ArrayList<>();

    public int solution(String[] friends, String[] gifts) {
        for(String person : friends) {
            people.add(new Person(person));
        }
        for(String gift : gifts) {
            String[] names = gift.split(" ");
            Person give = findByName(names[0]);
            Person take = findByName(names[1]);
            give.give(take);
        }

        for(int i = 0; i < people.size() - 1; i++) {
            Person a = people.get(i);
            for(int j = i + 1; j < people.size(); j++) {
                Person b = people.get(j);
                if(a.get(b) > b.get(a)) { // a가 b한테 선물을 더 받은 경우
                    b.next++;
                } else if(a.get(b) < b.get(a)) { // b가 a한테 선물을 더 받은 경우
                    a.next++;
                } else { // 주고 받은 선물이 같거나 없는 경우
                    if(a.giftScore > b.giftScore) { // a의 선물지수가 더 큰 경우
                        a.next++;
                    } else if(a.giftScore < b.giftScore) {
                        b.next++;
                    }
                }
            }
        }

        int answer = 0;
        for (Person person : people) {
            if(person.next > answer) {
                answer = person.next;
            }
        }


        return answer;
    }

    public Person findByName(String name) {
        for(Person person : people) {
            if(person.name.equals(name)) {
                return person;
            }
        }
        return null;
    }
}

class Person {

    String name;
    Map<String, Integer> give = new HashMap<>(); // 준 선물
    Map<String, Integer> take = new HashMap<>(); // 받은 선물
    int giftScore = 0;
    int next = 0;

    public Person(String name) {
        this.name = name;
    }

    public void give(Person other) { // other에게 준 선물 개수 추가
        give.put(other.name, give.getOrDefault(other.name, 0) + 1);
        giftScore++;
        other.take.put(name, other.take.getOrDefault(name, 0) + 1);
        other.giftScore--;
    }

    public int get(Person other) { // other에게 받은 선물 개수
        return take.getOrDefault(other.name, 0);
    }
}