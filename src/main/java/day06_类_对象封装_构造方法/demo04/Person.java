package day06_类_对象封装_构造方法.demo04;

/**
 * @auther gxnualbert
 * @create 2019-09-10-8:36
 */


/*
当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量。
如果需要访问本类当中的成员变量，需要使用格式：
this.成员变量名

“通过谁调用的方法，谁就是this。”
 */
public class Person {

    String name; // 我自己的名字

    // 参数name是对方的名字
    // 成员变量name是自己的名字
    public void sayHello(String name) {
        System.out.println(name + "，你好。我是" + this.name);
        System.out.println(this);   //这个打印主要是为了说明谁是this， 跟外面main中打印的一起看。
    }

}
