public class CastingToDouble extends ConsoleProgram
{
    public void run()
    {
        int firstInt = readInt("First Int: ");
        int secondInt = readInt("Second Int: ");
        System.out.println(doubleDivision(firstInt, secondInt));
    }
    
    private double doubleDivision (int fInt, int sInt) {
        double fDouble = (double) fInt;
        return fDouble / sInt;
    }
}
