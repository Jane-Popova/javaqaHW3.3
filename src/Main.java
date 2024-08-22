public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1000000;
        int loanTermYear1 = 1;
        int loanTermYear2 = 2;
        int loanTermYear3 = 3;
        double interestRateYear = 9.99;

        int annuityPayment1 = service.calculate(loanAmount, loanTermYear1, interestRateYear);
        System.out.println("Ежемесячный платёж: " + annuityPayment1 + " руб (Срок кредита: " + loanTermYear1 + " год. Сумма кредита: " + loanAmount + " руб)");

        int annuityPayment2 = service.calculate(loanAmount, loanTermYear2, interestRateYear);
        System.out.println("Ежемесячный платёж: " + annuityPayment2 + " руб (Срок кредита: " + loanTermYear2 + " года. Сумма кредита: " + loanAmount + " руб)");

        int annuityPayment3 = service.calculate(loanAmount, loanTermYear3, interestRateYear);
        System.out.println("Ежемесячный платёж: " + annuityPayment3 + " руб (Срок кредита: " + loanTermYear3 + " года. Сумма кредита: " + loanAmount + " руб)");
    }
}

