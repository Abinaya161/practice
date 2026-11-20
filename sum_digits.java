import java.util.*;

public class sum_digits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        while (num > 0) {
            int n = num % 10;
            sum = sum + n;
            System.out.println(sum);
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);

    }
}