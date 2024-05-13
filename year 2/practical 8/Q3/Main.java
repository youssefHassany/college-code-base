public class Main {
    public static void main(String[] args) {
        int[] nums = { 7, 10, 5, 3, 6, 2, 0, 1, 8, 4 };

        System.out.println("Sum = " + getTotal(nums)); // 46
    }

    public static int getTotal(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;

    }
}
