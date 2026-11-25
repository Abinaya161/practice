import java.util.*;

public class map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "grapes");
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.size());
        System.out.println(map.remove(3));
        System.out.println(map);
        System.out.println(map.remove(4));
        System.out.println(map);

    }
}
