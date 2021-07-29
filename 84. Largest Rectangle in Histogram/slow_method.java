class Solution {
    public int largestRectangleArea(int[] a) {
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            int li=i;
            int ri=i;
            int area=0;
            while(li>=0 && a[li]>=a[i])
            {
                li--;
            }
            while(ri<a.length && a[ri]>=a[i])
            {
                ri++;
            }
            area=a[i]*(ri-li-1);
            if(area>max)
            {
                max=area;
            }
        }
        return max;
    }
}
