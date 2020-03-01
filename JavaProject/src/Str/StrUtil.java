package Str;

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
}
