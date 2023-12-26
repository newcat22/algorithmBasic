package array;

public class leetcode283clean {


    public void moveZeroes(int[] nums) {
        //设置慢指针，和快指针
        int slow = 0;
        //int fast = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            //如果是0什么都不做

            //如果是非0将值赋给慢指针
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }

        }

        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }

    }


}
