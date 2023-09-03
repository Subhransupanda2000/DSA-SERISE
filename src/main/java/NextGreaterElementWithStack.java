import java.util.Stack;

class NextGreaterElementRight {
    public static void main(String[] args) {
        int[] a = new int[4];
        a = new int[]{1, 2, 3, 4};
        int[] nge = Solve(a);
        display(nge);
    }

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a) {
            sb.append(val + " \n");
        }
        System.out.println(sb);
    }

    public static int[] Solve(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                nge[i] = -1;

            } else {
                nge[i] = st.peek();

            }
            st.push(arr[i]);
        }
        return nge;
    }
}