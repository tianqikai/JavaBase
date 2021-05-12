package javabase.datastructures.sort;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Maobao {
    public static void main(String[] args) {
//        System.out.println("请输入排序个数：");
//        Scanner scanner=new Scanner(System.in);
//        int num= scanner.nextInt();
//
//        System.out.println("请输入数组数据");
//        int[] array=new int[num];
//        for (int i=0;i<num;i++){
//            array[i]=scanner.nextInt();
//        }
        int[] array={1,2,5,3,4,6,7,9,80,12,34};
//        System.out.println("数组信息："+ );
        System.out.println("---------------------------------------------");
        int min=0;
        for (int i=0;i<array.length;i++){
            min=array[i];
            for (int j=i;j<array.length;j++){
                if(min>array[j]){
                    min=array[j];
                }else{
                    continue;
                }
            }
            array[i]=min;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("排序结果："+ Arrays.toString(array) );
    }
}
