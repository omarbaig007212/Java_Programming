class Solution {
    public int largestRectangleArea(int[] a) {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int nl[] = new int[n];
        int nr[] = new int[n];
        nl[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && a[st.peek()] >= a[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nl[i] = -1;
            } else {
                nl[i] = st.peek();
            }
            st.push(i);
        }
        st = new Stack<>();
        st.push(n - 1);
        nr[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && a[st.peek()] >= a[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nr[i] = n;
            } else {
                nr[i] = st.peek();
            }
            st.push(i);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int area = a[i] * (nr[i] - nl[i] - 1);
            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}
