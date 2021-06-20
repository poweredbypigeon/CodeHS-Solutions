public class HowFarAway extends ConsoleProgram
{
    public void run()
    {
        double latitude1 = readDouble("Enter the latitude of the starting location: ");
        double longitude1 = readDouble("Enter the longitude of the starting location: ");
        double latitude2 = readDouble("Enter the latitude of the ending location: ");
        double longitude2 = readDouble("Enter the longitude of the ending location: ");
        GeoLocation s = new GeoLocation(latitude1, longitude1);
        GeoLocation e = new GeoLocation(latitude2, longitude2);
        double distance = s.distanceFrom(e);
        System.out.println("The distance is " + distance + " miles.");
        // your code here.
    }
}
