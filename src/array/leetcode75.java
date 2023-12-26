package array;

public class leetcode75 {
    public void sortColors(int[] nums) {

        //初始化：三个指针，index指针，左指针，右指针。注意初始化的时候，算法流程是还没有开始的，对应的指针指向的元素是没有开始操作的。

        //left 指向数组的开始的位置，它指向的位置左侧都是0
        int left = 0;

        //right 指向数组的结束的位置，它指向的位置右侧都是2
        int right = nums.length - 1;

        //index指向数组的开始位置
        int index = 0;

        //index向后移动，当它越过right时跳出循环，不需要再判断了

        //因为此时说明index右侧的都已经是2

        while (index <= right) {

            //获取当前的元素值
            int cur = nums[index];
            //如果index位置上的元素值为0
            if (cur == 0) {
                //说明是红色，要放在最前面去

                //最前面的那个元素被left指着，所以让index指向的元素和left指向位置上的元素进行交换
                swap(nums, left, index);
                //index可以向后移动  思考这里一定要移动吗？不移动是不是也对
                index++;

                //left可以向右移动，它的左侧区域都是0
                left++;

                //如果index位置上的元素值为1
            } else if (cur == 1) {
                //说明是白色，就应该放在中间，不用管它，继续移动index
                index++;

                //如果index位置上的元素为2
            } else if (cur == 2) {
                //说明是蓝色，要放在最后面
                //所以让index指向的元素和right指向位置上的元素进行交换
                swap(nums, right, index);
                //right可以向左移动，它的右侧区域都是2
                right--;
            }
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
        nums[j] = temp;
    }
}
