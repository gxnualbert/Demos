package day06_类_对象封装_构造方法.demo04;

/**
 * @auther gxnualbert
 * @create 2019-09-10-8:37
 */


public class Demo01Person {

    public static void main(String[] args) {
        Person person = new Person();
        // 设置我自己的名字
        person.name = "王健林";
        person.sayHello("王思聪");

        System.out.println(person); // 地址值
    }

}
