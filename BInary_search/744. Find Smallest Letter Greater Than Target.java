class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int N=letters.length;
        int high=N-1;
        int mid=0;
        while(!(low>high))
        {
            mid=(low+high)/2;
            if(letters[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return letters[low%N];
    }
}
