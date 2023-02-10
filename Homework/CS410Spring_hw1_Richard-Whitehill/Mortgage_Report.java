import java.text.NumberFormat;

public class Mortgage_Report {

    // constant fields for class
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    
    // function to print total mortgage
    public static void printMortgage(Mortgage obj) {
        Mortgage_Calculator mortgage_calculator = new Mortgage_Calculator();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage_calculator.calculateMortgage(obj));
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    // function to print schedule of remaining balance by month
    // until no payment is left
    public static void printPaymentSchedule(Mortgage obj) {
        Mortgage_Calculator mortgage_calculator = new Mortgage_Calculator();
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= obj.get_years() * MONTHS_IN_YEAR; month++) {
            double balance = mortgage_calculator.calculateBalance(obj,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

}
