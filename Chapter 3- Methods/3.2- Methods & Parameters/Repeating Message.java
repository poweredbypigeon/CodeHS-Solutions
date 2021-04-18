public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        // Write some test function calls here!
    }
    
    public void printMessage(String lineOne, String lineTwo, int numLines)
    {
        for (int i = 0; i < numLines; i++) {
            if (i % 2 == 0) {
                System.out.println(lineOne);
            } else {
                System.out.println(lineTwo);
            }
        }
        // Start here!
    }
}
