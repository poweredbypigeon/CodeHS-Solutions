public class MovieRatings extends ConsoleProgram
{
    public void run()
    {
        double movieRating = readDouble("Please enter a movie rating: ");
        int floors = (int) (movieRating + 0.5);
        System.out.println("Rating rounded: " + floors);
        // Could have used an if statement on movieRating - floors.
        
    }
}
