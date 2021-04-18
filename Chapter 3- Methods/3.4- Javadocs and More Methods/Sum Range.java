public int sumFrom(int start, int end)
{
    int currentSum = 0;
    for (int i = start; i < end; i++) {
        currentSum += i;
    }
    return currentSum;
}
