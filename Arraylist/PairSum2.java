public class PairSum2 {

    private static boolean twoPointerApproachPairSum2(int[] arr, int target) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        // find the breaking point and initialize l and r
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                r = i;
                l = i + 1;
            }
        }

        while (l != r) {
            if (arr[l] + arr[r] == target)
                return true;
            else if (arr[l] + arr[r] < target)
                l = (l + 1) % n;
            else
                r = (n + r - 1) % n;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 15, 6, 8, 9, 10 };
        int target = 16;
        System.out.println(twoPointerApproachPairSum2(arr, target));
    }
}