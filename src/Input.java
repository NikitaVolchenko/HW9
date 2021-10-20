import java.util.Scanner;

public class Input {
    public int inputNumber() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        }
        return num;
    }
}
