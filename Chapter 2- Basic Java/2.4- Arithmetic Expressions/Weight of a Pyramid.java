public class Pyramid extends ConsoleProgram
{
    public void run()
    {
        double block = 2.5;
        int blocks = readInt("Enter the number of blocks used to build the pyramid: ");
        double weight = block * blocks;
        System.out.println("The pyramid weighs "+ weight + " tons");
    }
}
