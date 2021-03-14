public class Taffy extends ConsoleProgram
{
    public void run()
    {
        System.out.println("Starting Taffy Timer...");
        int temp = 0;
        while (temp < 270) {
            temp = readInt("Enter the temperature: ");
            if (temp < 270) {
                System.out.println("The mixture isn't ready yet.");
            } else {
                System.out.println("Your taffy is ready for the next step!");
            }
        }
    }
}
