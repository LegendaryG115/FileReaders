import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/*
public class WordCount {
    public static void main(String[] args) throws Exception {
        String line;
        int count = 0;


        FileReader file = new FileReader("fixedFile.txt");
        BufferedReader br = new BufferedReader(file);


        while((line = br.readLine()) != null) {

            String words[] = line.split(" ");

            count = count + words.length;
        }

        System.out.println("Number of words present in given file: " + count);
        br.close();
    }
}
*/
public class WordCount {
    public static void main(String[] args) throws IOException {
        int count = 0;
        String story = new String();
        File germsFile = new File("fixedFile.txt");
        FileReader words = new FileReader(germsFile);
        char[] bytes = new char[(int) germsFile.length()];
        words.read(bytes);
        String together = new String(bytes);
        String[] wordArray = together.split(" ");


        for (int i = 0; i < wordArray.length; i++) {
            count++;
            story += wordArray[i] + " ";
        }
        for (int i = 0; i < wordArray.length; i++) {
        }
        System.out.println(story.toUpperCase());
        System.out.println('\n' + "Number of words present in the given file: " + count + " ");
    }
}
