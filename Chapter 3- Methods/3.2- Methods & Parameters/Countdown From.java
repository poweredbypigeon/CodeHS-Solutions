public class Countdown extends ConsoleProgram
{
    public void run()
    {
        countdownFrom(10, 5);
    }
    
    public void countdownFrom(int start, int stop)
    {
        for (int i = start; i >= stop; i--) {
            System.out.println(i);
        }
        // Your code here
    }
}
