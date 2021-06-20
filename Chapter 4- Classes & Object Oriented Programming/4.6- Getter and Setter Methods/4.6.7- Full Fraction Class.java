public class Fraction
{
    private int num;
    private int dem;
    public Fraction (int n1, int n2) {
        num = n1;
        dem = n2;
    }
    public int getNumerator() {
        return num;
    }
    public int getDenominator() {
        return dem;
    }
    public void setNumerator(int x) {
        num = x;
    }
    public void setDenominator(int x) {
        dem = x;
    }
    
    public void add(Fraction other) {
        int num2 = other.getNumerator();
        int dem2 = other.getDenominator();
        int num1 = (num * dem2) + (num2 * dem);
        int dem1 = dem*dem2;
        num = num1;
        dem = dem1;
    }
    
    public void subtract(Fraction other) {
        int num2 = other.getNumerator();
        int dem2 = other.getDenominator();
        int num1 = (num * dem2) - (num2 * dem);
        int dem1 = dem*dem2;
        num = num1;
        dem = dem1;
        // IMPLEMENT THIS METHOD
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        num = num * other.getNumerator();
        dem = dem * other.getDenominator();
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return num + " / " + dem;
    }
}
