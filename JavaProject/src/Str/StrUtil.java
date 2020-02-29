package Str;

public class StrUtil {

    /**
     * 两个字符串是否为字母异或词
     * 异或 abcd
     */
    public static boolean getLetterXOr(String str1,String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int[] arr = new int[256];
        for (int i = 0 ; i < ch1.length ;i++){
            arr[ch1[i]]++;
        }
        int k = 0;
        while (ch2.length != k){
            arr[ch2[k]]--;
            if (arr[ch2[k]] < 0){
                return false;
            }
            k++;
        }
        return true;
    }
}
