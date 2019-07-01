package bit_07_01;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:求平均绩点，每门课的学分乘以对应绩点之和除以每门课学分之和
 * User:Mr.Du
 * Date:2019-07-01
 * Time:9:29
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] score = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                score[i] = sc.nextInt();
            }
            double sum = 0.0;
            int sumS = 0;
            for(int i = 0;i<n;i++){
                sum += getJd(score[i]) * arr[i];
                sumS += arr[i];
            }
            System.out.printf("%.2f",(sum/sumS));

        }
    }
    public static double getJd(int score){
        if(score>=90&&score<=100) return 4.0;
        else if(score>=85&&score<=89) return 3.7;
        else if(score>=82&&score<=84) return 3.3;
        else if(score>=78&&score<=81) return 3.0;
        else if(score>=75&&score<=77) return 2.7;
        else if(score>=72&&score<=74) return 2.3;
        else if(score>=68&&score<=71) return 2.0;
        else if(score>=64&&score<=67) return 1.5;
        else if(score>=60&&score<=63) return 1.0;
        return 0.0;
    }
}
