class Solution {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int[] term = { 0, 0 };
        String[] str = polynomial.split(" \\+ ");
        for(String s : str) {
            if(s.contains("x")) {
                term[0] += s.equals("x") ? 1 : Integer.parseInt(s.replace("x", ""));
            } else {
                term[1] += Integer.parseInt(s);
            }
        }

        if (term[0] != 0) {
            answer.append(term[0] == 1 ? "x" : term[0] + "x");
        }
        if (term[1] != 0) {
            if (!answer.isEmpty()) answer.append(" + ");
            answer.append(term[1]);
        }

        return answer.toString();
    }
}