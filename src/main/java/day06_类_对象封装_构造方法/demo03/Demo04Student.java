package day06_类_对象封装_构造方法.demo03;



/**
 * @auther gxnualbert
 * @create 2019-09-10-8:32
 */


public class Demo04Student {

    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们儿：" + stu.isMale());
    }

}


