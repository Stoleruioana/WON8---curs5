import java.util.Scanner;

public class MyFirstIntellij {
    public static void main(String[] args) {
        System.out.println("My first intellij");
        int sum = addNUmbers(1,3);
        System.out.println ("sum is" + sum);
        readAndPrint();

    }

    private static void readAndPrint() {
        Scanner scanner = new Scanner(System.in);
        String anyName = scanner.nextLine();

    }

    public static int addNUmbers(int a, int b) {
        return a + b;
    }
}

