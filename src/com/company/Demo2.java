package com.company;

public class Demo2 {
    public static void main(String Args[]){
        for (int i =1;i<=4;i++){
            for(int j= 1;j<=4;j++){
                if(j==2  ){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
