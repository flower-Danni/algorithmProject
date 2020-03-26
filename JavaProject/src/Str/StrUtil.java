package Str;

import sun.tools.jconsole.JConsole;

import java.util.Arrays;

public class StrUtil {

    /**
     * 两个字符串是否为字母异或词
     * 异或 abcd
     */
    public static boolean getLetterXOr(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int i1 = arr[str2.charAt(i) - 'a']--;
            if (i1 < 0) {
                return false;
            }
        }

//        int k = 0;
//        while (ch2.length != k) {
//            arr[ch2[k] - 'a']--;
//            if (arr[ch2[k]- 'a'] < 0) {
//                return false;
//            }
//            k++;
//        }
        return true;
    }

    /**
     * 字符串反转
     * 方法一 时间复杂度为O(n)
     */
    public static String getReserveLetter(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char letter = str.charAt(length - i - 1);
            stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }

    /**
     * 字符串反转
     * 方法二 时间复杂度为O(n/2)
     */
    public static String getReserveLetter2(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int length = str.length();
        char[] arr = str.toCharArray();
        int head = 0;
        int foot = length - 1;
        int count = 0;
        for (;head<foot; head++,foot--) {
            count++;
            System.out.println("运行次数："+count);
            char temp = arr[head];
            arr[head] = arr[foot];
            arr[foot] = temp;
        }
        return Arrays.toString(arr);
    }

    public static int getReserveLetter3(int num){
        if (num > 0){
           return reserveNum(num);
        }else {
           return -reserveNum(Math.abs(num));
        }
    }

    private static int reserveNum(int num){
        int result = 0;
        while (true){
            int n = num%10;
            result = result*10+n;
            num = num/10;
            if (num == 0){
                return result;
            }
        }
    }

    public static int stringToInt(String str){
        if (str == null || str.isEmpty()){
            return 0;
        }
        char[] chars = str.toCharArray();
        int result = 0;
        for (int  i = chars.length-1 ; i >= 0 ;i--){
            result = result * 10 + (chars[i] - '0');
            System.out.println("结果："+ result);
        }
        return result;
    }


}
