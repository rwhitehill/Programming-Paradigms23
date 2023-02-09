public class Mortgage {
    
    // constant fields for class (for calculations)
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    // private fields to specify mortgage parameters
    private int principal;
    private float annualInterest;
    private byte years;

    // private fields once mortgage parameters are known
    private float monthlyInterest;
    private int numberOfPayments;
    private double mortgage;

    public Mortgage() {
        Console console = new Console();
        principal = console.readNumber();
        set_principal();
        set_annualInterest();
        set_years();

        // mortgage = calcuulateMortgage();
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max) {
                break;
            System.out.println("Enter a value between " + min + " and " + max);
            }
        }
        return value;
    }

    // public void printMortgage() {
    //     String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    //     System.out.println();
    //     System.out.println("MORTGAGE");
    //     System.out.println("--------");
    //     System.out.println("Monthly Payments: " + mortgageFormatted);
    // }

    // public static void printPaymentSchedule() {
    //     System.out.println();
    //     System.out.println("PAYMENT SCHEDULE");
    //     System.out.println("----------------");
    //     for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
    //         double balance = calculateBalance(month);
    //         System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    //     }
    // }

    public void set_principal() {
        principal = (int) Console().readNumber("Principal: ", 1_000, 1_000_000);
    }

    // public void set_annualInterest() {
    //     annualInterest = (float) Console().readNumber("Annual Interest Rate: ", 1, 30);
    //     monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; 
    // }

    // public void set_years() {
    //     years = (byte) Console().readNumber("Period (years): ", 1, 30);
    //     numberOfPayments = years * MONTHS_IN_YEAR;
    // }

    // public int get_principal() { return principal; } 
    // public float get_annualInterest() {return annualInterest; }
    // public byte get_years() { return years; }

    public double calculateBalance(short numberOfPaymentsMade) {
        double balance = principal * (Math.pow(1 + monthlyInterest,numberOfPayments) - Math.pow(1 + monthlyInterest,numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {
        return ( principal * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments)) / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1) );
    }

}
