class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result=new ArrayList<>();
        int low1 = String.valueOf(Math.min(low,high)).length();
        int high1 = String.valueOf(Math.max(low,high)).length();
        String s="123456789";
        for(int i=low1;i<=high1;i++)
        {
            for(int j=0;j<10-i;j++)
            {
                int number=Integer.parseInt(s.substring(j,j+i));
                if(number>=low && number<=high)
                {
                    result.add(number);
                }
            }
        }
        return result;
    }
}
