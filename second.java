
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //when we use .next then only one input word will be printed.
        String name = sc.nextLine();
        // but when we use .nextLine whole line wil printed.
        System.out.println(name);
    }
    
}
