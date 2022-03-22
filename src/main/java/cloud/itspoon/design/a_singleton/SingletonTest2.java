package cloud.itspoon.design.a_singleton;

/**
 * @author suxin
 * @package cloud.itspoon.design.a_singleton
 * @date 2022/3/16 23:47
 * @description 单例 懒汉式
 */
public class SingletonTest2 {

    public static void main(String[] args) {
        Apple apple1 = Apple.getInstance();
        Apple apple2 = Apple.getInstance();
        System.out.println(apple1 == apple2); // true

        Banana banana1 = Banana.getInstance();
        Banana banana2 = Banana.getInstance();
        System.out.println(banana1 == banana2); // true

    }

}

/**
 * 懒汉式：线程不安全创建方式，多线程的场景下会进入到为null的判断
 */
class Apple {

    private Apple() {
    }

    private static Apple instance;

    public static Apple getInstance() {
        if (instance == null) {
            instance = new Apple();
        }
        return instance;
    }
}

/**
 * 懒汉式：线程安全
 */
class Banana {

    private Banana() {
    }

    private static Banana instance;

    public static synchronized Banana getInstance() {
        if (instance == null) {
            instance = new Banana();
        }
        return instance;
    }
}

/**
 * 懒汉式：减小代码块颗粒度
 * 还是有线程不安全的问题，同第一个案例，多线程的场景下多个线程同时进入。
 */
class Orange {
    private Orange () {}

    private static Orange instance;

    public static Orange getInstance() {
        if (instance == null) {
            synchronized (Orange.class) {
                instance = new Orange();
            }
        }
        return instance;
    }
}

/**
 * 懒汉式：双重检查
 * 目前比较推荐的方式，在锁的前后进行检查
 */
class Tomato {

    private Tomato () {}

    private static Tomato instance;

    private static Tomato getInstance() {
        if (instance == null) {
            synchronized (Tomato.class) {
                if (instance == null) {
                    instance = new Tomato();
                }
            }
        }
        return instance;
    }
}