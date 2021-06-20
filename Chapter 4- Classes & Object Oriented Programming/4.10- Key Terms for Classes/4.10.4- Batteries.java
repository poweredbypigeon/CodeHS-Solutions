public class Battery
{
    private double voltage;
    
    public static double totalVoltage;
    public static int numOfBatteries;
    
    public Battery(double voltage)
    {
        this.voltage = voltage;
        totalVoltage += voltage;
        numOfBatteries += 1;
    }
    
    public double getVoltage()
    {
        return this.voltage;
    }
}
