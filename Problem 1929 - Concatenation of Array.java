class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int size = 2 * (nums.length);
        int[] result = new int[size];    

        for(int i=0; i<nums.length; i++)
        {
            result[i+nums.length] = nums[i];
        }
        for(int i=0; i<nums.length; i++)
        {
            result[i] = nums[i];
        }
        return result;
    }
}
