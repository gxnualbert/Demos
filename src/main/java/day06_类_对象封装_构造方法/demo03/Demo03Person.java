package day06_类_对象封装_构造方法.demo03;

/**
 * @auther gxnualbert
 * @create 2019-09-10-8:32
 */


public class Demo03Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
//        person.age = -20; // 直接访问private内容，错误写法！
        person.setAge(20);
        person.show();
    }

}
