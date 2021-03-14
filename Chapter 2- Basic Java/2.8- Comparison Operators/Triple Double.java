public class TripleDouble extends ConsoleProgram
{
    public void run()
    {
        int pts = readInt("How many pts?");
        int rbds = readInt("How many rbds?");
        int assists = readInt("How many assists?");
        boolean tripleDouble = ((pts >= 10) && (rbds >= 10)) && (assists >= 10);
        System.out.println("Got a Triple Double? " + tripleDouble);
    }
}
