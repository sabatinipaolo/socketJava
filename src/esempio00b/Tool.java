import java.util.Scanner;
public class Tool {
    private final static Scanner s = new Scanner(System.in);
    public static void pressEnterKeyToContinue(String str )
    {
        System.out.println(str);
        s.nextLine();

    }
}