class Solution 
{
    public int compress(char[] chars) 
    {
        StringBuilder str = new StringBuilder();
        int i=0;

        while(i<chars.length)
        {
            char current = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == current)
            {
                count++;
                i++;
            }

            str.append(current);

            if(count > 1)
            {
                str.append(count);
            }
        }        

        for(int k=0; k<str.length(); k++)
        {
            chars[k] = str.charAt(k);
        }   

        return str.length();
    }
}
