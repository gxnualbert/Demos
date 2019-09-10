package day06_类_对象封装_构造方法.demo03;

/**
 * @auther gxnualbert
 * @create 2019-09-10-8:33
 */


/*
对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
 */
public class Student {

    private String name; // 姓名
    private int age; // 年龄
    private boolean male; // 是不是爷们儿

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}
