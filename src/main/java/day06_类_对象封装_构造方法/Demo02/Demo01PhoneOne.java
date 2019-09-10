package day06_类_对象封装_构造方法.Demo02;

/**
 * @auther gxnualbert
 * @create 2019-09-10-8:23
 */


public class Demo01PhoneOne {

    public static void main(String[] args) {
        // 根据Phone类，创建一个名为one的对象
        // 格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("=========");

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand); // 苹果
        System.out.println(one.price); // 8388.0
        System.out.println(one.color); // 黑色
        System.out.println("=========");

        one.call("乔布斯"); // 给乔布斯打电话
        one.sendMessage(); // 群发短信
    }

}
