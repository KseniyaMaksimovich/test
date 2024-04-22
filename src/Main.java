import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite pervoe chislo: ");
        int operand1 = scanner.nextInt();

        System.out.print("Vvedite vtoroe chislo: ");
        int operand2 = scanner.nextInt();

        System.out.print("Vvedite operaciu: ");
        String operation = scanner.nextLine();
        operation = scanner.nextLine();

        switch (operation) {
            case "+":
                int result1 = operand1 + operand2;
                System.out.println("Resultat slozeniya: " + result1);
                break;
            case "-":
                int result2 = operand1 - operand2;
                System.out.println("Resultat raznicy: " + result2);
                break;
            case "*":
                int result3 = operand1 * operand2;
                System.out.println("Resultat umnozeniya: " + result3);
                break;
            case "/":
                int result4 = operand1 / operand2;
                System.out.println("Resultat deleniya: " + result4);
                break;
            default:
                System.out.println("Oshibka++");
                return;

        }
        scanner.close();
    }
}