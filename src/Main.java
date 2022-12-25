import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();

        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Hello");

        for (String element : stringSet) {
            System.out.println(element);
        }
    }
}