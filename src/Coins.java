public class Coins {
    public static int minSplit(int m) {

        if (m < 0) {
            System.out.print("Money can not be negative");
            return -1;
        }
        int[] arr = {1, 5, 10, 20, 50};
        int ans = 0;
        for (int i = 4; i >= 0; --i) {
            ans += m / arr[i];
            m -= (m / arr[i]) * arr[i];
        }
        return ans;
    }
}
