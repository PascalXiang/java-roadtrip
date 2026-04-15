import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Go");

        for (String lang : languages) {
            System.out.println("Language: " + lang);
        }

        System.out.println("Size: " + languages.size());
    }
}