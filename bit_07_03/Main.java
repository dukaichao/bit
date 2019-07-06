package bit_07_03;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:输入ip转换成二进制，再转换成十进制，输入十进制，转换二进制在转换为ip地
 * User:Mr.Du
 * Date:2019-07-03
 * Time:11:30
 */
public class Main {
    public static void main(String[] args){
        System.out.println("1000,0011,1100,0000,0000,0000,0101,0000");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String string = sc.next();
            String[] str = string.split("\\.");
            StringBuilder sb = new StringBuilder();
            for(String s:str){
                sb.append(getStr(s).reverse());
            }
            System.out.println(Long.parseLong(sb.toString(),2));
            string = sc.next();
            sb = getStr1(string);
            System.out.println(sb.reverse().length());
            StringBuilder sb1 = new StringBuilder();
            for(int i = 0;i<32;i+=8){
                sb1.append(Long.parseLong(sb.substring(i,i+8),2)+".");
            }
            System.out.println(sb1.substring(0,sb1.length()-1));

        }

    }

    public static StringBuilder getStr1(String s){
        StringBuilder sb = new StringBuilder();
        Long x = Long.valueOf(s);
        for(int i = 0;i<32;i++){
            if(((x>>i)&1) == 0){
                sb.append(0);
            }else{
                sb.append(1);
            }
        }
        return sb;
    }

    public static StringBuilder getStr(String s){
        StringBuilder sb = new StringBuilder();
        Long x = Long.valueOf(s);
        for(int i = 0;i<8;i++){
            if(((x>>i)&1) == 0){
                sb.append(0);
            }else{
                sb.append(1);
            }
        }
        return sb;
    }

}
