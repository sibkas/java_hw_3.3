public class Main {
    public static void main(String[] args) {

        int credit = 1_000_000; // сумма кредита
        double bid = 9.99; // процентная ставка


        CreditPaymentService service = new CreditPaymentService();

        int payment1 = service.calculate(credit, bid, 1);
        System.out.println("Срок 1 год: ежемесячный платёж = " + payment1 + " рублей");

        int payment2 = service.calculate(credit, bid, 2);
        System.out.println("Срок 2 года: ежемесячный платёж = " + payment2 + " рублей");

        int payment3 = service.calculate(credit, bid, 3);
        System.out.println("Срок 3 года: ежемесячный платёж = " + payment3 + " рублей");
    }
}