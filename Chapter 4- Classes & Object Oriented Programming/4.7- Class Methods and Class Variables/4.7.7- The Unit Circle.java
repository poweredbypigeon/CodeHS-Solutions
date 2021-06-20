public class UnitCircle extends ConsoleProgram
{
    
    public double r2 (double val) {
        val = val * 100;
        val = Math.round(val);
        val = val / (100.0);
        return val;
    } // rounds to 2 dec places
    
    public void run()
    {
        System.out.println("Radians: (cos, sin)");
        for (int i = 0; i < 8; i++) {
            double e = (Math.PI*i)/(4.0);
            double c = r2(Math.cos(e));
            double s = r2(Math.sin(e));
            System.out.println(e + ": " + c + ", " + s);
        }
        // Write your code here!
    }
}
