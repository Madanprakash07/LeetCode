class Solution 
{
    public void reverseString(char[] s) 
    {
        int size = s.length;
        int ind = 0;
        for(int i=0; i<size/2; i++)
        {   
            char temp = s[i];
            s[i] = s[size-i-1];
            s[size-i-1] = temp;
        }   
    }
}
