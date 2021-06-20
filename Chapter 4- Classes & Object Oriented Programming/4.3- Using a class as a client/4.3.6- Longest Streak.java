public class LongestStreak extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
        Randomizer r = new Randomizer();
        int longestStreak = 0;
        int headStreak = 0;
        for (int i = 0; i < FLIPS; i++) {
            int res = r.nextInt(1, 2);
            if (res == 1) {
                System.out.println("Tails");
                headStreak = 0;
            } else if (res == 2) {
                System.out.println("Heads");
                headStreak++;
            }
            if (headStreak > longestStreak) {
                longestStreak = headStreak;
            }
        }
        System.out.println("Longest streak of heads: " + longestStreak);
    }
}
