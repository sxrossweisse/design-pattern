package cloud.itspoon.design.singleton;

/**
 * @author suxin
 * @package cloud.itspoon.design.singleton
 * @date 2022/3/16 23:26
 * @description 单例模式：饿汉式
 */
public class SingletonTest1 {

    public static void main(String[] args) {
        Student instance1 = Student.getInstance();
        Student instance2 = Student.getInstance();
        System.out.println(instance1 == instance2); // true

        Teacher teacher1 = Teacher.getInstance();
        Teacher teacher2 = Teacher.getInstance();
        System.out.println(teacher1 == teacher2); // true
    }

}

/**
 * 静态常量形式
 */
class Student {
    private Student() {

    }

    private final static Student instance = new Student();

    public static Student getInstance() {
        return instance;
    }
}

/**
 * 静态代码块形式
 */
class Teacher {
    private Teacher() {
    }

    private static Teacher instance;

    static {
        instance = new Teacher();
    }

    public static Teacher getInstance() {
        return instance;
    }
}