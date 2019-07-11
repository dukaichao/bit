package bit_07_11;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/7/11
 * Time:23:56
 */
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String second=sc.next();
        first=first.toUpperCase();
        second=second.toUpperCase();
        for(int i=0;i<second.length();i++){
            first=first.replace(second.charAt(i)+"","");
        }
        String coutStr="";
        for(int i=0;i<first.length();i++){
            if(coutStr.contains(first.charAt(i)+"")){
                continue;
            }else{
                System.out.print(first.charAt(i));
                coutStr+=first.charAt(i);
            }
        }
        System.out.println();
    }
}
