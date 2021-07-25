class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n=a.length;
        int i = 0, j = 0, count =0;
        int b[] = new int[n - k + 1];
        ArrayList<Integer> ar = new ArrayList<>();
        while (j < n) {
            while(!ar.isEmpty() && a[j]>ar.get(ar.size()-1))
            {
                // System.out.print(a[j]+" ---> "+ar.get(ar.size()-1));
                ar.remove(ar.size()-1);
            }
            ar.add(ar.size(), a[j]);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                b[count] = ar.get(0);
                count++;
                if (ar.get(0) == a[i]) {
                    ar.remove(0);
                }
                j++;
                i++;
            }
        }
        return b;
    }
}
