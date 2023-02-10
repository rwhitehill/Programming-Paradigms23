public class Mortgage_Calculator {

    // constant fields for class (for calculation)  
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100; 
    
    // function for total mortgage calculation
    public static double calculateMortgage(Mortgage obj) {
        int principal = obj.get_principal();
        float monthlyInterest = obj.get_annualInterest() / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = obj.get_years() * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }
    
    // function for balance remaining on mortgage
    public static double calculateBalance(Mortgage obj, short numberOfPaymentsMade) {
        int principal = obj.get_principal();
        float monthlyInterest = obj.get_annualInterest() / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = obj.get_years() * MONTHS_IN_YEAR;

        double balance = principal * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return balance;
    }

}
