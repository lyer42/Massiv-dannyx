public class Main {
    public static void main(String[] args) {
        // массивы данных
        int[] nums = new int[5];
        nums[0] = 52;
        nums[1] = 228;
        nums[2] = 42;
        nums[3] = 727;
        nums[4] = 1488;
        int res = nums[2] + nums[3];
        System.out.println(res);

        float[] nums2 = new float[] {5.0f, 6.52f, 14.88f};

        for (int i = 0; i < nums2.length; i++)
            System.out.println("Element: " + nums2[i]);
    }
}