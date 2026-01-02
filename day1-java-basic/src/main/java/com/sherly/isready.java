package com.sherly;

public class isready {
    public static void main(String[] args) {
        int age = 24;
        double height =175;
        String name ="sherly";
        boolean isReady =true;

        System.out.println("我是"+name);
        System.out.println("我今年"+age+"岁");

        if (isReady){
            System.out.println("状态已就位：");
        }else{
            System.out.println("状态未就位：");
        }

        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"x"+j+"="+(i*j)+"\t");
            }
            System.out.println(); // 每行结束后换行
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
