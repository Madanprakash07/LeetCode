class Solution 
{
    public int[] sortByBits(int[] arr) 
    {
        int size = arr.length;

        int[][] NumberandBit = new int[size][2];

        for (int i = 0; i < size; i++) 
        {
            NumberandBit[i][0] = arr[i]; 
            NumberandBit[i][1] = Integer.bitCount(arr[i]);
        }

        for (int i = 0; i < size - 1; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
                if (NumberandBit[i][1] > NumberandBit[j][1] || (NumberandBit[i][1] == NumberandBit[j][1] && NumberandBit[i][0] > NumberandBit[j][0])) 
                {
                    int[] temp = NumberandBit[i];
                    NumberandBit[i] = NumberandBit[j];
                    NumberandBit[j] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) 
        {
            arr[i] = NumberandBit[i][0];
        }

        return arr;
    }
}
