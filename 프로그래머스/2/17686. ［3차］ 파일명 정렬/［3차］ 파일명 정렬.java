import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        ArrayList<File> fileArr = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            fileArr.add(encoding(i, files[i]));
        }
        Collections.sort(fileArr);

        for (int i = 0; i < fileArr.size(); i++) {
            answer[i] = decoding(fileArr.get(i));
        }
        return answer;
    }

    public File encoding(int num, String file) {
        boolean isHead = true;
        boolean isTail = false;
        StringBuilder head = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder tail = new StringBuilder();

        for (char c : file.toCharArray()) {
            if (isTail) {
                tail.append(c);
            } else if (c >= '0' && c <= '9') {
                isHead = false;
                number.append(c);
            } else if (isHead) {
                head.append(c);
            } else {
                isTail = true;
                tail.append(c);
            }
        }
        return new File(num, head.toString(), number.toString(), tail.toString());
    }

    public String decoding(File file) {
        return file.head + file.number + file.tail;
    }
}

class File implements Comparable<File> {

    int num = 0;
    String head;
    String number;
    String tail;

    public File(int num, String head, String number, String tail) {
        this.num = num;
        this.head = head;
        this.number = number;
        this.tail = tail;
    }

    @Override
    public int compareTo(File that) {
        if (this.head.equalsIgnoreCase(that.head)) {
            if (Integer.parseInt(this.number) == Integer.parseInt(that.number)) {
                return this.num - that.num;
            } else {
                return Integer.parseInt(this.number) - Integer.parseInt(that.number);
            }
        }
        return this.head.compareToIgnoreCase(that.head);
    }
}