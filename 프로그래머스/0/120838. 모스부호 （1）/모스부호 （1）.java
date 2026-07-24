class Solution {
    public String solution(String letter) {
        String[][] morse = {
                {".-", "a"}, {"-...", "b"}, {"-.-.", "c"}, {"-..", "d"}, {".", "e"},
                {"..-.", "f"}, {"--.", "g"}, {"....", "h"}, {"..", "i"}, {".---", "j"},
                {"-.-", "k"}, {".-..", "l"}, {"--", "m"}, {"-.", "n"}, {"---", "o"},
                {".--.", "p"}, {"--.-", "q"}, {".-.", "r"}, {"...", "s"}, {"-", "t"},
                {"..-", "u"}, {"...-", "v"}, {".--", "w"}, {"-..-", "x"}, {"-.--", "y"},
                {"--..", "z"}
        };
        StringBuilder sb = new StringBuilder();
        String[] targets = letter.split(" ");
        
        for(String target : targets) {
            for(String[] pair : morse) {
                if(pair[0].equals(target)) {
                    sb.append(pair[1]);
                    break;
                }
            }
        }
        
        return sb.toString();
    }
}