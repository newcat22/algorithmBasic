package array;

public class leetcode75clean {
    public void sortColors(int[] nums) {

        //初始化：三个指针，index指针，左指针，右指针。注意初始化的时候，算法流程是还没有开始的，对应的指针指向的元素是没有开始操作的。

        //left 指向数组的开始的位置，它指向的位置左侧都是0
        int left = 0;

        //right 指向数组的结束的位置，它指向的位置右侧都是2
        int right = nums.length - 1;

        //index指向数组的开始位置
        int index = 0;

        while (index <= right) {

            //获取当前的元素值
            int cur = nums[index];

        }

    }

    /**
     * 交换nums数组中下标i和下标j两个元素的值
     * 通过中间变量，交换两个元素的值，num[i]的值变为了num[j]的值，num[j]的值变为了num[i]的值
     *
     * @param nums
     * @param i
     * @param j
     */
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = nums[temp];
    }
}
