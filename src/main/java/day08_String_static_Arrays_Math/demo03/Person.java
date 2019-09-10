package day08_String_static_Arrays_Math.demo03;

/**
 * @auther gxnualbert
 * @create 2019-09-10-13:04
 */



public class Person {

    static {
        System.out.println("静态代码块执行！");
    }

    public Person() {
        System.out.println("构造方法执行！");
    }

}
