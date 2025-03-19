class SolutionM2 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[][] arr = new int[nums1.length + nums2.length][2]; 
        int x = 0,i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) { 
                arr[x][0] = nums1[i][0];
                arr[x][1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                arr[x][0] = nums1[i][0];
                arr[x][1] = nums1[i][1];
                i++;
            } else { 
                arr[x][0] = nums2[j][0];
                arr[x][1] = nums2[j][1];
                j++;
            }
            x++; 
        }
        while (i < nums1.length) {
            arr[x][0] = nums1[i][0];
            arr[x][1] = nums1[i][1];
            i++;
            x++;
        }
        while (j < nums2.length) {
            arr[x][0] = nums2[j][0];
            arr[x][1] = nums2[j][1];
            j++;
            x++;
        }
        int[][] newArr = new int[x][2];
        for (int k = 0; k < x; k++) {
            newArr[k][0] = arr[k][0];
            newArr[k][1] = arr[k][1];
        }
        return newArr;
    }
}
class March2 {
    public static void main(String[] args) {
        int nums1[][] = {{1, 2}, {2, 3}, {4, 5}};
        int nums2[][] = {{1, 4}, {3, 2}, {4, 1}};
        SolutionM2 s = new SolutionM2();
        int ans[][] = s.mergeArrays(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}
