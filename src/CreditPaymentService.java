public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTermYear, double interestRateYear) {

        int loanTermMonth = loanTermYear * 12;
        double interestRateMonth = interestRateYear / 12 / 100;

        double annuityFactor = (interestRateMonth * Math.pow((1 + interestRateMonth), loanTermMonth) / (Math.pow((1 + interestRateMonth), loanTermMonth) - 1));
        double annuityPayment = loanAmount * annuityFactor;
        return (int) annuityPayment;
    }
}
