public class Mortgage {

    // private fields to specify mortgage parameters
    private int principal;
    private float annualInterest;
    private byte years;

    public Mortgage() {
        Console console = new Console();
        set_principal((int) console.readNumber("Principal: ", 1_000, 1_000_000));
        set_annualInterest((float) console.readNumber("Annual Interest Rate: ", 1, 30));
        set_years((byte) console.readNumber("Period (years): ", 1, 30));
    }

    public Mortgage(int principal, float annualInterest, int years) {
        set_principal(principal);
        set_annualInterest(annualInterest);
        set_years((byte) years);
    }

    public int get_principal() { return principal; }
    public float get_annualInterest() { return annualInterest; }
    public byte get_years() { return years; }

    public void set_principal(int principal) { this.principal = principal; }
    public void set_annualInterest(float annualInterest) { this.annualInterest = annualInterest; }
    public void set_years(byte years) { this.years = years; }

}
