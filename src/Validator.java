import java.util.Scanner;
public class Validator {
    public static int validInputNumber() {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        if (n.matches("-?\\d+")) { // any positive or negetive integer or not!
            return Integer.parseInt(n);
        }
        System.out.print("Not valid number, please provide valid number: ");
        return validInputNumber();
    }
}
