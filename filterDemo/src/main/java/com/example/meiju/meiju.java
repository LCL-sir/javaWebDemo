package com.example.meiju;

/*
*
*    Java 枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一个年的 12 个月份，一个星期的 7 天，方向有东南西北等。
*
*    Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割。
*
*   在类的里面/外面都可以声明
* */

enum number1 {
    apple,bunana,orgain
}

public class meiju {
    enum Color {
        red,green,blue
    }

    public static void main(String[] args) {
        Color a= Color.red;
        System.out.println(a);
        number1 b = number1.apple;
        System.out.println(b);
    }
}
