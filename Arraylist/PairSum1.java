public class PairSum1 {
    private static boolean pairSum1(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean twoPointerApproachPairSum1(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] + arr[r] == target)
                return true;
            else if (arr[l] + arr[r] < target)
                l++;
            else if (arr[l] + arr[r] > target)
                r--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 5;
        // System.out.println(pairSum1(arr, target));
        System.out.println(twoPointerApproachPairSum1(arr, target));
    }
}