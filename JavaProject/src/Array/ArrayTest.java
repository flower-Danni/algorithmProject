package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
//        boolean isHasString =  ArrayUtil.getTwoDimensionalOrderedArray();
//        System.out.println(isHasString?"二维数组包含字符串":"二维数组不包含字符串");

//        sortArray();
//       System.out.println(ArrayUtil.getNumberN(10)); ;
       int[] nums1 = {1,2,2,3,4,8,8,8,9,9};
       int[] nums2 = {2};
       System.out.println(Arrays.toString(nums1));
//       System.out.println(Arrays.toString(ArrayUtil.twoSum(nums,9)));
        System.out.println(ArrayUtil.removeDuplicates(nums1));
    }


    private static void sortArray(){
        int[] nums = new int[]{4,3,0,9,5,8};
        System.out.println("原数据："+ Arrays.toString(nums));
        //冒泡排序
//        SortUtil.dubbleSort(nums);
        //插入排序
//        SortUtil.insetSort(nums);
        //归并排序
//        SortUtil.mergeSort(nums,0,nums.length - 1);
    }
}
