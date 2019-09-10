package day08_String_static_Arrays_Math.demo03;

/**
 * @auther gxnualbert
 * @create 2019-09-10-12:38
 */



/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 */
public class Demo01StaticField {

    public static void main(String[] args) {

        Student two = new Student("黄蓉", 16);
        two.room = "101教室";  //静态变量，一次赋值之后，所有的对象都共享这个数，所以下面所有的学生，都在11教师
        System.out.println("姓名：" + two.getName()
                + "，年龄：" + two.getAge() + "，教室：" + two.room
                + "，学号：" + two.getId());

        Student one = new Student("郭靖", 19);
        System.out.println("姓名：" + one.getName()
                + "，年龄：" + one.getAge() + "，教室：" + one.room
                + "，学号：" + one.getId());
        Student three = new Student("郭sdfas靖", 39);

        System.out.println("姓名：" + three.getName()
                + "，年龄：" + three.getAge() + "，教室：" + three.room
                + "，学号：" + three.getId());

        Student four = new Student("sds郭asdfw靖", 21);
        System.out.println("姓名：" + four.getName()
                + "，年龄：" + four.getAge() + "，教室：" + four.room
                + "，学号：" + four.getId());

        Student five = new Student("asdfasdfe", 17);
        System.out.println("姓名：" + five.getName()
                + "，年龄：" + five.getAge() + "，教室：" + five.room
                + "，学号：" + five.getId());
    }

}
