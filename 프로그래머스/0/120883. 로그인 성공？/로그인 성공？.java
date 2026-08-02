class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String password = id_pw[1];
        
        for(String[] data : db) {
            if(data[0].equals(id) && data[1].equals(password)) {
                return "login";
            }
            if(data[0].equals(id)) {
                return "wrong pw";
            }
        }
        return "fail";
    }
}