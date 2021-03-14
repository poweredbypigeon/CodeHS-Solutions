public class Factorial extends ConsoleProgram
{
    public void run()
    {
        int fac = readInt("What number would you like to compute the factorial for?");
        int a = 1;
        for (int i = 1; i <= fac; i++) {
            a *= i; 
        }
        System.out.println(a);
    }
}
