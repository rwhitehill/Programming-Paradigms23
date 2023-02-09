public class Main {

    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        Mortgage_Report mortgage_report = new Mortgage_Report();

        mortgage_report.printMortgage(mortgage);
        mortgage_report.printPaymentSchedule(mortgage);
    }

}
