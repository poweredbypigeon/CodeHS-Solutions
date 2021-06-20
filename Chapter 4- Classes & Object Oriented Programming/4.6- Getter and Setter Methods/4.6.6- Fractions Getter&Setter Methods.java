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
}
