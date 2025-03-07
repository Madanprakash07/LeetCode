class Solution 
{
    public String removeDuplicates(String s) 
    {
        int size = s.length();
        char[] result = new char[size];
        
        int j=0;
        for(int i=0; i<size; i++)
        {
            char temp = s.charAt(i);
            if(j>0 && temp == result[j-1])
            {
                j--;
                result[j] = '\0';
            }
            else
            {
                result[j++] = temp;
            }
        }

        return new String(result, 0, j);
    }
}
