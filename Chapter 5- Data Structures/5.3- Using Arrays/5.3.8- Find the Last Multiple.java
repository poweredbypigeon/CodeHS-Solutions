public int findMultipleOfThree(int[] arr)
{
    int lindex = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 3 == 0) {
            lindex = i;
        }
    }
    return lindex;
}
