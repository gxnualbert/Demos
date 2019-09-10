package day06_类_对象封装_构造方法.demo04;

/**
 * @auther gxnualbert
 * @create 2019-09-10-8:39
 */


public class Demo02Student {

    public static void main(String[] args) {
        Student stu1 = new Student(); // 无参构造
        System.out.println("============");

        Student stu2 = new Student("赵丽颖", 20); // 全参构造
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        // 如果需要改变对象当中的成员变量数据内容，仍然还需要使用setXxx方法
        stu2.setAge(21); // 改变年龄
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());

    }

}
