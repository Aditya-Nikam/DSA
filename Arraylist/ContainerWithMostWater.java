
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] ht = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int maxWater = 0;
        // // brute force
        // for(int i=0;i<ht.length;i++){
        // for(int j = i+1;j<ht.length;j++){
        // int w = j-i;
        // int h = Math.min(ht[i],ht[j]);
        // maxWater = Math.max(maxWater, h*w);
        // }
        // }
        // System.out.println(maxWater);

        int l = 0;
        int r = ht.length - 1;
        while (l < r) {
            int w = r - l;
            int h = Math.min(ht[l], ht[r]);
            maxWater = Math.max(maxWater, w * h);
            if (ht[l] < ht[r])
                l++;
            else
                r--;
        }
        System.out.println(maxWater);
    }
}
