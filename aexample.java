import java.util.*;

public class aexample {
    public static void main(String[] args) {
        /*
         * int[] numbers;
         * numbers = new int[5];
         * numbers[0] = 4;
         * numbers[1] = 2;
         * numbers[2] = 3;
         * numbers[3] = 4;
         * numbers[4] = 5;
         */

        int[] numbers = { 1, 2, 3, 4, 5 };
        TreeSet<Integer> newset = new TreeSet<>(Collections.reverseOrder());

        // newset.addAll(Arrays.asList(numbers));
        newset.add(1);
        newset.add(2);
        newset.add(3);
        newset.add(4);
        newset.add(5);
        ArrayList<Integer> list1 = new ArrayList<>(newset);
        System.out.println(list1.get(3));
    }
}
