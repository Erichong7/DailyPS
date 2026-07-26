import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<String> set = new LinkedHashSet<>(Arrays.asList(my_string.split("")));
        set.forEach(answer::append);
        return answer.toString();
    }
}