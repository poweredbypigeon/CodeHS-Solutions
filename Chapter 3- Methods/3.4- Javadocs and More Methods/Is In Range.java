/**
 * Returns true if num is within min and max (inclusive) and false if not.
 * 
 * @param num: the number to be compared to
 * @param min: The minimum number num can be in range with
 * @param max: The maximum number num can be in range with
 */
public boolean inRange(int num, int min, int max)
{
    return (min <= num) && (max >= num);
}
