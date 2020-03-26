package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayUtil {


    /**
     * 二维有序数组
     * 二维有序数组实现查找某一个数是否存在
     */
    public static boolean getTwoDimensionalOrderedArray() {
        int[][] array = {
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {4, 5, 10, 11},
                {6, 7, 12, 13},
        };
        int target = 10;
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            System.out.println(array[row][col]);
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }


    /**
     * 1,1,2,3,5,8,13,21,34
     * f(n) = f(n-1) + f(n-2)
     *
     * @return
     */
    static  int i = 0;

    public static int getNumberN(int n) {
        int result = 1;
        if (n > 2) {
            return getNumberN(n - 1) + getNumberN(n - 2);
        }
        i++;
        System.out.println("次数："+ i);
        return result;
    }

    /**
     * 给定一个整数数组 nums 和一个目标值 target，
     * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0 ;i < nums.length ;i++){
            if (hashMap.containsKey(nums[i])){
                return new int[]{hashMap.get(nums[i]),i};
            }
            hashMap.put(target - nums[i],i);
        }
        return null;
    }

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * 双指针法
     *  {1,1,2,3,4,8,8,8,9,9}
     */
    public static int removeDuplicates(int[] nums1){
        int j = 0;
        for (int i = 1 ; i < nums1.length ; i++){
            if (nums1[j] != nums1[i]){
                System.out.println(nums1[i]);
                j++;
                nums1[j] = nums1[i];
            }
        }
        System.out.println(Arrays.toString(nums1));
        return j+1;
    }

    public static int removeDuplicates2(int[] nums1){
        int len = 1;
        for (int i = 1 ; i < nums1.length ; i++){
            if (nums1[i] != nums1[i-1]){
                nums1[len++] = nums1[i];
            }
        }
        System.out.println(Arrays.toString(nums1));
        return len;
    }


}
