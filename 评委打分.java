package com.study;
 
import java.util.Scanner;
 
public class Test5 {
    public static void main(String[] args) {
        //1、定义一个动态初始化的数组，用于录入评委分数
        int[] scores = new int[6];
        //2、录入6个评委分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入第"+(i+1)+"个评委的打分：");
            int score = sc.nextInt();
            //3、把这个分数存入到数据的对应位置处
            scores[i] = score;
        }
 
        //4、遍历数组中的每个分数，找到最大值和最小值
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            //最大值
            if (scores[i] > max){
                max=scores[i];
            }
            //最小值
            if (scores[i] < min){
                min=scores[i];
            }
            //总分
            sum +=scores[i];
        }
 
        //5、统计平均分即可
        double result = (sum - max - min) * 1.0/(scores.length -2);
        System.out.println("选手最终得分："+result);
    }
}