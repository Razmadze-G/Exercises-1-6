import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // #1 Task - isPalindrome
        Scanner in = new Scanner(System.in);
        System.out.println("#1 Task - isPalindrome ");
        System.out.print("Please provide text: ");
        String inputString = in.nextLine();
        System.out.println("Answer: " + Palindrome.isPalindrome(inputString) + "\n");

        // #2 Task - Min amount of Coins
        System.out.println("#2 Task - minSplit");
        System.out.print("Please provide number: ");
        int change = Validator.validInputNumber();
        System.out.println("Answer: " + Coins.minSplit(change) + "\n");

        // #3 Task - notContains
        System.out.print("#3 Task - notContains\nAnswer: ");
        int[] tmp = {-2, -4, 1, 5, 2, 7};
        System.out.println(Contains.notContains(tmp) + "\n");

        // #4 Task - Parentheses
        System.out.print("#4 Task - Parentheses\nAnswer: ");
        System.out.println(Parentheses.isValid("()(()())((())())") + "\n");

        // #5 Task - StairWay
        System.out.println("#5 Task - StairWay");
        System.out.print("Please provide number: ");
        int stairs = Validator.validInputNumber();
        System.out.println("Answer: " + StairWay.countVariants(stairs) + "\n");

        // #6 Task - MyDataStructure
        System.out.println("#6 Task - MyDataStructure\n");
        MyDataStructure ds = new MyDataStructure();
        ds.add(10);
        ds.add(16);
        ds.add(22);
        ds.add(27);
        ds.add(36);
        System.out.println("My data structure before executing remove function: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(ds.get(i) + " ");
        }
        System.out.println("");
        ds.remove(27);
        System.out.println("My data structure after executing remove function: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(ds.get(i) + " ");
        }
    }
}
