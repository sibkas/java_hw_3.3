public class CreditPaymentService {
    public int calculate(int credit, double bid, int years) {

        double monthlyRate = bid / 100 / 12; // месячная ставка
        int mounths = years * 12; // месяцев в году
        double numerator = monthlyRate * Math.pow((1 + monthlyRate), mounths); // числитель формулы "Коэффициент аннуитета"
        double denominator = Math.pow((1 + monthlyRate), mounths) - 1; // знаменатель формулы "Коэффициент аннуитета"
        double coefficient = numerator / denominator; // коэффициент аннуитета
        double monthPay = credit * coefficient;
        return (int) Math.round(monthPay); // округляем до целого
    }

}
