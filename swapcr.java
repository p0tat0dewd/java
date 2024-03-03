public class swapcr {
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 69,96 };
        System.out.println("Before swapping: nums[0] = " + nums[0] + ", nums[1] = " + nums[1]);
        swap(nums);
        System.out.println("After swapping: nums[0] = " + nums[0] + ", nums[1] = " + nums[1]);
    }
}
