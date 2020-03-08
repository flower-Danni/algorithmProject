package Array;

public class ArrayUtil {


    /**
     * 二维有序数组
     * 二维有序数组实现查找某一个数是否存在
     */
    public static boolean getTwoDimensionalOrderedArray(){
        int[][] array = {
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {4, 5, 10, 11},
                {6, 7, 12, 13},
        };
       int target = 10;
       int row = 0;
       int col = array[0].length - 1;
       while (row < array.length && col >= 0){
           System.out.println(array[row][col]);
           if (array[row][col] == target){
               return true;
           }else if (array[row][col] < target){
               row++;
           }else {
               col--;
           }
       }
       return false;
    }
}
