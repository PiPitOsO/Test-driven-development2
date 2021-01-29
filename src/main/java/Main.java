import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("\nРазработка через тестирование");
        while (true) {
            System.out.println("\nВыбирете что будем делать:"
                    + "\n1) Рассчет месячного платежа"
                    + "\n2) Рассчет общей суммы к возврату в банк"
                    + "\n3) Рассчет переплаты за весь период");
            int menu = scanner.nextInt();

            switch (menu) {
                case (1):
                    System.out.println("Рассчет месячного платежа"
                            + "\nВведите общую сумму кредита:");
                    int var1 = scanner.nextInt();
                    System.out.println("Введите переуд(в годах):");
                    double var2 = scanner.nextInt() * 12;

                    double number1 = calculator.addition(var1, var2);
                    System.out.printf("В месяц платить по %.2fр.\n", number1);
                    break;
                case (2):
                    System.out.println("Рассчет общей суммы к возврату в банк"
                            + "\nВведите ежемесечный платёж:");
                    int war1 = scanner.nextInt();
                    System.out.println("Введите переуд(в годах):");
                    int war2 = scanner.nextInt() * 12;

                    int number2 = calculator.multiplication(war1, war2);
                    System.out.println("Общая сумма(без процентов): " + number2 + "р.");
                    break;
                case (3):
                    System.out.println("Рассчет общей суммы к возврату в банк"
                            + "\nВведите переуд(в годах):");
                    int sar1 = scanner.nextInt();
                    System.out.println("Введите ежемесечный платёж:");
                    int sar2 = scanner.nextInt() * 12;
                    System.out.println("Введите процентную ставку кредита(14 = 0,14):");
                    double sar3 = scanner.nextDouble();

                    double number3 = calculator.multiplicationAll(sar1, sar2, sar3);
                    System.out.printf("Общая сумма: %.2fр.\n", number3);
                    break;
            }

        }
    }
}