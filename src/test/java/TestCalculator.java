import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class TestCalculator {
    Random random = new Random();

    @Test
    public void monthlyPayment() {
        Calculator calculator = new Calculator();
        int var1 = random.nextInt(); // общая сумма
        double var2 = random.nextInt(); // месяцев
        double sumResult = calculator.addition(var1, var2);
        assertTrue("Неверное деление  " + var1 + " и " + var2, var1 / var2 == sumResult);
    }

    @Test
    public void totalRefundAmount() {
        Calculator calculator = new Calculator();
        int var1 = random.nextInt(); // ежемесячный платёж
        int var2 = random.nextInt(); // мясяцев
        int subResult = calculator.multiplication(var1, var2);
        assertTrue("Неверное умножение  " + var1 + " и " + var2, var1 * var2 == subResult);
    }

    @Test
    public void overpayments() {
        Calculator calculator = new Calculator();
        int var1 = random.nextInt(); // месяцев
        int var2 = random.nextInt(); // ежемесячный платёж
        double var3 = random.nextInt(); // ставка
        double sudResult = calculator.multiplicationAll(var1, var2, var3);
        assertTrue("Неверное перемножение  " + var1 + " и " + var2 + " и " + var3, var3 * var2 * var1 == sudResult);
    }
}