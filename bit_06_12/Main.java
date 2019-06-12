package bit_06_12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-06-12
 * Time:19:37
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int count = 0;
            int count1 = 0;
            String s = sc.next();
            String ss = sc.next();
            int[] arr = new int[62];
            int[] arr1 = new int[62];
            for(int i = 0;i<s.length();i++){
                if(Character.isLowerCase(s.charAt(i))){
                    arr[s.charAt(i)-'a'+10] += 1;
                }else if(Character.isUpperCase(s.charAt(i))){
                    arr[s.charAt(i) - 'A' + 36] += 1;
                }else{
                    arr[s.charAt(i)-'0'] += 1;
                }
            }
            for(int i = 0;i<ss.length();i++){
                if(Character.isLowerCase(ss.charAt(i))){
                    arr1[ss.charAt(i)-'a'+10] += 1;
                }else if(Character.isUpperCase(ss.charAt(i))){
                    arr1[ss.charAt(i) - 'A' + 36] += 1;
                }else{
                    arr1[ss.charAt(i)-'0'] += 1;
                }
            }

            for(int i = 0;i<arr.length;i++){
                if(arr[i]<arr1[i]){
                    count1 += arr1[i] - arr[i];
                }else{
                    count += arr[i] - arr1[i];
                }
            }
            if(count1 == 0){
                System.out.println("Yes "+count);
            }else{
                System.out.println("No "+count1);
            }
        }
    }
}/*
ppRYYGrrYBR2258<br/>YrR8RrY*/