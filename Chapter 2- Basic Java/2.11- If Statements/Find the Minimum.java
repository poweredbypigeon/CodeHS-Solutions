public class FindMinimum extends ConsoleProgram
{
    public void run()
    {
        int minimum = 9999999; // the minimum has to go down, so it starts off as high as possible.
        // Alternatively just set minimum = x1 instead of the 1st if statement.
        int x1 = readInt("Enter first number: ");
        if (minimum > x1) {
            minimum = x1;
        }
        int x2 = readInt("Enter second number: ");
        if (minimum > x2) {
            minimum = x2;
        }
        int x3 = readInt("Enter third number: ");
        if (minimum > x3) {
            minimum = x3;
        }
        System.out.println(minimum);
    }
}
