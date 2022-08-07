public class HW1_Task2 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 3;
        int i = 0;
        int k = nums.length;
        while (i < k) {
            if (nums[i] == val) {
                nums[i] = nums[k-1];
                k--;
            }else{
                i++;
            }

        }
        System.out.println(k);
        Homework1.printArray(nums);

    }
}
