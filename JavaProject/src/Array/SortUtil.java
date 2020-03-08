package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortUtil {

    /**
     * 冒泡排序(从小到大进行排序)
     * 从数组的头开始，相邻的两个元素进行大小比较，直到比较到最后一个将最大或者最小的元素放到数组的尾部
     * 然后重复以上比较
     * 时间复杂度(最好的情况O(n) 最坏的情况O(n^2) (n-1)n/2)
     * 空间复杂度(O(1))不需要在重新创建空间所以空间复杂度为O(1)
     * 从小到大排序
     */
    public static void dubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {//一共多少趟
            for (int j = 0; j < array.length - i - 1; j++) {//每趟排序需要几次
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("冒泡排序之后的数据：" + Arrays.toString(array));
    }

    /**
     * 插入排序
     * 空间复杂度为O(1)
     * 时间复杂度 最好的情况O(n) 最快的情况O(n^2) (n-1)n/2
     */
    public static void insetSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {//比较多少趟
            int current = nums[i];//未进行分区的数据
            System.out.println("current:" + current);
            int j = i - 1;
            for (; j >= 0 && nums[j] > current; j--) {
                //进行数据的交换
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = current;
        }
        System.out.println("插入排序之后的数据：" + Arrays.toString(nums));
    }

    /**
     * 归并排序
     */
    public static void mergeSore(){
        
    }


    /**
     * 选择排序
     *
     * @param nums
     */
    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            if (i != index) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
            System.out.println("第" + i + "趟排序结果：" + Arrays.toString(nums));
        }
        System.out.println("选择排序之后的数据：" + Arrays.toString(nums));
    }
}

