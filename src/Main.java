import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int var = 100;
        final int cons = 200;
        System.out.printf("변수 : %d\n", var);
        System.out.println("상수 : " + cons);

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        System.out.printf("입력 받은 값 : %d\n", num);
    }
}