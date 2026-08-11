import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pattern = Pattern.compile("^(\\D*)(\\d+)(.*)");
        Matcher matcher = pattern.matcher(file);
        if (matcher.matches()) {
            String head = matcher.group(1);
            String number = matcher.group(2);
            String tail = matcher.group(3);
            return new File(num, head, number, tail);
        } else {
            throw new RuntimeException("잘못된 파일 형식입니다.");
        }
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