public class AddFractions extends ConsoleProgram
{
    public void run()
    {
        int a = readInt("What is the numerator of the first fraction?");
        int b = readInt("What is the denominator of the first fraction?");
        int c = readInt("What is the numerator of the second fraction?");
        int d = readInt("What is the denominator of the second fraction?");
        int num = (a*d) + (b*c);
        int dem = (b*d);
        System.out.println("The sum of " + a + "/" + b + " + " + c + "/" + d + " = " + num + "/" + dem);
    }
}
/* 
     a         c        ad + bc
    ___   +   ___    =   ______
     b         d           bd

*/
