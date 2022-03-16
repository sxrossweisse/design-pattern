package cloud.itspoon.design.singleton;

/**
 * @author suxin
 * @package cloud.itspoon.design.singleton
 * @date 2022/3/17 0:27
 * @description 单例模式：静态内部类。
 * 思路为当类加载的时候，静态内部类不会被加载，当调用的时候才会去创建对象，既达到了懒加载的效果，又避免的多线程的问题
 */
public class SingletonTest3 {

    public static void main(String[] args) {
        Person person1 = Person.getInstance();
        Person person2 = Person.getInstance();
        System.out.println(person1 == person2);
    }

}

class Person {

    private Person() {

    }

    private static class SomeBody {
        public static final Person INSTANCE = new Person();
    }

    public static Person getInstance() {
        return SomeBody.INSTANCE;
    }
}
