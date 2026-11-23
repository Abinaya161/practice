import java.util.*;

public class tree {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("grapes");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("strawberry");
        System.out.println(fruits);

        System.out.println(fruits.contains("banana"));
        System.out.println(fruits.contains("mango"));
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.remove("apple"));
    }
}
