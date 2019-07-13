package bit_07_13;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:给定字符串，统计每个大写字母出现的次数
 * User:Mr.Du
 * Date:2019/7/13
 * Time:8:30
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            int[] arr = new int[26];
            for(int i = 0;i<str.length();i++){
                if(Character.isUpperCase(str.charAt(i))){
                    arr[str.charAt(i) - 65]++;
                }
            }
            for(int i = 0;i<arr.length;i++){
                char c = (char)(i + 65);
                System.out.println(c+":"+arr[i]);
            }
        }
    }
}

//DFJEIWFNQLEF0395823048+_+JDLSFJDLSJFKK

