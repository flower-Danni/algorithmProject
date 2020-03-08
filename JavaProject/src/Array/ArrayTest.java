package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
//        boolean isHasString =  ArrayUtil.getTwoDimensionalOrderedArray();
//        System.out.println(isHasString?"二维数组包含字符串":"二维数组不包含字符串");
        sortArray();
    }


    private static void sortArray(){
        int[] nums = new int[]{2,1,7,9,5,8};
        System.out.println("原数据："+ Arrays.toString(nums));
        //冒泡排序
//        SortUtil.dubbleSort(nums);
        //插入排序
        SortUtil.insetSort(nums);
    }
}
