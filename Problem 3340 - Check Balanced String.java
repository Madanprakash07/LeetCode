class Solution {
    public boolean isBalanced(String num) 
    {
        int size = num.length();
        int n1=0;
        int n2=0;
        for(int i=0; i<size; i=i+2)
        {
            n1 += Character.getNumericValue(num.charAt(i));
            if(i + 1 < size)
            {
                n2 += Character.getNumericValue(num.charAt(i + 1));
            }
        }

        return n1==n2;
    }
}
