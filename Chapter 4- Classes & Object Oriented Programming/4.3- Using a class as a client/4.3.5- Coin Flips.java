public class CoinFlips extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
        Randomizer r = new Randomizer();
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < 100; i++) {
            int res = r.nextInt(1, 2);
            if (res == 1) {
                System.out.println("Tails");
                tails++;
            } else if (res == 2) {
                System.out.println("Heads");
                heads++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        double h = (double) heads / 100.0;
        double t = (double) tails / 100.0;
        System.out.println("% heads " + h);
        System.out.println("% tails " + t);
    }
}
