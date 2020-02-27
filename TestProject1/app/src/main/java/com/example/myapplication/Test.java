package com.example.myapplication;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
//        String contentStr = "aaa,abc,aa,abc,ad,ad,aaa,aaa,aaa,abc,aa";
//        sortData(contentStr);

        String str1 = "abcbc";
        String str2 = "abc";
        int length = minLength(str1, str2);
        System.out.println("length："+ length);

    }

    private static void sortData(String originalStr) {
        String[] original = originalStr.split(",");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < original.length; i++) {
            String str = original[i];
            if (hashMap.containsKey(str)) {
                hashMap.put(str, hashMap.get(str) + 1);
            } else {
                hashMap.put(str, 1);
            }
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println(list.toString());
    }


    public static int minLength(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < str2.length()) {
            return 0;
        }
        char[] chas1 = str1.toCharArray();
        char[] chas2 = str2.toCharArray();
        int[] arr = new int[256];

        for (int i = 0; i < chas2.length; i++) {
            //讲chas2出现的每个字符的次数保存在数组arr里面
            arr[chas2[i]]++;
        }
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int match = chas2.length;//最多匹配次数
        while (right != chas1.length) {
            arr[chas1[right]]--;
            if (arr[chas1[right]] >= 0) {
                System.out.println("内容解析：" + chas1[right] +"==="+match);
                //表示将chas2的内容都遍历并且已经匹配完成
                match--;
            }
            if (match == 0) {
                //只要进入该方法就表示chas2在chas1中的所有数据都已经判断完毕
                while (arr[chas1[left]] < 0) {
                    //表示chas1第一个数字存在的位置即left值
//                    arr[chas1[left++]]++;
                    arr[chas1[left]]++;
                    left++;
                }
                System.out.println("数据2："+right + "=="+left);
                //该方法计算的是最后一个数据到第一个数据的长度
                minLen = Math.min(minLen, right - left + 1);
                match++;
                break;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
