public class ThreeStrings extends ConsoleProgram
{
    public void run()
    {
        String s1 = readLine("s1");
        String s2 = readLine("s2");
        String s3 = readLine("s3");
        String s4 = s1 + s2;
        if (s4.equals(s3)) 
        {
            System.out.println(s1 + " + " + s2 + " is equal to " + s3 + "!");
        }
        else
        {
            System.out.println(s1 + " + " + s2 + " is not equal to " + s3 + "!");
        }
    }
}
