import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int position = sc.nextInt();
        position--;

        System.out.println(input.charAt(position));
    }
}