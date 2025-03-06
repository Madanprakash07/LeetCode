class Solution 
{
    public boolean checkRecord(String s) 
    {
        int acount=0, lcount=0;
        int size = s.length();
        for(int i=0; i<size; i++)
        {
            char c = s.charAt(i);
            if(c == 'A')
            {
                acount++;
                if(acount >= 2)
                {
                    return false;
                }
            }
            if(c == 'L')
            {
                lcount++;
                if(lcount==3)
                {
                    return false;
                }
            }
            else
            {
                lcount = 0;
            }
        }
        return acount < 2 && lcount < 3;
    }
}
