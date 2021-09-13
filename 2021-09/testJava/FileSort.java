package testJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class FileSort {

    class File {
        private String head;
        private Integer number;
        private String fileName;

        public String getHead() {
            return head;
        }
        public Integer getNumber() {
            return number;
        }
        public String getFileName() {
            return fileName;
        }
        
        public File(String head, Integer number, String fileName) {
            this.head = head;
            this.number = number;
            this.fileName = fileName;
        }
    }
    
    public String[] solution(String[] files) {
        List<File> fileList = new ArrayList<>();
        Pattern pattern = Pattern.compile("(^[A-Za-z][A-Za-z\\s-\\.]+)([0-9]{1,5})");

        for(var i = 0; i < files.length; i++) {
            Matcher match = pattern.matcher(files[i]);
            while(match.find()) {
                var file = new File(match.group(1).toLowerCase(), Integer.parseInt(match.group(2)), files[i]);
                fileList.add(file);
            }
        }

        Collections.sort(fileList, new Comparator<File>() {
            public int compare(File a, File b) {
                int nameCompare = a.getHead().compareToIgnoreCase(b.getHead());
                if(nameCompare != 0) {
                    return nameCompare;
                }
                else {
                    if(a.getNumber() > b.getNumber()) {
                        return 1;
                    }
                    else if(a.getNumber() < b.getNumber()) {
                        return -1;
                    }
                    return 0;
                }
            }
        });
        
        String[] answer = new String[fileList.size()];
        for(int i = 0; i < fileList.size(); i++) {
            answer[i] = fileList.get(i).getFileName();
        }

        return answer;
    }

    public static void main(String[] args) {
        FileSort solution = new FileSort();
        String[] test = new String[] {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

        solution.solution(test);
    }
}
