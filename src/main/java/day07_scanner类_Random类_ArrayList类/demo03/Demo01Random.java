package day07_scanner类_Random类_ArrayList类.demo03;

/**
 * @auther gxnualbert
 * @create 2019-09-10-9:31
 */


import java.util.Random;

/*
Random类用来生成随机数字。使用起来也是三个步骤：

1. 导包
import java.util.Random;

2. 创建
Random r = new Random(); // 小括号当中留空即可

3. 使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
实际上代表的含义是：[0,3)，也就是0~2
 */
public class Demo01Random {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是：" + num);
//        获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
        int num2= r.nextInt(190);
        System.out.println(num2);
    }

}
