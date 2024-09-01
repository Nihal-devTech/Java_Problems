import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

class words {
    public String wordname;
    public String meaning;

    // parameterized ctor
    words(String wordname, String meaning) {
        this.wordname = wordname;
        this.meaning = meaning;
    }
}

class dictionary {
    public HashMap<String, words> map = new HashMap<String, words>();

    public void loadRecords() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"));
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            String[] parsedLineStrings = line.split(",");
            String wordname = parsedLineStrings[0];
            String meaning = parsedLineStrings[1];

            words word = new words(wordname, meaning);

            this.map.put(wordname, word);
        }
        br.close();
    }

    public String findword(String word) {
        for (String i : map.keySet()) {
            if (i.equals(word)) {
                words newword = map.get(i);
                return newword.meaning;
            }
        }
        return null;
    }

    public void saveRecords() throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("newdictionary.txt"));
        for (String i : map.keySet()) {
            words w = map.get(i);
            bw.write(w.wordname);
            bw.write(",");
            bw.write(w.meaning);
            bw.write("\n");
        }
        bw.close();
    }
}

public class driver {
    public static void main(String[] args) {
        dictionary obj = new dictionary();
        try {
            obj.loadRecords();

            // Give the word of which you want the meaning (run, snooze)
            System.out.println(obj.findword("snooze"));

            obj.saveRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
