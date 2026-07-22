class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String vowel = "aeiou";

        for (char c : my_string.toCharArray()) {
            if (vowel.indexOf(c) == -1) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}