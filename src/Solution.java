import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferFileName = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferFileName.readLine();
        bufferFileName.close();

        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            char currentChar;
            while (reader.ready()) {
                currentChar = (char) reader.read();
                text.append(currentChar);

            }
        }

        String s = text.toString();
        String[] words = s.split( "[\\p{P} ]");
        int count = 0;
        for(String word:words){
            if(word.equalsIgnoreCase("world")){
                count++;
            }
        }
        System.out.println(count);
    }
}
